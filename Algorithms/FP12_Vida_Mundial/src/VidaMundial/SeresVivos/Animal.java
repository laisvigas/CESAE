package VidaMundial.SeresVivos;

import VidaMundial.Enums.Alimentacao;

public class Animal extends SerVivo {
    private boolean fome;
    private double pesoKg;
    private double inteligencia;
    private Alimentacao alimentacao;
    private String barulho;

    public Animal(String nome, String especie, String pais, int idade, boolean fome,
                  double pesoKg, double inteligencia, Alimentacao alimentacao, String barulho) {
        super(nome, especie, pais, idade);
        this.fome = fome;
        this.pesoKg = pesoKg;
        this.inteligencia = inteligencia;
        this.alimentacao = alimentacao;
        this.barulho = barulho;
        if (inteligencia < 0 || inteligencia > 100) {
            throw new IllegalArgumentException("O grau de inteligência deve ser entre 0 e 100");
        }
    }

    public String getBarulho() {
        return barulho;
    }



    public double getPesoKg() {
        return pesoKg;
    }

    public double getInteligencia() {
        return inteligencia;
    }

    public boolean isFome() {
        return fome;
    }

    public void setFome(boolean fome) {
        this.fome = fome;
    }

    public Alimentacao getAlimentacao() {
        return alimentacao;
    }
}