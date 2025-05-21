package FichaPratica02;
import java.util.Scanner;

// Escreva um programa que leia 3 números,
// seguidamente deve perguntar ao utilizador se quer ordem crescente ‘C’ ou decrescente ‘D’,
// e deve colocar os números no ecrã por ordem decrescente ou crescente de acordo com a escolha.

public class Ex15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero1, numero2, numero3, menorValor, valorDoMeio, maiorValor;
        String opcao;

        System.out.print("Insira o primeiro número: ");
        numero1 = input.nextInt();

        System.out.print("Insira o segundo número: ");
        numero2 = input.nextInt();

        System.out.print("Insira o terceiro número: ");
        numero3 = input.nextInt();

        System.out.print("Escolha em que ordem deseja ver os números");
        System.out.println("Crescente (C) | Decrescente (D): ");
        opcao = input.next();

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

        switch(opcao) {
            case "C":
                System.out.println(menorValor + " " + valorDoMeio + " " + maiorValor);
                break;
            case "D":
                System.out.println(maiorValor + " " + valorDoMeio + " " + menorValor);
                break;
            default:
                System.out.println("Operação inválida");
                break;
        }
    }
}
