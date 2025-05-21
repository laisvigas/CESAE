package FichaPratica05;
import java.util.Arrays;
import java.util.Scanner;

// Implemente um programa que permita adicionar comissões mensais
// a um array de tamanho 12 (uma posição para cada mês) e calcular o seu total anual.

public class Ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] comissoesMensais = new int[12];
        int totalComissao = 0;

        // Ler vetor
        for(int i = 0; i < comissoesMensais.length; i++) {
            System.out.print("Insira a comissão do mês " + (i + 1) + ": ");
            comissoesMensais[i] = input.nextInt();
            totalComissao += comissoesMensais[i];
        }

        System.out.print("Comissão total: €" + totalComissao);
    }
}
