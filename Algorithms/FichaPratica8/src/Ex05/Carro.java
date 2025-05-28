package Ex05;

public class Carro {
    private String marca;
    private String modelo;
    private String cor;
    private int anoFabricacao;

    public Carro(String marca, String modelo, String cor, int anoFabricacao) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.anoFabricacao = anoFabricacao;
    }

    public String ligar(){
        return "O " + this.marca + " " + this.modelo + " " + this.cor + " está ligado.";
    }
}
