package FichaPratica06;

// Implemente funções que, dadas 2 matrizes de inteiros com a mesma dimensão,
// apresente (numa função) em forma de matriz o resultado da soma das 2 matrizes
// e (noutra função) o somatório dos seus elementos.

public class Ex08 {
    static int somatorioMatrizes(int[ ][ ] matriz1, int[ ][ ] matriz2) {
        int somatorioMatrizes = 0;

        for(int linha = 0; linha < matriz1.length; linha++) {
            for (int coluna = 0; coluna < matriz1[0].length; coluna++) {
                somatorioMatrizes = matriz1[linha][coluna] + matriz2[linha][coluna];
            }
        }

        return somatorioMatrizes;
    }

    static void somarMatrizes(int[ ][ ] matriz1, int[ ][ ] matriz2){

        int [][] somaMatrizes = new int[matriz1.length][matriz1[0].length];

        // somar matrizes
        for(int linha = 0; linha < matriz1.length; linha++) {
            for (int coluna = 0; coluna < matriz1[0].length; coluna++) {
                somaMatrizes[linha][coluna] = matriz1[linha][coluna] + matriz2[linha][coluna];
            }
        }

        // imprimir resultado
        for(int linha = 0; linha < matriz1.length; linha++) {
            for (int coluna = 0; coluna < matriz1[0].length; coluna++) {
                System.out.print(somaMatrizes[linha][coluna] + "  |  ");
            }
            System.out.println(" ");
        }
    }
}
