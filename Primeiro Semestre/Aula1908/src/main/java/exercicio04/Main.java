package exercicio04;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Imovel imovelNovo = new NovoImovel("Avenida Paulista, 2000", 50000, 50000);
        Imovel imovelVelho = new VelhoImovel("Avenida Paulista, 3000", 50000, 30000);

        System.out.println("Informações do Imóvel Novo: ");
        imovelNovo.Informacoes();

        System.out.println("\nInformações do Imóvel Antigo: ");
        imovelVelho.Informacoes();

    }
}