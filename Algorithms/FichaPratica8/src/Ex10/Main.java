package Ex10;

public class Main {
    public static void main(String[] args){
        // instanciando contas
        ContaBancaria conta1 = new ContaBancaria(987654, "Peaches");
        ContaBancaria conta2 = new ContaBancaria(345672, "Mario");
        ContaBancaria conta3 = new ContaBancaria(562317, "Luigi");

        // depositando valor
        System.out.println();
        System.out.println("DEPOSITO");
        System.out.println(conta1.depositar(2500));
        System.out.println(conta2.depositar(700));
        System.out.println(conta3.depositar(355));

        // efetuando levantamento valido
        System.out.println();
        System.out.println("LEVANTAMENTO");
        System.out.println(conta1.levantar(500));
        System.out.println(conta2.levantar(100));
        System.out.println(conta3.levantar(55));

        // efetuando levantamento inválido
        System.out.println();
        System.out.println("LEVANTAMENTO");
        System.out.println(conta1.levantar(2001));

        System.out.println("_____________________");
        conta1.exibirDetalhes();
        conta2.exibirDetalhes();
        conta3.exibirDetalhes();
        System.out.println("_____________________");

        // efetuando uma transferência inválida.
        System.out.println();
        System.out.println("TRANFERÊNCIA");
        System.out.println(conta2.transferencia(1000, conta3));

        // efetuando uma transferência válida.
        System.out.println();
        System.out.println("TRANFERÊNCIA");
        System.out.println(conta2.transferencia(100, conta3));

        System.out.println("_____________________");
        conta1.exibirDetalhes();
        conta2.exibirDetalhes();
        conta3.exibirDetalhes();
        System.out.println("_____________________");

        //g) A cada operação efetuada pode ir exibindo os detalhes das três contas para acompanhar as
        // evoluções dos saldos.
        System.out.println();
        System.out.println("TRANFERÊNCIA");

        System.out.println(conta2.transferencia(100, conta1));

        System.out.println("TRANFERÊNCIA");
        System.out.println(conta3.transferencia(400, conta2));

    }
}
