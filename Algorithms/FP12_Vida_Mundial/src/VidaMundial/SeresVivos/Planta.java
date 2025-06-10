package VidaMundial.SeresVivos;

import VidaMundial.Enums.Familia;

public class Planta extends SerVivo {
    private Familia familia;
    private int grauDefesa;

    public Planta(String nome, String especie, String pais, int idade,
                  Familia familia, int grauDefesa) {
        super(nome, especie, pais, idade);
        this.grauDefesa = grauDefesa;
        this.familia = familia;
        if (grauDefesa < 0 || grauDefesa > 5) {
            throw new IllegalArgumentException("O grau de defesa deve ser entre 0 e 5");
        }
    }

    public Familia getFamilia() {
        return familia;
    }

    public int getGrauDefesa() {
        return grauDefesa;
    }
}
