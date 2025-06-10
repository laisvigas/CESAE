package Ex_03;

//Crie a classe Marisco com os atributos: espécie, peso, preco/kg.
public class Marisco {
    private String especie;
    private float peso;
    private float precoKg;

    public Marisco(String especie, float peso, float precoKg) {
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
