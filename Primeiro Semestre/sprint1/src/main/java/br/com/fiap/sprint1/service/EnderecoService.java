package br.com.fiap.sprint1.service;

import br.com.fiap.sprint1.models.Endereco;

import java.util.List;

public interface EnderecoService {

    Endereco salvarEndereco(Endereco endereco);
    Endereco atualizarEndereco(int id,Endereco endereco);
    void deletarEndereco(int id);
    Endereco obterEnderecoPorId(int id);
    List<Endereco> listarTodosEnderecos();
}
