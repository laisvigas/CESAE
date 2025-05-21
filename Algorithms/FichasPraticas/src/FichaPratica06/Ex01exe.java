package FichaPratica06;
import java.util.Scanner;

import static FichaPratica06.Ex01.fazerBarulho;

public class Ex01exe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Insira o animal: ");
        String animal = input.next();

        fazerBarulho(animal);
    }
}
