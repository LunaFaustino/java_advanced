package funcionarios;

public class Analista extends Funcionario{

    @Override
    public void calcSalario() {
        super.calcSalario();
        this.salario = 3000;
    }
}
