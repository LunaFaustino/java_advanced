package exercicio04;

public class NovoImovel extends Imovel{
    private double valorAdicional;

    public NovoImovel(String endereco, double preco, double valorAdicional) {
        super(endereco, preco);
        this.valorAdicional = valorAdicional;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    @Override
    public void Informacoes() {
        super.Informacoes();
        System.out.println("Valor Adicional: R$" + valorAdicional);
        System.out.println("Preço Final: R$" + (getPreco() + valorAdicional));
    }
}
