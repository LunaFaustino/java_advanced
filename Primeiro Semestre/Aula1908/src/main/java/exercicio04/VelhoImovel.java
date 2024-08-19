package exercicio04;

public class VelhoImovel extends Imovel{
    private double desconto;

    public VelhoImovel(String endereco, double preco, double desconto) {
        super(endereco, preco);
        this.desconto = desconto;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    @Override
    public void Informacoes() {
        super.Informacoes();
        System.out.println("Desconto: R$" + desconto);
        System.out.println("Preço com desconto: R$" + (getPreco() - desconto));
    }
}
