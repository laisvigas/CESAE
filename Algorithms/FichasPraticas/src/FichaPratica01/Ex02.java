package FichaPratica01;
import java.util.Scanner;

// Escreva um programa que requisite dois valores.
// O programa deverá utilizá-los como operandos para as seguintes
// operações aritméticas: soma, subtração, multiplicação e divisão.
// Apresente o resultado das operações e teste os resultados obtidos com vários casos.

public class Ex02 {
    public static void main(String[] args) {
        float input1, input2, soma, sub, mult, div;

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        input1 = input.nextFloat();

        System.out.print("Digite outro número: ");
        input2 = input.nextFloat();

        soma = input1 + input2;
        sub = input1 - input2;
        mult = input1 * input2;
        div = input1 / input2;

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + sub);
        System.out.println("Multiplicação: " + mult);
        System.out.println("Divisão: " + div);
    }
}
