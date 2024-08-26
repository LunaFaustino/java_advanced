package br.com.fiap.view;

import br.com.fiap.dao.JpaDao;
import br.com.fiap.model.Aluno;
import br.com.fiap.model.Pessoa;

public class Exercicio {

    public static void main(String[] args){

        // instanciar aluno
        Aluno aluno = new Aluno();

        // instanciar o JpaDao
        JpaDao dao = new JpaDao();

        // método pesquisar com o aluno
        dao.pesquisar(aluno);

        // instanciar pessoa
        Pessoa pessoa = new Pessoa();
        //método pesquisar com pessoa
        dao.pesquisar(pessoa);
    }
}
