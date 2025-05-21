package FichaPratica06;
import java.util.Scanner;

// 7. Escreva um programa para desenhar um quadrado no ecrã.
// Esse quadrado deverá ser desenhado por uma função para a qual são passados três argumentos:
// caracter a utilizar:
//  - caracter
//  - número de linhas
//  - número de colunas
// > Introduza um caracter: z
// > Introduza número de linhas: 4
// > Introduza número de colunas: 6
// Segue-se um exemplo do algoritmo a ser executado, ilustrando o pretendido:
// zzzzzz
// z    z
// z    z
// zzzzzz

public class Ex07 {
    public static void desenharQuadrado(int tamanhoLinha, int tamanhoColuna, String caracter) {
        String[][] matriz = new String[tamanhoLinha][tamanhoColuna];

        // popular matriz
        for(int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                matriz[linha][coluna] = caracter;
            }
        }

        // imprimir matriz
        for(int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                if (linha == 0 || linha + 1 == matriz.length) {
                    System.out.print(matriz[linha][coluna]);
                } else {
                    if (coluna == 0 ) {
                        System.out.print(matriz[linha][coluna]);
                    } else {
                        System.out.print(" ");
                    }
                    if (coluna == matriz.length) {
                        System.out.print(matriz[linha][coluna]);
                    }
                }
            }

            System.out.println(" ");
        }
    }
}
