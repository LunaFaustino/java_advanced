package formas;

public class Circulo extends Forma{
    private double raio;
    private String cor;

    Circulo(double raio){
        this.raio = raio;
    }

    @Override
    public double Area() {
        return Math.PI * raio * raio;
    }

    @Override
    public String cor(String cor) {
        return cor;
    }
}
