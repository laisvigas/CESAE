package FichaPratica02;
import java.util.Scanner;

// Escreva um programa que lê um valor em euros (múltiplo de 5)
// e calcula qual o menor número possível de notas de 200, 100, 50, 20, 10, 5
// em que o valor pode ser decomposto. Escrever o valor lido e a relação de notas necessárias.

public class Ex16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int dinheiro;
        int novoValor;
        int notasCinco, notasDez, notasVinte, notasCinquenta, notasCem, notasDuzentos;

        System.out.print("Insira o valor em euros (apenas múltiplos de 5): ");
        dinheiro = input.nextInt();

        // DUZENTOS
        if (dinheiro / 200 < 1)
        {
            notasDuzentos = 0;
        } else {
            notasDuzentos = dinheiro / 200;
        }
        novoValor = dinheiro - notasDuzentos * 200;
        System.out.println(novoValor);

        // CEM
        if (novoValor / 100 < 1)
        {
            notasCem = 0;
        } else {
            notasCem = novoValor / 100;
        }
        novoValor = novoValor - notasCem * 100;

        // CINQUENTA
        if (novoValor / 50 < 1)
        {
            notasCinquenta = 0;
        } else {
            notasCinquenta = novoValor / 50;
        }
        novoValor = novoValor - notasCinquenta * 50;

        // VINTE
        if (novoValor / 20 < 1)
        {
            notasVinte = 0;
        } else {
            notasVinte = novoValor / 20;
        }
        novoValor = novoValor - notasVinte * 20;

        // DEZ
        if (novoValor / 10 < 1)
        {
            notasDez = 0;
        } else {
            notasDez = novoValor / 10;
        }
        novoValor = novoValor - notasDez * 10;

        // CINCO
        if (novoValor / 5 < 1)
        {
            notasCinco = 0;
        } else {
            notasCinco = novoValor / 5;
        }
        novoValor = novoValor - notasCinco * 5;


        System.out.println("quantidade de notas de 200: " + notasDuzentos);
        System.out.println("quantidade de notas de 100: " + notasCem);
        System.out.println("quantidade de notas de 50: " + notasCinquenta);
        System.out.println("quantidade de notas de 20: " + notasVinte);
        System.out.println("quantidade de notas de 10: " + notasDez);
        System.out.println("quantidade de notas de 5: " + notasCinco);

    }
}