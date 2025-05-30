package Ex02;

// No Main:
//a) Instancie 3 Contas, definindo todos os seus atributos.
//b) Deposite algum valor nas contas.
//c) Tente efetuar um empréstimo recusado.
//d) Tente efetuar um empréstimo válido. (Teste a sua classe para todos os casos cenário).

public class Main {
    public static void main(String[] args){
        ContaBancaria conta1 = new ContaBancaria(1111, "Peaches");
        ContaBancaria conta2 = new ContaBancaria(2222, "Mario");
        ContaBancaria conta3 = new ContaBancaria(3333, "Luigi");

        System.out.println();
        System.out.println("DEPOSITO");
        System.out.println(conta1.depositar(100));
        System.out.println(conta2.depositar(100));
        System.out.println(conta3.depositar(100));

        System.out.println();
        System.out.println("SITUAÇÃO ATUAL DAS CONTAS");
        conta1.exibirDetalhes();
        System.out.println();
        conta2.exibirDetalhes();
        System.out.println();
        conta3.exibirDetalhes();

        System.out.println();
        System.out.println("EMPRESTIMOS RECUSADOS:");
        conta1.podePedirEmprestimo(51);
        System.out.println();

        System.out.println();
        System.out.println("SITUAÇÃO ATUAL DAS CONTAS");
        conta1.exibirDetalhes();
        System.out.println();
        conta2.exibirDetalhes();
        System.out.println();
        conta3.exibirDetalhes();

        System.out.println();
        System.out.println("EMPRESTIMOS VÁLIDOS:");
        conta3.podePedirEmprestimo(50);
        System.out.println();

        System.out.println();
        System.out.println("SITUAÇÃO ATUAL DAS CONTAS");
        conta1.exibirDetalhes();
        System.out.println();
        conta2.exibirDetalhes();
        System.out.println();
        conta3.exibirDetalhes();

        System.out.println();
        System.out.println("AMORTIZANDO CONTAS:");
        conta3.podeAmortizarEmprestimo(50);
        System.out.println();

        System.out.println();
        System.out.println("SITUAÇÃO ATUAL DAS CONTAS");
        conta1.exibirDetalhes();
        System.out.println();
        conta2.exibirDetalhes();
        System.out.println();
        conta3.exibirDetalhes();
    }
}
