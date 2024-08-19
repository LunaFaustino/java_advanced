package exercicio05;

public class Gerente{
    public String nome;

    public Gerente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void atualizar(Funcionario f, String cargo) {
        f.cargo = cargo;
    }

    public void atualizar(Funcionario f, double salario){
        f.salario = salario;
    }

}
