package concessionaria;

public class Concessionaria {
    public static void main(String[] args){
        System.out.println("Carro");
        Carros c = new Carros();
        c.setPlaca("BRA2E19");
        c.printPlaca();
        c.setCor("Verde");
        c.printCor();
        c.setPreco(60000);
        c.printPreco();

        System.out.println("\nCaminhão");
        Caminhoes ca = new Caminhoes();
        ca.setPlaca("BRA2K20");
        ca.printPlaca();
        ca.setCor("Vermelho");
        ca.printCor();
        ca.setPreco(90000);
        ca.printPreco();

        System.out.println("\nMoto");
        Motos m = new Motos();
        m.setPlaca("NOP4567");
        m.printPlaca();
        m.setCor("Preta");
        m.printCor();
        m.setPreco(30000);
        m.printPreco();
    }
}
