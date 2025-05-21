package FichaPratica07;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// Escreva um programa que leia um ficheiro CSV (Comma-Separated Values)
// e imprima o conteúdo na consola.

public class Ex04 {
    public static void lerFicheiroCSV(String caminhoFicheiro) throws FileNotFoundException {
        File ficheiro = new File(caminhoFicheiro);
        Scanner sc = new Scanner(ficheiro);

        while (sc.hasNextLine()) {
            String linha = sc.nextLine();
            System.out.println(linha);
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        lerFicheiroCSV("Ficheiros/exercicio_04.csv");
    }

}
