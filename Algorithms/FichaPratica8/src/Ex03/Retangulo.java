package Ex03;

public class Retangulo {
    // artibutos
    private String cor;
    private float largura;
    private float altura;

    // construtor
    public Retangulo(String cor, float largura, float altura){
        this.cor = cor;
        this.largura = largura;
        this.altura = altura;
    }

    public double calcularPerimetro(){
        return this.largura + this.largura + this.altura +  this.altura;
    }

    public double calcularArea(){
        return this.altura * this.largura;
    }
}
