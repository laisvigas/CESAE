package FichaPratica03;

// Faça um programa que imprima os números ímpares
// no intervalo de 531 a 750 inclusive. (Não necessita de Scanner ou input do utilizador)

public class Ex03 {
    public static void main(String[] args) {
        int numero = 531;

        while(numero <= 750) {
            System.out.println(numero);
            numero += 2;
        }
    }
}
