package FichaPratica03;

// Faça um programa que vai pedindo números ao utilizador até que este introduza o número -1.
// O computador deve dizer a média dos números introduzidos (excluindo o -1).

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float numero = 0;
        float soma = 0;
        float contador = 0;
        float media;


        while(numero != -1)
        {
            System.out.print("Insira um número: ");
            numero = input.nextFloat();

            if (numero != -1)
            {
                soma += numero;
                contador += 1;
            }
        }
        media = soma / contador;
        System.out.print("Média: " + media);
    }
}
