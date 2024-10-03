package br.com.fiap.sprint1.service;

import br.com.fiap.sprint1.models.Paciente;

import java.util.List;

public interface PacienteService {

    Paciente salvarPaciente(Paciente paciente);
    Paciente atualizarPaciente(int id,Paciente paciente);
    void deletarPaciente(int id);
    Paciente obterPacientePorId(int id);
    List<Paciente> listarTodosPacientes();
}
