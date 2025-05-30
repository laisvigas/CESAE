package Ex03;

import java.util.Arrays;
import java.util.Objects;

public class Animal {
    private String nome;
    private String especie;
    private String paisOrigem;
    private float peso;
    private String[] alimentacao;
    private Reino reino;

    public Animal(String nome, String especie, String paisOrigem, float peso, String[] alimentacao, Reino reino) {
        this.nome = nome;
        this.especie = especie;
        this.paisOrigem = paisOrigem;
        this.peso = peso;
        this.alimentacao = alimentacao;
        this.reino = reino;
    }

    public String exibirDetalhes() {
        return "\nNOME: " + this.nome
                + "\nESPÉCIE: "
                + this.especie
                + "\nPAÍS DE ORIGEM: "
                + this.paisOrigem + "\nPESO: "
                + this.peso + "\nALIMENTAÇÃO: "
                + Arrays.toString(this.alimentacao)
                + "\nREINO: "
                + this.reino;
    }

    public String fazerBarulho(){
        switch(this.reino){
            case MAMÍFERO:
                return "Tinoninoni";
            case ANFÍBIO:
                return "Brrrrrr";
            case AVE:
                return "Kwak Kwak";
            case PEIXE:
                return "Blub Blub Splash";
            default:
                return "Animal não encontrado";
        }
    }

    public String comer(String comida, float gramas){
        for (int i = 0; i < this.alimentacao.length; i++){
            if (Objects.equals(this.alimentacao[i], comida)) {
                this.peso += gramas / 1000;
                this.fazerBarulho();
                return "O " + this.especie + " " + this.nome + " comeu " + this.alimentacao[i];
            }
        }
        return "O " + this.especie + " " + this.nome + " não comeu " + comida;
    }
}
