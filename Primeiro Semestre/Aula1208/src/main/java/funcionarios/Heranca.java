package funcionarios;

public class Heranca {
    public static void main(String[] args) {
        Gerente g = new Gerente();
        g.setNome("Pedro");
        g.printNome();
        g.calcSalario();
        g.printSalario();

        Engenheiro e = new Engenheiro();
        e.setNome("Patrícia");
        e.printNome();
        e.calcSalario();
        e.printSalario();

        Analista a = new Analista();
        a.setNome("José");
        a.printNome();
        a.calcSalario();
        a.printSalario();

        Estagiario es = new Estagiario();
        es.setNome("Julia");
        es.printNome();
        es.calcSalario();
        es.printSalario();
    }
}