package br.com.fiap.view;

import br.com.fiap.dao.ClienteDao;
import br.com.fiap.dao.ClienteDaoImpl;
import br.com.fiap.entity.Cliente;
import br.com.fiap.entity.Genero;
import br.com.fiap.exception.IdNaoEncontradoException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Calendar;

public class TesteDao {
    public static void main(String[] args) {

        //Criar a fábrica
        EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");

        //Criar o Entity Manager
        EntityManager em = fabrica.createEntityManager();

        //Instanciar o DAO
        ClienteDao dao = new ClienteDaoImpl(em);

        //Cadastrar um Cliente (CREATE > INSERT)
        Cliente cliente = new Cliente("Ruan", Calendar.getInstance(),100.0,
                "1231313", Genero.MASCULINO);

        try {
            dao.cadastrar(cliente);
            dao.commit();
            System.out.println("Cliente cadastrado");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //Pesquisar um Cliente (READ > SELECT)
        try {
            Cliente busca = dao.buscarPorId(5);
            System.out.println(busca.getNome());
        } catch (IdNaoEncontradoException e) {
            System.out.println(e.getMessage());
        }

        //Atualizar um Cliente (UPDATE > UPDATE)
        try {
            cliente.setNome("Denner");
            cliente.setGenero(Genero.MASCULINO);
            dao.atualizar(cliente);
            dao.commit();
            System.out.println("Cliente atualizado");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //Remover um Cliente (DELETE > DELETE)
        try {
            dao.remover(7);
            dao.commit();
            System.out.println("Cliente removido");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
