package FichaPratica02;

import java.util.Scanner;

// Leia dois números inteiros e escreva na consola o maior deles.
public class Ex01 {
    public static void main(String[] args) {
        int valor1, valor2;

        Scanner input = new Scanner(System.in);

        System.out.print("Introduza o primeiro valor: ");
        valor1 = input.nextInt();

        System.out.print("Introduza o segundo valor: ");
        valor2 = input.nextInt();

        if (valor1 > valor2) {
            System.out.print("Entre " + valor1 + " e " + valor2 + " O maior valor é o: " + valor1);
        }
        else if (valor1 < valor2) {
            System.out.print("Entre " + valor1 + " e " + valor2 + " O maior valor é o: " + valor2);
        }
        else {
            System.out.print("O valor " + valor1 + " e valor " + valor2 + " são iguais");
        }
    }
}
