package br.com.fiap.dao;

import br.com.fiap.entity.Editora;

import javax.persistence.EntityManager;

public class EditoraDaoImpl extends GenericDaoImpl<Editora, Integer> implements EditoraDao{

    public EditoraDaoImpl(EntityManager em) {
        super(em);
    }
}
