package br.com.fiap.dao;

import br.com.fiap.entity.Biblioteca;

import javax.persistence.EntityManager;

public class BibliotecaDaoImpl extends GenericDaoImpl<Biblioteca,Integer> implements BibliotecaDao{

    public BibliotecaDaoImpl(EntityManager em) {
        super(em);
    }
}
