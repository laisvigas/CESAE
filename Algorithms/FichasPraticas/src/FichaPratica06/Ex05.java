package FichaPratica06;

// a) Escreva uma função que recebe um array de inteiros como parâmetro e retorna o maior valor do array.
// b) Escreva uma função que recebe um array de inteiros como parâmetro e retorna o menor valor do array.
// c) Escreva uma função que recebe um array de inteiros como parâmetro e retorna se o array está crescente.

public class Ex05 {
    public static int maiorNumeroDoArray(int[] numero) {
        int maior = numero[1];

        for (int i = 0; i < numero.length; i ++) {
            if (numero[i] > maior) {
                maior = numero[i];
            }
        }
        return maior;
    }

    public static int menorNumeroDoArray(int[] numero) {
        int menor = numero[1];

        for (int i = 0; i < numero.length; i ++) {
            if (numero[i] < menor) {
                menor = numero[i];
            }
        }
        return menor;
    }

    public static boolean checarArrayCrescente(int[] numero) {

        boolean crescente = true;

        for (int i = 1; i < numero.length; i++) {
            if (numero[i] <= numero[i - 1]) {
                crescente = false;
            }
        }
        return crescente;
    }
}
