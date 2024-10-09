package br.com.fiap.dao;

import javax.persistence.EntityManager;
import java.lang.reflect.ParameterizedType;

public abstract class GenericDaoImpl<T,K> implements GenericDao<T,K> {

    private EntityManager em;

    private Class<T> clazz; // atributo que recebe o .class de T(entidade)

    @SuppressWarnings("all")
    public GenericDaoImpl(EntityManager em){
        this.em = em;
        this.clazz = (Class<T>) ((ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    public T salvar(T entidade){
        return em.merge(entidade);
    }

    public void remover(K id){
        T entidade = buscar(id);
        em.remove(entidade);
    }

    public T buscar(K id){
        return em.find(clazz,id);
    }

    public void commit(){
        em.getTransaction().begin();
        em.getTransaction().commit();
        }
}
