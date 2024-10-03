package br.com.fiap.sprint1.service.impl;

import br.com.fiap.sprint1.models.Endereco;
import br.com.fiap.sprint1.repositories.EnderecoRepository;
import br.com.fiap.sprint1.service.EnderecoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnderecoServiceImpl implements EnderecoService {

    private final EnderecoRepository enderecoRepository;

    public EnderecoServiceImpl(EnderecoRepository enderecoRepository) {
        this.enderecoRepository = enderecoRepository;
    }

    @Override
    public Endereco salvarEndereco(Endereco endereco) {
        return enderecoRepository.save(endereco);
    }

    @Override
    public Endereco atualizarEndereco(int id, Endereco endereco) {
        endereco.setId(id);
        return enderecoRepository.save(endereco);
    }

    @Override
    public void deletarEndereco(int id) {
        enderecoRepository.deleteById(id);
    }

    @Override
    public Endereco obterEnderecoPorId(int id) {
        return enderecoRepository.findById(id).orElse(null);
    }

    @Override
    public List<Endereco> listarTodosEnderecos() {
        return enderecoRepository.findAll();
    }
}
