package Ex04;

public class Circulo {
    private String cor;
    private double raio;

    public Circulo(String cor, float raio) {
        this.cor = cor;
        this.raio = raio;
    }

    public double calcularPerimetro(){
        return 2 * Math.PI * this.raio;
    }

    public double calcularArea(){
        double pi = 3.14;
        return Math.PI * this.raio * this.raio;
    }
}
