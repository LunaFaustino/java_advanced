package br.com.fiap.sprint1.service;

import br.com.fiap.sprint1.models.Dentista;

import java.util.List;

public interface DentistaService {

    Dentista salvarDentista(Dentista dentista);
    Dentista atualizarDentista(int id,Dentista dentista);
    void deletarDentista(int id);
    Dentista obterDentistaPorId(int id);
    List<Dentista> listarTodosDentistas();
}
