package concessionaria;

public class Veiculo {

    protected String placa;
    protected String cor;
    protected double preco;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void printPlaca(){
        System.out.println("Placa: " + this.placa);
    }

    public void printCor(){
        System.out.println("Cor: " + this.cor);
    }

    public void printPreco(){
        System.out.println("Preço: R$" + this.preco);
    }
}
