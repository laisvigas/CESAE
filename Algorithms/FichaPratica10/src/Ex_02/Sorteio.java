package Ex_02;
import Ex_01.Musica;

import java.util.ArrayList;
import java.util.Random;


public class Sorteio {
    private String nome;
    private String premio;
    private ArrayList<Pessoa> participantes;

    public Sorteio(String nome, String premio) {
        this.nome = nome;
        this.premio = premio;
        this.participantes = new ArrayList<Pessoa>();
    }

    public void inscreverParticipante(Pessoa pessoa){
        if (pessoa.getIdade() >= 18){
            this.participantes.add(pessoa);
            System.out.println(pessoa.getNome() + " se increveu no sorteio.");
        } else {
            System.out.println(pessoa.getNome() + " não pode se increver no Sorteio pois é menor de idade.");
        }
    }

    public void sortear(){
        Random rd = new Random( );
        int indexSorteado = rd.nextInt(participantes.size());
        participantes.get(indexSorteado).exibirDetalhes();
    }

    public void imprimirParticipantes(){
        for (Pessoa pessoaAtual : this.participantes){
            pessoaAtual.exibirDetalhes();
        }
    }
}
