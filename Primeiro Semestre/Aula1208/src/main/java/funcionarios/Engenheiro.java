package funcionarios;

public class Engenheiro extends Funcionario{

    @Override
    public void calcSalario() {
        super.calcSalario();
        this.salario = 4000;
    }
}
