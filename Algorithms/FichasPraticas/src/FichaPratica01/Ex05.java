package FichaPratica01;

// Escreva um programa que determine a média aritmética
// de um conjunto de 3 valores introduzidos pelo utilizador.
// Tendo em consideração os valores introduzidos, deverá também apresentar
// a média ponderada considerando as seguintes ponderações: 20%, 30%, 50%.

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        double input1, input2, input3, mediaAritimetica, mediaPonderada;
        Scanner input = new Scanner(System.in);

        System.out.print("Introduza o primeiro valor: ");
        input1 = input.nextDouble();

        System.out.print("Introduza o segundo valor: ");
        input2 = input.nextDouble();

        System.out.print("Introduza o terceiro valor: ");
        input3 = input.nextDouble();

        mediaAritimetica = (input1 + input2 + input3) / 3;
        mediaPonderada = (input1 * 0.2f) + (input2 * 0.3f) + (input3 * 0.5f);

        System.out.println("A média dos valores é: " + mediaAritimetica);
        System.out.println("A média ponderada dos valores é: " + mediaPonderada);
    }
}
