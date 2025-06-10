package AirplaneStore;

public class Aviao {
    private int serial;
    private String modelo;
    private int anoFabrico;
    private double peso;
    private double cmp_fuselagem;
    private double env_asas;
    private double alt_cauda;
    private int n_motores;
    private double autonomia;
    private double velocidade_max;
    private double preco;

    public Aviao(int serial, String modelo, int anoFabrico, double peso, double cmp_fuselagem, double env_asas, double alt_cauda, int n_motores, double autonomia, double velocidade_max, double preco) {
        this.serial = serial;
        this.modelo = modelo;
        this.anoFabrico = anoFabrico;
        this.peso = peso;
        this.cmp_fuselagem = cmp_fuselagem;
        this.env_asas = env_asas;
        this.alt_cauda = alt_cauda;
        this.n_motores = n_motores;
        this.autonomia = autonomia;
        this.velocidade_max = velocidade_max;
        this.preco = preco;
    }

    public void exibirDetalhes(){
        System.out.println("Modelo: " + this.modelo + " | Ano de Fabricação: " + this.anoFabrico + " Nº de série: " + this.serial);
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoFabrico() {
        return anoFabrico;
    }

    public void setAnoFabrico(int anoFabrico) {
        this.anoFabrico = anoFabrico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getCmp_fuselagem() {
        return cmp_fuselagem;
    }

    public void setCmp_fuselagem(double cmp_fuselagem) {
        this.cmp_fuselagem = cmp_fuselagem;
    }

    public double getEnv_asas() {
        return env_asas;
    }

    public void setEnv_asas(double env_asas) {
        this.env_asas = env_asas;
    }

    public double getAlt_cauda() {
        return alt_cauda;
    }

    public void setAlt_cauda(double alt_cauda) {
        this.alt_cauda = alt_cauda;
    }

    public int getN_motores() {
        return n_motores;
    }

    public void setN_motores(int n_motores) {
        this.n_motores = n_motores;
    }

    public double getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(double autonomia) {
        this.autonomia = autonomia;
    }

    public double getVelocidade_max() {
        return velocidade_max;
    }

    public void setVelocidade_max(double velocidade_max) {
        this.velocidade_max = velocidade_max;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
