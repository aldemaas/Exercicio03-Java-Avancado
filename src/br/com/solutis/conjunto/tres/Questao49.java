package br.com.solutis.conjunto.tres;

/**
 * @author Gabriel de Abreu Farias Azevedo
 */
public class Questao49 {

    /*
     49. Exiba os 50 primeiros números da seqüência de Fibonacci
     * //(1,1,2,3,5,8,13,21,34,55,89,144,233,377,...)
        */

    public static void main(String[] args) {
        // Lembrando que valores são iniciados com 0 e termina no 49, totalizando 50 primeiros
        for (int i = 0; i < 50; i++) {
            System.out.println("(" + i + "):" + fibonacci(i));
        }
    }

    public static long fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        long a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            long temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }
}
