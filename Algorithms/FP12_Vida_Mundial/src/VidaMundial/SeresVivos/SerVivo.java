package VidaMundial.SeresVivos;

public class SerVivo {
    private String nome;
    private String especie;
    private String pais;
    private int idade;

    public SerVivo(String nome, String especie, String pais, int idade) {
        this.nome = nome;
        this.especie = especie;
        this.pais = pais;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecie() {
        return especie;
    }

    public String getPais() {
        return pais;
    }

    public int getIdade() {
        return idade;
    }

    public void imprimirDetalhesSerVivo(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Espécie: " + this.especie);
        System.out.println("País: " + this.pais);
        System.out.println("Idade: " + this.idade);
    }
}
