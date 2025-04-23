package FichaPratica02;
import java.util.Scanner;

// 14. Escreva um programa que leia 3 números,
// seguidamente deve colocar os números no ecrã por ordem crescente.

public class Ex14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero1, numero2, numero3, menorValor, valorDoMeio, maiorValor;

        System.out.print("Insira o primeiro número: ");
        numero1 = input.nextInt();

        System.out.print("Insira o segundo número: ");
        numero2 = input.nextInt();

        System.out.print("Insira o terceiro número: ");
        numero3 = input.nextInt();

        if (numero1 > numero2 && numero1 > numero3) {
            maiorValor = numero1;
        } else if (numero2 > numero1 && numero2 > numero3) {
            maiorValor = numero2;
        } else {
            maiorValor = numero3;
        }

        if (numero1 < numero2 && numero1 < numero3) {
           menorValor = numero1;
        } else if (numero2 < numero1 && numero2 < numero3) {
            menorValor = numero2;
        } else {
            menorValor = numero3;
        }

        valorDoMeio = numero1 + numero2 + numero3 - menorValor - maiorValor;

        System.out.println(menorValor);
        System.out.println(valorDoMeio);
        System.out.println(maiorValor);
    }
}
