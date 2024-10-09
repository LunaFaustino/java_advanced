package br.com.fiap.dao;

public interface GenericDao<T, K> {

    T salvar(T entidade);

    void remover(K id);

    T buscar(K id);

    void commit();
}
