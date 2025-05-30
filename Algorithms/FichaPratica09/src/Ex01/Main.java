package Ex01;

public class Main {
    public static void main(String[] args){
        Carro carro1 = new Carro("Fusca", "xxx", "Branco",
                90, 300, 300, TipoCombustivel.GPL, 50);

        Carro carro2 = new Carro("BMW", "yyy", "Preto",
                10, 1000, 1000, TipoCombustivel.DIESEL, 50);

        Carro carro3 = new Carro("Fiat", "zzz", "Prata",
                5, 100, 50, TipoCombustivel.GASOLINA, 10);

        Carro carro4 = new Carro("Uno", "aaa", "Rosa",
                1, 500, 250, TipoCombustivel.GASOLINA, 200);

        System.out.println(carro1.ligar());

        System.out.println();
        System.out.println("DISPUTA:");
        System.out.println(carro1.getMarca() + " x " + carro2.getMarca());

        System.out.println();
        System.out.println("VENCEDOR");
        Carro vencedor = carro1.adversario(carro2);
        System.out.println(vencedor.exibirDetalhes());

        System.out.println();
        System.out.println("LIGANDO CARROS");
        System.out.println(carro1.getMarca()+ ": " + carro1.ligar());
        System.out.println(carro2.getMarca()+ ": " + carro2.ligar());
        System.out.println(carro3.getMarca()+ ": " + carro3.ligar());
        System.out.println(carro4.getMarca()+ ": " +carro4.ligar());

        System.out.println();
        System.out.println("DISPUTA:");
        System.out.println(carro1.getMarca() + " x " + carro2.getMarca());

        System.out.println();
        System.out.println("VENCEDOR");
        vencedor = carro1.adversario(carro2);
        System.out.println(vencedor.exibirDetalhes());

        System.out.println();
        System.out.println("DISPUTA:");
        System.out.println(carro2.getMarca() + " x " + carro3.getMarca());

        System.out.println();
        System.out.println("VENCEDOR");
        vencedor = carro2.adversario(carro3);
        System.out.println(vencedor.exibirDetalhes());

        //Calcule quanto é que o vencedor da corrida final consumiria numa viagem de 65 Km.
        System.out.print("Gasto de combustível:" + vencedor.calcularConsumo(2));
    }
}
