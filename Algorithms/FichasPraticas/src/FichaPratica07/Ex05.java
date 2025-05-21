package FichaPratica07;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// Escreva um programa que leia um ficheiro de texto contendo números inteiros separados
// por espaço e calcule a soma desses números.

public class Ex05 {
    public static int calcularSomaFicheiro(String caminhoFicheiro) throws FileNotFoundException {
        File ficheiro = new File(caminhoFicheiro);
        Scanner sc = new Scanner(ficheiro);
        int soma = 0;

        while (sc.hasNextLine()) {
            String linha = sc.next();
            soma += Integer.parseInt(linha);
        }
        return soma;
    }

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(calcularSomaFicheiro("Ficheiros/exercicio_05_31.txt"));
    }
}
