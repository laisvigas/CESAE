package FichaPratica04;

// Crie um jogo, que peça ao jogador 1 um valor entre 0 e 100.
// De seguida, deverá permitir ao jogador 2 tentar acertar no valor inserido pelo jogador 1.
// A cada iteração, enquanto o valor não for descoberto,
// deverá informar se o valor introduzido pelo jogador 2 é inferior ou superior ao valor inserido pelo jogador 1.
// No final (quando o valor é descoberto) deverá apresentar o número de tentativas que o jogador 2 necessitou para acertar.

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int valorEscolhido, palpite;
        int tentativas = 0;

        System.out.print("Escolha um valor entre 1 e 100: ");
        valorEscolhido = input.nextInt();

        do {
            System.out.print("Palpite: ");
            palpite = input.nextInt();

            if (palpite != valorEscolhido) {
                tentativas++;
                if (palpite < valorEscolhido) {
                    System.out.println("O palpite é menor que o número misterioso");
                } else {
                    System.out.println("O palpite é maior que o número misterioso");
                }
            }

        } while (palpite != valorEscolhido);

        System.out.println("Você acertou! O número misterioso é " + valorEscolhido);
        System.out.println("Número de tentativas até acertar: " + tentativas);
    }
}
