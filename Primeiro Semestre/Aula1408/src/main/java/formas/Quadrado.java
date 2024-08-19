package formas;

public class Quadrado extends Forma{

    private double lado;
    private String cor;

    Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double Area() {
        return lado * lado;
    }

    @Override
    public String cor(String cor) {
        return cor;
    }
}
