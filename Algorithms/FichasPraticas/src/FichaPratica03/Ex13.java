package FichaPratica03;
import java.util.Scanner;

// Faça um algoritmo que leia dois números inteiros,
// representando os valores início e fim de um intervalo e imprima os múltiplos de 5 entre eles.

public class Ex13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numeroInicio = 0, intervalo = 0;

        System.out.print("Digite um número: ");
        numeroInicio = input.nextInt();

        System.out.print("Digite outro número: ");
        intervalo = input.nextInt();

        while (numeroInicio <= intervalo) {
            if (numeroInicio % 5 == 0) {
                System.out.println(numeroInicio);
            }
            numeroInicio += 1;
        }
    }
}
