package br.com.fiap.view;

import br.com.fiap.entity.Cliente;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TesteRemover {
    public static void main(String[] args) {

        //Criar a fábrica
        EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");

        //Criar o Entity Manager
        EntityManager em = fabrica.createEntityManager();

        //Pesquisar o cliente que será removido
        Cliente cliente = em.find(Cliente.class, 8);

        //Chamar o método de remover
        em.remove(cliente);

        em.getTransaction().begin();
        em.getTransaction().commit();

    }
}
