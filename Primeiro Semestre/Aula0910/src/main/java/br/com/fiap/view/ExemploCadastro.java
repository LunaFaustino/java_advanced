package br.com.fiap.view;

import br.com.fiap.dao.*;
import br.com.fiap.entity.Biblioteca;
import br.com.fiap.entity.Editora;
import br.com.fiap.entity.Endereco;
import br.com.fiap.entity.Livro;
import br.com.fiap.exception.CommitException;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class ExemploCadastro {

    public static void main(String[] args) {

        EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();

        EnderecoDao enderecoDao = new EnderecoDaoImpl(em);

        BibliotecaDao bibliotecaDao = new BibliotecaDaoImpl(em);

        Endereco ender = new Endereco("Av Lins Vasconcelos, 1234", "12345-67");

        Biblioteca b = new Biblioteca("FIAP Tranquila", new GregorianCalendar(1950, Calendar.JANUARY,20), ender);

        try {

            // Cadastrar endereço
            Endereco salvo = enderecoDao.salvar(ender);

            b.setEndereco(salvo);
            enderecoDao.commit();

            // Cadastrar biblioteca
            bibliotecaDao.salvar(b);
            bibliotecaDao.commit();

        }catch (CommitException e){
            e.printStackTrace();
        }

        Livro cosmos = new Livro("Cosmos", 520);
        Livro harry = new Livro("Harry Potter e a Tranquilidade", 500);

        Editora editora = new Editora("Calma");

        editora.addLivro(cosmos);
        editora.addLivro(harry);

        EditoraDao editoraDao = new EditoraDaoImpl(em);
        try {
            editoraDao.salvar(editora);
            editoraDao.commit();
            System.out.println("Editora e livrod cadastrados!");
        }catch (CommitException e){
            System.err.println(e.getMessage());
        }

        List<Livro> livros = new ArrayList<Livro>();
        livros.add(harry);
        livros.add(cosmos);

        b.setLivros(livros);

        try {
            bibliotecaDao.salvar(b);
            bibliotecaDao.commit();
            System.out.println("Deu certo!");
        }catch (CommitException e){
            System.out.println(e.getMessage());
        }
    }
}
