package FichaPratica05;
import java.util.Arrays;
import java.util.Scanner;

// Implemente um programa que permita adicionar
// 10 números inteiros a um array e que os imprima pela ordem de inserção.

public class Ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] vetor = new int[10];

        // Ler vetor
        for(int i = 0; i < vetor.length; i++) {
            System.out.print("Insira o valor no vetor[" + i + "]: ");
            vetor[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(vetor));

        // Imprimir vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("vetor[" + i + "]: " + vetor[i]);
        }
    }
}
