package FichaPratica02;

// Implemente um programa que, após pedir ao utilizador o saldo da conta bancária
// e montante a creditar/debitar (montante positivo ou negativo, respetivamente),
// apresente se a operação é válida, ou seja, se o saldo final se mantém positivo depois da operação.
// Finalmente, mostre o novo saldo.

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double saldoMedio, valorMovimentar, movimentacao;

        System.out.print("Introduza o saldo médio: ");
        saldoMedio = input.nextDouble();

        System.out.print("Introduza o valor a movimentar: ");
        valorMovimentar = input.nextDouble();

        if (valorMovimentar < 0 && valorMovimentar < saldoMedio - valorMovimentar) {
            System.out.print("Operação inválida. Saldo insuficiente.");
            System.out.print("Saldo Atual: " + saldoMedio);
        } else {
            movimentacao = saldoMedio + valorMovimentar;
            System.out.print("Saldo Atual: " + movimentacao);
        }
    }
}
