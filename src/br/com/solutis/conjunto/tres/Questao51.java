package br.com.solutis.conjunto.tres;

import java.util.Scanner;

/**
 * @author Pedro Messias de Lucena Maia
 */
public class Questao51 {

    /*
    51. Exiba os n primeiros termos da seqüência de Tribonacci (soma dos três anteriores). Inicia
    com 1,1 e 2.
     */
    public static void main(String[] args) {
        System.out.println("Exercício 51 - Exiba os n primeiros termos da sequência de Tribonacci (soma dos três anteriores). Inicia com 1,1 e 2.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero de termos da sequência de Tribonacci: ");

        int n;

        n = sc.nextInt();
        sc.close();
        // Validador
        if (n <= 0){
            System.out.println("O numero de termos deve ser positivo");
        }

        imprimirTribonacci(n);
    }


    public static void imprimirTribonacci(int n){
        if (n >= 1)
            System.out.print("1 ");
        if (n >= 2)
            System.out.print("1 ");
        if (n >= 3)
            System.out.print("2 ");
        int a = 1, b = 1, c = 2;

        for (int i = 4; i <= n; i++) {
            int proximo = a + b + c;
            System.out.print(proximo + " ");
            // Atualizando os valores de a, b e c

            a = b;
            b = c;
            c = proximo;
        }
        System.out.println();
    }
}
