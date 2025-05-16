package FichaPratica06;
import java.util.Scanner;

import static FichaPratica06.Ex07.desenharQuadrado;

public class Ex07exe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Insira o numero de linhas: ");
        int linha = input.nextInt();

        System.out.print("Insira o numero de colunas: ");
        int coluna = input.nextInt();

        System.out.print("Insira o caracter: ");
        String caracter = input.next();

        desenharQuadrado(linha, coluna, caracter);
    }
}
