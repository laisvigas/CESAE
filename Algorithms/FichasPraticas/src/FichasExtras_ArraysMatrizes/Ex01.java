package FichasExtras_ArraysMatrizes;
import java.util.Scanner;

// Escreva um programa que permita adicionar 14 números inteiros
// a um array e que os imprima pela ordem de inserção.

public class Ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] vetor = new int[14];

        // Ler valores para vetor
        for(int i = 0; i < vetor.length; i++) {
            System.out.print("Insira um valor no array [" + i + "]: ");
            vetor[i] = input.nextInt();
        }

        // imprimir valores
        for(int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }
}
