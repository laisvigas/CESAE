package Ex_03;

public class Main {
    public static void main(String[] args){
        Peixe peixe1 = new Peixe("Sardinha", 190, 20);
        Peixe peixe2 = new Peixe("Bacalhau", 20, 10);
        Peixe peixe3 = new Peixe("Salmão", 30, 60);

        Marisco marisco1 = new Marisco("Camarão", 0.02f, 10);
        Marisco marisco2 = new Marisco("Carangueijo", 0.05f, 5);
        Marisco marisco3 = new Marisco("Ostra", 0.1f, 100);

        BarcoPesca barco = new BarcoPesca("Dave", "Verde",
                1998, 10, 200, Marca.Wooldridge);

        System.out.println("PESCANDO");
        barco.pescarPeixe(peixe1);
        barco.pescarMarisco(marisco3);
        barco.pescarPeixe(peixe3);

        System.out.println();
        barco.exibirDetalhes();
        System.out.println();

        System.out.println("SOLTANDO O PEIXE OU MARISCO");
        barco.largarMarisco(marisco3);
        barco.exibirDetalhes();

        System.out.println();
        System.out.println(barco.calcularTotal());

        System.out.println();
        System.out.println("Salário por pessoa da tripulação: " + barco.salarioTripulacao());
    }
}
