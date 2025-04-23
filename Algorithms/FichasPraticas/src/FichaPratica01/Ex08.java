package FichaPratica01;

// Escreva um programa que calcule a duração (no formato hh:mm:ss)
// de um álbum musical com 5 canções.
// A duração de cada canção é lida em minutos e segundos.

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        int minutos, segundos;
        int totalSegundos = 0;

        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.print("Introduza minutos da música " + i + ": ");
            minutos = input.nextInt();

            System.out.print("Introduza segundos da música " + i + ": ");
            segundos = input.nextInt();

            totalSegundos += (minutos * 60) + segundos;
        }

        int horas = totalSegundos / 3600;
        int resto = totalSegundos % 3600;
        int minutosFinais = resto / 60;
        int segundosFinais = resto % 60;

        System.out.printf("Duração total do álbum: " + horas + "h " + minutosFinais + "m " + segundosFinais + "s ");
    }
}