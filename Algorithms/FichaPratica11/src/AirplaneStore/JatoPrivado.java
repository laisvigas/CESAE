package AirplaneStore;
import java.util.ArrayList;

public class JatoPrivado extends Aviao {
    private int lotacao;
    private double capacidade_bagagem;
    private CategoriaJato categoria;
    private ArrayList<String> instalacoes;

    public JatoPrivado(int serial, String modelo, int anoFabrico, double peso, double cmp_fuselagem, double env_asas, double alt_cauda, int n_motores, double autonomia, double velocidade_max, double preco, int lotacao, double capacidade_bagagem, CategoriaJato categoria) {
        super(serial, modelo, anoFabrico, peso, cmp_fuselagem, env_asas, alt_cauda, n_motores, autonomia, velocidade_max, preco);
        this.lotacao = lotacao;
        this.capacidade_bagagem = capacidade_bagagem;
        this.categoria = categoria;
        this.instalacoes = new ArrayList<String>();
    }

    public int getLotacao() {
        return lotacao;
    }

    public void setLotacao(int lotacao) {
        this.lotacao = lotacao;
    }

    public double getCapacidade_bagagem() {
        return capacidade_bagagem;
    }

    public void setCapacidade_bagagem(double capacidade_bagagem) {
        this.capacidade_bagagem = capacidade_bagagem;
    }

    public CategoriaJato getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaJato categoria) {
        this.categoria = categoria;
    }

    public ArrayList<String> getInstalacoes() {
        return instalacoes;
    }

    public void setInstalacoes(ArrayList<String> instalacoes) {
        this.instalacoes = instalacoes;
    }

    public void adicionarInstalacoes(String instalacao){
        this.instalacoes.add(instalacao);
    }

    public void removerInstalacoes(String instalacao){
        this.instalacoes.remove(instalacao);
    }

    public void listarInstalacoes(String instalacao){
        for (String item : instalacoes){
            System.out.println("- " + item);
        }
    }
}
