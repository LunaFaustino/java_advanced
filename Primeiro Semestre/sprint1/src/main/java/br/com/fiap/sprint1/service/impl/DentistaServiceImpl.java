package br.com.fiap.sprint1.service.impl;

import br.com.fiap.sprint1.models.Dentista;
import br.com.fiap.sprint1.repositories.DentistaRepository;
import br.com.fiap.sprint1.service.DentistaService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DentistaServiceImpl implements DentistaService {

    private final DentistaRepository dentistaRepository;

    public DentistaServiceImpl(DentistaRepository dentistaRepository) {
        this.dentistaRepository = dentistaRepository;
    }

    @Override
    public Dentista salvarDentista(Dentista dentista) {
        return dentistaRepository.save(dentista);
    }

    @Override
    public Dentista atualizarDentista(int id, Dentista dentista) {
        dentista.setId(id);
        return dentistaRepository.save(dentista);
    }

    @Override
    public void deletarDentista(int id) {
        dentistaRepository.deleteById(id);
    }

    @Override
    public Dentista obterDentistaPorId(int id) {
        return dentistaRepository.findById(id).orElse(null);
    }

    @Override
    public List<Dentista> obterTodosDentistas() {
        return dentistaRepository.findAll();
    }
}
