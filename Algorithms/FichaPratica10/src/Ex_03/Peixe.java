package Ex_03;

public class Peixe {
    private String especie;
    private float peso;
    private float precoKg;

    public Peixe(String especie, float peso, float precoKg) {
        this.especie = especie;
        this.peso = peso;
        this.precoKg = precoKg;
    }

    public String getEspecie() {
        return especie;
    }

    public float getPeso() {
        return peso;
    }

    public float getPrecoKg() {
        return precoKg;
    }
}
