package FichaPratica06;
import java.util.Scanner;

import static FichaPratica06.Ex03.*;

public class Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int userInputNumero = 0;
        int opcaoEscolhida = 6;

        // Ler input
        while (opcaoEscolhida == 6) {
            System.out.println(" ");
            System.out.println("ANALISE DE NÚMEROS");
            System.out.print("Insira um número para ser analisado: ");
            userInputNumero = input.nextInt();
            System.out.println("ESCOLHA UMA OPÇÃO DO MENU");
            System.out.println("1. Par ou Ímpar");
            System.out.println("2. Positivo ou Negativo");
            System.out.println("3. Primo ou Não Primo");
            System.out.println("4. Perfeito ou Não Perfeito");
            System.out.println("5. Triangular ou Não Triangular");
            System.out.println("6. Trocar de Número");
            System.out.print("Digite a sua opçao: ");
            opcaoEscolhida = input.nextInt();
        }

        System.out.println(" ");
        System.out.println("*****ANALISE*****");

        switch (opcaoEscolhida){
            case 1:
                if (parOuImpar(userInputNumero)) {
                    System.out.println("O número " + userInputNumero + " é um número par");
                } else {
                    System.out.println("O número " + userInputNumero + " é um número ímpar");
                }
                break;
            case 2:
                if (positivoOuNegativo(userInputNumero)) {
                    System.out.println("O número " + userInputNumero + " é um número positivo");
                } else {
                    System.out.println("O número " + userInputNumero + " é um número negativo");
                }
                break;
            case 3:
                if (checarNumeroPrimo(userInputNumero)) {
                    System.out.println("O número " + userInputNumero + " é um número primo");
                } else {
                    System.out.println("O número " + userInputNumero + " é não é um número primo");
                }
                break;
            case 4:
                if (checarNumeroPerfeito(userInputNumero)) {
                    System.out.println("O número " + userInputNumero + " é um número perfeito");
                } else {
                    System.out.println("O número " + userInputNumero + " é não é um número perfeito");
                }
                break;
            case 5:
                if (checarNumeroTriangular(userInputNumero)) {
                    System.out.println("O número " + userInputNumero + " é um número triangular");
                } else {
                    System.out.println("O número " + userInputNumero + " é não é um número triangular");
                }
                break;
            default:
                System.out.println("Essa opção não está disponível");
        }
    }
}
