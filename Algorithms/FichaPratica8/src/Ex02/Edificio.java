package Ex02;

public class Edificio {
    // atributos
    private String rua;
    private String cidade;
    private String corDaFachada;
    private int numAndares;
    private boolean garagem;

    // construtor
    public Edificio(String rua, String cidade, String corDaFachada, int numAndares, boolean garagem){
        this.rua = rua;
        this.cidade = cidade;
        this.corDaFachada = corDaFachada;
        this.numAndares = numAndares;
        this.garagem = garagem;
    }

    // métodos de acesso
    public String getRua(){
        return this.rua;
    }

    public String getCidade(){
        return this.cidade;
    }

    public String getCorDaFachada(){
        return this.corDaFachada;
    }

    public int getnumAndares(){
        return this.numAndares;
    }

    public boolean getGaragem(){
        return this.garagem;
    }

    public void setCorDaFachada(String corDaFachada){
        this.corDaFachada = corDaFachada;
    }
}
