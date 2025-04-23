package FichaPratica02;
import java.util.Scanner;

// Escreva um programa que leia dois valores numéricos
// e apresente o menor e depois o maior.

public class Ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero1, numero2;

        System.out.print("Escreva um numero: ");
        numero1 = input.nextInt();

        System.out.print("Escreva outro numero: ");
        numero2 = input.nextInt();

        if (numero1 > numero2) {
            System.out.print(numero1 + " " + numero2);
        } else if (numero2 > numero1) {
            System.out.print(numero2 + " " + numero1);
        } else {
            System.out.println("Os números são iguais");
        }
    }
}
