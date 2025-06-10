package AirplaneStore;

public class Main {
    public static void main(String[] args) {
        Catalogo catalogo = new Catalogo();

        JatoPrivado jato1 = new JatoPrivado(1001, "Falcon", 2020, 5000, 10, 15, 4, 2, 3000, 800, 150000,
                10, 10000, CategoriaJato.MIDSIZE_JET);
        jato1.adicionarInstalacoes("WC");
        jato1.adicionarInstalacoes("Suite");

        AviaoCombate aviaoComb1 = new AviaoCombate(2001, "F-16", 2018, 7000, 12, 
                16, 5, 1, 2500, 1200, 180000,
                "EUA", true);
        aviaoComb1.adicionarArma(Armas.MISSEL);
        aviaoComb1.adicionarArma(Armas.METRALHADORA);

        catalogo.adquirirAviao(jato1);
        catalogo.adquirirAviao(aviaoComb1);

        System.out.println();
        System.out.println("LISTANDO CATÁLOGO DE AVIÕES: ");
        System.out.println();
        catalogo.listarCatalogo();
        System.out.println("Valor total: €" + catalogo.calcularTotal());
    }
}
