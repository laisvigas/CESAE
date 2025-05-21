package FichaPratica06;
import java.util.Scanner;

// Escreva uma função que leia um valor inteiro positivo (deve solicitar números até que seja inteiro e positivo)
// e crie uma função que imprima numa linha um número de asteriscos igual ao valor inserido pelo utilizador.

public class Ex02 {
        public static int lerNumerosAcimaDeZero() {
            Scanner input = new Scanner(System.in);
            int inputNumero = 0;

            while (inputNumero <= 0) {
                System.out.print("Introduza um número: ");
                inputNumero = input.nextInt();
            }

            return inputNumero;
        }


        public static void imprimirQuantidadeAsteriscos(int numeroAsteriscos) {
        for (int i = 0; i < numeroAsteriscos; i++) {
            System.out.print("*");
        }
    }
}
