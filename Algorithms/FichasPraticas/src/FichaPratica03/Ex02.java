package FichaPratica03;

// Faça um programa que imprima os números pares no intervalo de 1 a 400 inclusive.
// (Não necessita de Scanner ou input do utilizador).

public class Ex02 {
    public static void main(String[] args) {
        int numero = 0;

        while(numero <= 400) {
            System.out.println(numero);
            numero += 2;
        }
    }
}
