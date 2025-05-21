package FichaPratica07;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

// Escreva um programa que leia o conteúdo de um ficheiro de texto e imprima o número de linhas
// e o número de palavras presentes nesse ficheiro.

public class Ex07 {
    public static void imprimirNumLinhasENumPalavras(String caminhoFicheiro) throws FileNotFoundException {
        File ficheiro = new File(caminhoFicheiro);
        Scanner sc = new Scanner(ficheiro);
        int contadorPalavras = 0;
        int contadorLinhas = 0;

        while (sc.hasNextLine()) {
            String linha = sc.nextLine();
            if (linha.length() != 0) {
                contadorLinhas++;
            }
            String[] itensDaLinha = linha.split(" ");
            for (int i = 0; i < itensDaLinha.length; i++) {
                if (linha.length() != 0){
                    contadorPalavras += 1;
                }
            }
        }
        System.out.println(contadorPalavras);
        System.out.println(contadorLinhas);
    }

    public static void main(String[] args) throws FileNotFoundException {
        imprimirNumLinhasENumPalavras("Ficheiros/exercicio_07.txt");
    }
}
