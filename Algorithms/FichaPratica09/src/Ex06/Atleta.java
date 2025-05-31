package Ex06;

public class Atleta {
    private String nome;
    private String modalidade;
    private float altura;
    private float peso;
    private String paisDeOrigem;
    private int rankingMundial;

    public Atleta(String nome, String modalidade, float altura, float peso, String paisDeOrigem, int rankingMundial) {
        this.nome = nome;
        this.modalidade = modalidade;
        this.altura = altura;
        this.peso = peso;
        this.paisDeOrigem = paisDeOrigem;
        this.rankingMundial = rankingMundial;
    }

    public void exibirDetalhes(){
        System.out.println("\nNome: " + nome
                + "\n Modalidade: " + modalidade
                + "\n Altura: " + altura
                + "\n Peso: " + peso
                + "\n País de Origem: " + paisDeOrigem
                + "\n Ranking Mundial:" + rankingMundial);
    }

    public String getPaisDeOrigem() {
        return paisDeOrigem;
    }
}
