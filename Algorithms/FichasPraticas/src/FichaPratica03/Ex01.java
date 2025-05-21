package FichaPratica03;

// Faça um programa que imprima os números no intervalo de 1 a 250 inclusive.
// (Não necessita de Scanner ou input do utilizador).

public class Ex01 {
    public static void main(String[] args) {
        int numero = 1;

        while(numero <= 250) {
            System.out.println(numero);
            numero += 1;
        }
    }
}
