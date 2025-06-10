package AirplaneStore;

import java.util.ArrayList;

public class AviaoCombate extends Aviao{
    private String paisOrigem;
    private boolean camuflagem;
    private ArrayList<Armas> arsenal;

    public AviaoCombate(int serial, String modelo, int anoFabrico, double peso, double cmp_fuselagem, double env_asas, double alt_cauda, int n_motores, double autonomia, double velocidade_max, double preco, String paisOrigem, boolean camuflagem) {
        super(serial, modelo, anoFabrico, peso, cmp_fuselagem, env_asas, alt_cauda, n_motores, autonomia, velocidade_max, preco);
        this.paisOrigem = paisOrigem;
        this.camuflagem = camuflagem;
        this.arsenal = new ArrayList<Armas>();
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

    public boolean isCamuflagem() {
        return camuflagem;
    }

    public void setCamuflagem(boolean camuflagem) {
        this.camuflagem = camuflagem;
    }

    public ArrayList<Armas> getArsenal() {
        return arsenal;
    }

    public void setArsenal(ArrayList<Armas> arsenal) {
        this.arsenal = arsenal;
    }

    public void adicionarArma(Armas arma){
        if (arsenal.size() < 3){
            arsenal.add(arma);
        } else {
            System.out.println("ARSENAL CHEIO | CAPACIDADE MÁXIMA: 3");
        }
    }

    public void removerArma(Armas arma){
        arsenal.remove(arma);
    }

    public void listarArmas(Armas arma){
        System.out.println("ARMAS:");
        for (Armas armaAtual : arsenal) {
            System.out.println("- " + armaAtual);
        }
    }
}
