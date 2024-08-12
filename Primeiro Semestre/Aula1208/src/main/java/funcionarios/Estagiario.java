package funcionarios;

public class Estagiario extends Funcionario{

    @Override
    public void calcSalario() {
        super.calcSalario();
        this.salario = 800;
    }
}
