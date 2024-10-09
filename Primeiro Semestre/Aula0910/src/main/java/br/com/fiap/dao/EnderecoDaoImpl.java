package br.com.fiap.dao;

import br.com.fiap.entity.Endereco;

import javax.persistence.EntityManager;

public class EnderecoDaoImpl extends GenericDaoImpl<Endereco,Integer> implements EnderecoDao{

    public EnderecoDaoImpl(EntityManager em) {
        super(em);
    }
}
