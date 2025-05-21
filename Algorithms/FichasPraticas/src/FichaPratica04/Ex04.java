// Escreva um programa que indique se um número pedido ao utilizador é primo.
// (Chamamos de número primo um número natural que só possui dois divisores: 1 e ele mesmo).
// (Por exemplo: 1, 2, 3, 5, 7, 11, 13, 17, 19, 23, etc…)

package FichaPratica04;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número para saber se ele é primo: ");
        int numero = input.nextInt();

        boolean eNumeroPrimo = true;

        if (numero <= 1) {
            eNumeroPrimo = false;
        } else {
            for (int i = 2; i <= numero / 2; i++) {
                if (numero % i == 0) {
                    eNumeroPrimo = false;
                    break;
                }
            }
        }

        if (eNumeroPrimo) {
            System.out.println(numero + " é um número primo");
        } else {
            System.out.println(numero + " não é um número primo");
        }
    }
}