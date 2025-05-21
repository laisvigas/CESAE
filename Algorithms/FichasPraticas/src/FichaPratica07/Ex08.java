package FichaPratica07;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// Escreva um programa que leia um ficheiro CSV contendo informações de vendas (tipo de produto, produto,
// quantidade vendida, valor unitario) e calcule o valor total das vendas.

public class Ex08 {
    public static double calcularValorTotalVendas(String caminhoFicheiro) throws FileNotFoundException {
        File ficheiro = new File(caminhoFicheiro);
        Scanner sc = new Scanner(ficheiro);
        sc.nextLine();
        double quantidadeVendida = 0;

        while (sc.hasNextLine()) {
            String linha = sc.nextLine();
            String[] itensDaLinha = linha.split(",");
            quantidadeVendida += Double.parseDouble(itensDaLinha[2]);
        }

        sc.close();

        return quantidadeVendida;

    }

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(calcularValorTotalVendas("Ficheiros/exercicio_08.csv"));
    }
}
