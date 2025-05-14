package FichaPratica06;

// a) Implemente uma função que determina se um número (passado por argumento) é par ou ímpar,
// a função deve retornar true se par ou false se ímpar.

// b) Implemente uma função que determina se um número (passado por argumento) é positivo ou negativo,
// a função deve retornar true se zero ou positivo, ou false se negativo.

// c) Implemente uma função que determina se um número (passado por argumento) é ou não primo,
// a função deve retornar true se primo ou false se não primo.

// d) Implemente uma função que determina se um número (passado por argumento) é perfeito,
// a função deve retornar true se perfeito ou false se não perfeito
// (Os números perfeitos são iguais à soma dos seus divisores: 6 pode ser dividido por 1, 2 e 3 e,
// quando soma esses números, o resultado é 6).

public class Ex03 {
    public static boolean parOuImpar(int numero) {
        return numero % 2 == 0;
    }

    public static boolean positivoOuNegativo(int numero) {
        return numero >= 0;
    }

    public static boolean checarNumeroPrimo(int numero) {
        boolean eNumeroPrimo = true;

        if (numero <= 1) {
            eNumeroPrimo = false;
        } else {
            for (int i = 2; i <= numero / 2; i++) {
                if (numero % i == 0) {
                    eNumeroPrimo = false;
                    break;
                }
            }
        }

        return eNumeroPrimo;
    }
}