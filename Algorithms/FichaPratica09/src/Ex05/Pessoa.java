package Ex05;

public class Pessoa {
    private String nome;
    private int idade;
    private String cidade;
    private String email;
    private int telemovel;

    public Pessoa(String nome, int idade, String cidade, String email, int telemovel) {
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;
        this.email = email;
        this.telemovel = telemovel;
    }

    public String getCidade() {
        return cidade;
    }

    public void exibirDetalhes(){
        System.out.print("\nNome: " + this.nome
                + "\nIdade: " + this.idade
                + "\nCidade: " + this.cidade
                + "\nEmail: " + this.email
                + "\nTelemóvel: " + this.telemovel
                + "\n__________________________________________");
    }
}
