package Ex04;

public class Imovel {
    private String rua;
    private int NumeroDaPorta;
    private String cidade;
    private Tipo tipo;
    private Acabamento acabamento;
    private float areaTotal;
    private int numeroDeQuartos;
    private int numeroDeCasasDeBanho;
    private float areaDaPiscina;

    public Imovel(String rua, int numeroDaPorta, String cidade, Tipo tipo, Acabamento acabamento,
                  float areaTotal, int numeroDeQuartos, int numeroDeCasasDeBanho, float areaDaPiscina) {
        this.rua = rua;
        NumeroDaPorta = numeroDaPorta;
        this.cidade = cidade;
        this.tipo = tipo;
        this.acabamento = acabamento;
        this.areaTotal = areaTotal;
        this.numeroDeQuartos = numeroDeQuartos;
        this.numeroDeCasasDeBanho = numeroDeCasasDeBanho;
        this.areaDaPiscina = areaDaPiscina;
    }

    public void setAcabamento(Acabamento acabamento) {
        this.acabamento = acabamento;
    }

    public float calcularValor() {
        float valorDeBase = 0;
        switch (this.tipo) {
            case APARTAMENTO:
                valorDeBase = this.areaTotal * 1000;
                break;
            case CASA:
                valorDeBase = this.areaTotal * 3000;
                break;
            case MANSAO:
                valorDeBase = this.areaTotal * 5000;
                break;
        }

        switch (this.acabamento) {
            case PARA_RESTAURO:
                valorDeBase *= 0.5;
                break;
            case USADA:
                valorDeBase *= 0.9;
                break;
            case NOVA_COM_ALTO_ACABAMENTO:
                valorDeBase *= 1.25;
                break;
        }

        valorDeBase += this.numeroDeQuartos * 7500;
        valorDeBase += this.numeroDeCasasDeBanho * 10500;
        valorDeBase += this.areaDaPiscina * 1000;

        return valorDeBase;
    }

    public String compararImoveis(Imovel imovelAcomparar){
        if (imovelAcomparar.calcularValor() > this.calcularValor()){
            return "Imóvel: " + "\n" + imovelAcomparar.rua + "\n| Número da Porta: " + imovelAcomparar.NumeroDaPorta
                    + "\n| Cidade: " + imovelAcomparar.cidade + "\n| Tipo: " + imovelAcomparar.tipo
                    + "\n| Acabamento: " + imovelAcomparar.acabamento + "\n| Área Total: " + imovelAcomparar.areaTotal
                    + "\n| Número de Quartos: " + imovelAcomparar.numeroDeQuartos
                    + "\n| Número de Casas de Banho: " + imovelAcomparar.numeroDeCasasDeBanho
                    + "\n| Área da piscina: " + imovelAcomparar.areaDaPiscina
                    + "\n| Valor: €" + imovelAcomparar.calcularValor();
        } else {
            return "Imóvel: \n" + "\n" + this.rua + "\n| Número da Porta: " + this.NumeroDaPorta
                    + "\n| Cidade: " + this.cidade + "\n| Tipo: " + this.tipo
                    + "\n| Acabamento: " + this.acabamento + "\n| Área Total: " + this.areaTotal
                    + "\n| Número de Quartos: " + this.numeroDeQuartos
                    + "\n| Número de Casas de Banho: " + this.numeroDeCasasDeBanho
                    + "\n| Área da piscina: " + this.areaDaPiscina
                    + "\n Valor: " + this.calcularValor();
        }
    }
}
