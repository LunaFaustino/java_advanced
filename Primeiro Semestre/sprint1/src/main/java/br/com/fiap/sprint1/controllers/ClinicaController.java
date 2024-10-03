package br.com.fiap.sprint1.controllers;

import br.com.fiap.sprint1.models.Clinica;
import br.com.fiap.sprint1.service.ClinicaService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clinica")
public class ClinicaController {

    private final ClinicaService clinicaService;

    public ClinicaController(ClinicaService clinicaService) {
        this.clinicaService = clinicaService;
    }

    @PostMapping
    public ResponseEntity<Clinica> criarClinica(@Valid @RequestBody Clinica clinica) {
        Clinica novaClinica = clinicaService.salvarClinica(clinica);
        return ResponseEntity.ok(novaClinica);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Clinica> buscarClinica(@PathVariable int id) {
        Clinica clinica = clinicaService.obterClinicaPorId(id);
        if (clinica != null) {
            return ResponseEntity.ok(clinica);
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping
    public ResponseEntity<List<Clinica>> listarClinicas() {
        List<Clinica> clinicas = clinicaService.listarTodasClinicas();
        return ResponseEntity.ok(clinicas);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Clinica> atualizarClinica(@PathVariable int id, @Valid @RequestBody Clinica clinica) {
        Clinica clinicaAtualizada = clinicaService.atualizarClinica(id, clinica);
        return ResponseEntity.ok(clinicaAtualizada);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarClinica(@PathVariable int id) {
        clinicaService.deletarClinica(id);
        return ResponseEntity.noContent().build();
    }
}
