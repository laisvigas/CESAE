package Ex08;

public class Main {
    public static void main(String[] args){
        Produto produto1 = new Produto("Metroid Prime", 50);
        Produto produto2 = new Produto("Animal Crossing", 60);
        Produto produto3 = new Produto("God of War", 20);

        int novoStock = 10;

        // adquirindo stock
        System.out.println("ADQUIRINDO: " + produto1.getNome() + " | QUANTIDADE: " + novoStock
                + " | STATUS: " + produto1.adquirirStock(novoStock));


        System.out.println("ADQUIRINDO: " + produto2.getNome() + " | QUANTIDADE: " + novoStock
                + " | STATUS: " + produto2.adquirirStock(novoStock));


        System.out.println("ADQUIRINDO: " + produto3.getNome() + " | QUANTIDADE: " + novoStock
                + " | STATUS: " + produto3.adquirirStock(novoStock));

        System.out.println();
        // compra válida
        int quantidadeProduto = 2;
        System.out.print("PRODUTO: " + produto1.getNome() +
                " | QUANTIDADE: " + quantidadeProduto +
                " | VALOR POR UNIDADE: €" + produto1.getPreco() +
                " | STATUS: " + produto1.venderProduto(quantidadeProduto));

        // compra invalida
        System.out.print("\nPRODUTO: " + produto1.getNome() +
                " | QUANTIDADE: " + 20 +
                " | VALOR POR UNIDADE: €" + produto1.getPreco() +
                " | STATUS: " + produto1.venderProduto(20));


        // trocar preco de um produto
        produto3.setPreco(150);

        // mais uma compra válida
        System.out.print("\nPRODUTO: " + produto3.getNome() +
                " | VALOR POR UNIDADE: €" + produto3.getPreco() +
                " | QUANTIDADE: " + quantidadeProduto +
                " | STATUS: " + produto3.venderProduto(quantidadeProduto));

        System.out.println();
        String[] titulos = {produto1.getNome(), produto2.getNome(), produto3.getNome()};
        int[] stock = {produto1.getQuantidadeStock(), produto2.getQuantidadeStock(), produto3.getQuantidadeStock()};

        // stock dos três produtos
        System.out.println();
        System.out.println("STOCK");
        for (int i = 0; i < stock.length; i ++){
            System.out.println("PRODUTO: " + titulos[i] + " | QUANTIDADE: " + stock[i]);
        }
    }
}
