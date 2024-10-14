package br.com.fiap.view;

import br.com.fiap.dao.BibliotecaDao;
import br.com.fiap.dao.BibliotecaDaoImpl;
import br.com.fiap.entity.Biblioteca;
import br.com.fiap.entity.Livro;
import br.com.fiap.exception.IdNaoEncontradoException;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

import javax.persistence.EntityManager;

public class ExemploPesquisa {
    public static void main(String[] args) {

        EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
        BibliotecaDao dao = new BibliotecaDaoImpl(em);

        try {
            Biblioteca b = dao.buscar(21);
            System.out.println(b.getNome());
            System.out.println(b.getEndereco().getLogradouro());

            for (Livro livro : b.getLivros()){
                System.out.println(livro.getTitulo() + " " +
                        livro.getEditora().getNome());
            }
        } catch (IdNaoEncontradoException e){
            System.out.println(e.getMessage());
        }
    }
}