package Ex08;

public class Produto {
    private String nome;
    private int preco; // redundante ao inicializar com 0? |
    private int quantidadeStock = 0; // a predefinição seria aqui?

    public Produto(String nome, int preco){
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public int getPreco() {
        return preco;
    }

    public int getQuantidadeStock() {
        return quantidadeStock;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public String adquirirStock(int incrementar) {
        this.quantidadeStock += incrementar;
        return "Confirmado.";
    }

    public String venderProduto(int quantidadeAserVendida){
        if (this.quantidadeStock >= quantidadeAserVendida){
            this.quantidadeStock -= quantidadeAserVendida;
            int PrecoCompra = quantidadeAserVendida * preco;
            return "Compra realizada com sucesso! | RECIBO: €" + PrecoCompra + " .";
        } else {
            return "Produto indisponível";
        }
    }
}
