package Ex10;

public class ContaBancaria {
    private int IBAN;
    private String titular;
    private float saldo = 0;

    public ContaBancaria(int IBAN, String titular) {
        this.IBAN = IBAN;
        this.titular = titular;
    }

    public String depositar(float valor) {
        this.saldo += valor;
        return "€" + valor + " depositados na conta " + this.IBAN;
    }

    public String levantar(float valor){
        if (this.saldo - valor < 0) {
            return "Saldo insuficiênte na conta " + this.IBAN + ". Levantamento de " + valor + " foi recusado.";
        } else {
            this.saldo -= valor;
            return "€" + valor + " levantados da conta " + this.IBAN;
        }
    }

    public String transferencia(float valor, ContaBancaria contaDestino){
        if (this.saldo - valor < 0) {
            return "Saldo insuficiênte na conta " + this.IBAN
                    + ". Tranferência de " + valor + " para a conta " + contaDestino.IBAN + " foi recusado.";
        } else {
            this.saldo -= valor;
            contaDestino.saldo+=valor;
            return "€" + valor + " Transferidos da conta " + this.IBAN + " para a conta " + contaDestino.IBAN + " .";
        }
    }

    public void exibirDetalhes() {
        System.out.println("Titular: " + this.titular + " - IBAN: "+this.IBAN + " - Saldo: " + this.saldo+" €");
    }
}
