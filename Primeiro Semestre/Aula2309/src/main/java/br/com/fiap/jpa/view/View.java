package br.com.fiap.jpa.view;


import br.com.fiap.jpa.dao.InvestimentoDao;
import br.com.fiap.jpa.dao.InvestimentoDaoImpl;
import br.com.fiap.jpa.entity.Investimento;
import br.com.fiap.jpa.entity.TipoInvestimento;
import br.com.fiap.jpa.exception.CommitException;
import br.com.fiap.jpa.exception.IdNaoEncontradoException;
import br.com.fiap.jpa.singleton.EntityManagerFactorySingleton;

import javax.persistence.EntityManager;

public class View {

    public static void main(String[] args) {

        // Obter o entity manager
        EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();

        // Instanciar o DAO do investimento
        // GenericDao<Investimento,Integer> dao = new GenericDaoImpl<Investimento, Integer>(em){}
        InvestimentoDao dao = new InvestimentoDaoImpl(em);

        Investimento investimento = new Investimento("CDB TranquiloCoin", 1000001.0, TipoInvestimento.CRIPTO);

        // cadastrar (create -> insert)
        try {
            dao.salvar(investimento);
            dao.commit();
            System.out.println("Investimento cadastrado!");
        } catch (CommitException e) {
            System.out.println(e.getMessage());
        }

        try {
            // pesquisar (read -> select)
            Investimento busca = dao.buscar(1);
            System.out.println(busca.getNome());

            // atualiza um investimento (update -> update)
            busca.setValor(5000000.0);
            dao.salvar(busca);
            dao.commit();
            System.out.println("Investimento atualizado!");
        } catch (CommitException | IdNaoEncontradoException e) {
            System.out.println(e.getMessage());
        }
        /*
        //remover um investimento (delete -> delete)
        try {
            dao.remover(2);
            dao.commit();
            System.out.println("Investimento removido");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }*/
    }
}