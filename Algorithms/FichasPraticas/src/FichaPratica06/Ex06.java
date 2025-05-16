package FichaPratica06;

import java.util.Arrays;
import java.util.Scanner;

import static FichaPratica06.Ex05.*;

public class Ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int tamanhoVetor;
        int[] vetor;
        int opcaoEscolhida;

        System.out.println(" ");
        System.out.println("ANALISE DE UM VETOR");
        System.out.print("Insira o tamanho do vetor: ");
        tamanhoVetor = input.nextInt();
        vetor = new int [tamanhoVetor];
        for (int i = 0; i < tamanhoVetor; i ++) {
            System.out.print("Insira o " + (i + 1) + "º valor no vetor: ");
            vetor[i] = input.nextInt();
        }

        System.out.println("ESCOLHA UMA OPÇÃO DO MENU");
        System.out.println("1. Maior Elemento");
        System.out.println("2. Menor Elemento");
        System.out.println("3. Crescente ou Não Crescente");
        System.out.print("Digite a sua opçao: ");
        opcaoEscolhida = input.nextInt();

        switch (opcaoEscolhida){
            case 1:
                System.out.println("O maior número do vetor é: " + maiorNumeroDoArray(vetor));
                break;
            case 2:
                System.out.println("O menor número do vetor é: " + menorNumeroDoArray(vetor));
                break;
            case 3:
                if (checarArrayCrescente(vetor)) {
                    System.out.println("O vetor está em ordem crescente");
                } else {
                    System.out.println("O vetor não está em ordem crescente");
                }
                break;
        }

    }
}
