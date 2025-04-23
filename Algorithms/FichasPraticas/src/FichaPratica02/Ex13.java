package FichaPratica02;
import java.util.Scanner;

// Faça um programa que leia um horário no sistema de 24 horas e imprima esse horário no sistema de 12 horas.
// Exemplo: Valores Lidos: 22 32 Resultado: 10 32 PM
// Valores Lidos: 10 44 Resultado: 10 44 AM

public class Ex13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int horas, minutos, novaHora;

        System.out.print("Introduza as horas: ");
        horas = input.nextInt();

        System.out.print("Introduza os minutos: ");
        minutos = input.nextInt();

        if (horas == 24 || horas == 0)
        {
            System.out.println("00 : " + minutos + " AM");
        } else if (horas > 12 && horas < 24) {
            novaHora = horas - 12;
            System.out.println(novaHora + ":" + minutos + " PM");
        } else if (horas > 0 && horas <= 12) {
            System.out.println(horas + ":" + minutos + " AM");
        }
        else {
            System.out.println("Hora inválida");
        }
    }
}
