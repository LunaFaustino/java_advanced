package br.com.fiap.sprint1.service;

import br.com.fiap.sprint1.models.Clinica;

import java.util.List;

public interface ClinicaService {

    Clinica salvarClinica(Clinica clinica);;
    Clinica atualizarClinica(int id,Clinica clinica);
    void deletarClinica(int id);
    Clinica obterClinicaPorId(int id);
    List<Clinica> listarTodasClinicas();
}
