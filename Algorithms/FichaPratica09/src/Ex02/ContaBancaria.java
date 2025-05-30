package Ex02;

public class ContaBancaria {
    private int IBAN;
    private String titular;
    private double saldo = 0;
    private int anoAbertura = 2025;
    private double margemEmprestimo = 0.5;
    private double valorDivida = 0;

    public ContaBancaria(int IBAN, String titular) {
        this.IBAN = IBAN;
        this.titular = titular;
    }

    public void exibirDetalhes() {
        System.out.println("Titular: " + this.titular +
                "\nIBAN: "+this.IBAN +
                "\nSaldo: " + this.saldo+" €" +
                "\nAno de abertura: " + this.anoAbertura +
                "\nMargem de emprestimo: " + this.margemEmprestimo +
                "\nValor da dívida: " + this.valorDivida);
    }

    public String depositar(double valor) {
        this.saldo += valor;
        return "€" + valor + " depositados na conta " + this.IBAN;
    }

    public String levantar(double valor){
        if (this.saldo - valor < 0) {
            return "Saldo insuficiênte na conta " + this.IBAN + ". Levantamento de " + valor + " foi recusado.";
        } else {
            this.saldo -= valor;
            return "€" + valor + " levantados da conta " + this.IBAN;
        }
    }

    public String transferencia(double valor, ContaBancaria contaDestino){
        if (this.saldo - valor < 0) {
            return "Saldo insuficiênte na conta " + this.IBAN
                    + ". Tranferência de " + valor + " para a conta " + contaDestino.IBAN + " foi recusado.";
        } else {
            this.saldo -= valor;
            contaDestino.saldo+=valor;
            return "€" + valor + " Transferidos da conta " + this.IBAN + " para a conta " + contaDestino.IBAN + " .";
        }
    }

    public boolean podePedirEmprestimo(double valorAPedir) {
        double valorMaximoASerEmprestado = this.saldo * this.margemEmprestimo;
        if (this.valorDivida > 0) {
            System.out.print("HÁ DÍVIDAS A PAGAR");
            return false;
        } else {
            if (valorAPedir > valorMaximoASerEmprestado ) {
                System.out.print("VALOR MUITO ALTO");
                return false;
            }
        }
        System.out.println("EMPRESTIMO CONCEDIDO");
        this.saldo += valorAPedir;
        valorDivida += valorAPedir;
        return true;
    }

    public boolean podeAmortizarEmprestimo(double valor){
        if (this.saldo < valor){
            System.out.print("SALDO INSUFICIENTE");
            return false;
        } else {
            if (valor > this.valorDivida) {
                System.out.print("VALOR EM EXCESSO");
                return false;
            }
        }
        this.saldo -= valor;
        this.valorDivida -= valor;
        return true;
    }
}
