package br.com.fiap.sprint1.controllers;

import br.com.fiap.sprint1.models.Dentista;
import br.com.fiap.sprint1.service.DentistaService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dentista")
public class DentistaController {

    private final DentistaService dentistaService;

    public DentistaController(DentistaService dentistaService) {
        this.dentistaService = dentistaService;
    }

    @PostMapping
    public ResponseEntity<Dentista> criarDentista(@Valid @RequestBody Dentista dentista) {
        Dentista novoDentista = dentistaService.salvarDentista(dentista);
        return ResponseEntity.ok(novoDentista);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Dentista> buscarDentista(@PathVariable int id) {
        Dentista dentista = dentistaService.obterDentistaPorId(id);
        if (dentista != null) {
            return ResponseEntity.ok(dentista);
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping
    public ResponseEntity<List<Dentista>> listarDentistas() {
        List<Dentista> dentistas = dentistaService.listarTodosDentistas();
        return ResponseEntity.ok(dentistas);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Dentista> atualizarDentista(@PathVariable int id, @Valid @RequestBody Dentista dentista) {
        Dentista dentistaAtualizado = dentistaService.atualizarDentista(id, dentista);
        return ResponseEntity.ok(dentistaAtualizado);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Dentista> deletarDentista(@PathVariable int id) {
        dentistaService.deletarDentista(id);
        return ResponseEntity.noContent().build();
    }
}
