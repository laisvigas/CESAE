package FichaPratica02;
import java.util.Scanner;

// Um banco autoriza a conceção de um crédito especial aos seus clientes, num montante variável com base no seu
//saldo médio do último ano. Faça um programa que leia o saldo médio de um cliente e calcule o valor do crédito
//especial de acordo com a seguinte tabela. Mostre uma mensagem com o saldo médio e o valor de crédito.

// Saldo Médio ------------------- Percentagem
//De 0 a 2000 (inclusive) -------- Nenhum crédito
//De 2000 a 4000 (inclusive) ----- 20% do valor do saldo médio
//De 4000 a 6000 (inclusive) ----- 30% do valor do saldo médio
//Acima de 6000 -------------------40% do valor do saldo médio

public class Ex17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double saldoMedio, credito;

        System.out.print("Digite o saldo médio do último ano: ");
        saldoMedio = input.nextDouble();

        if (saldoMedio <= 2000) {
            credito = 0;
        } else if (saldoMedio <= 4000) {
            credito = saldoMedio * 0.20;
        } else if (saldoMedio <= 6000) {
            credito = saldoMedio * 0.30;
        } else {
            credito = saldoMedio * 0.40;
        }

        System.out.println("Saldo médio: " +  saldoMedio);
        System.out.println("Crédito especial concedido: " + credito);
    }
}
