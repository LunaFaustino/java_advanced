package br.com.fiap.dao;

import br.com.fiap.anotation.Tabela;

public class JpaDao {

    public void pesquisar(Object obj){
        // Recupera a anotação @Tabela
        Tabela anotacao = obj.getClass().getAnnotation(Tabela.class);
        System.out.println("SELECT * from "+ anotacao.nome());
    }
}
