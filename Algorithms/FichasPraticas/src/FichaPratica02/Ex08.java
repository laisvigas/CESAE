package FichaPratica02;

// Escreva um programa que leia três notas (0-20 valores) de um aluno,
// calcule a sua média final ponderada, e diga se está aprovado ou não (mais de 9.5).
// Ponderações: Nota 1: 25%; Nota 2: 35%; Nota 3:40%

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double nota1, nota2, nota3, mediaPonderada;

        System.out.print("Insira a primeira nota: ");
        nota1 = input.nextDouble();

        System.out.print("Insira a primeira nota: ");
        nota2 = input.nextDouble();

        System.out.print("Insira a primeira nota: ");
        nota3 = input.nextDouble();

        mediaPonderada = (nota1 * 0.25f) + (nota2 * 0.35f) + (nota3 * 0.40f);

        if (mediaPonderada >= 9.5) {
            System.out.println("Aluno aprovado. Média: " + mediaPonderada);
        } else {
            System.out.println("Aluno reprovado. Média: " + mediaPonderada);
        }
    }
}
