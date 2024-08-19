package exercicio05;

public class Main {
    public static void main(String[] args){
        Funcionario func1 = new Funcionario("Luna", "Estagiária", 1000);
        Gerente gerente = new Gerente("Marcel");

        System.out.println("\nDados antes da atualização:\n" + func1);

        gerente.atualizar(func1, "Analista de Software");
        gerente.atualizar(func1, 3000);

        System.out.println("\nDados após atualização do cargo e do salário:\n" + func1);
    }
}
