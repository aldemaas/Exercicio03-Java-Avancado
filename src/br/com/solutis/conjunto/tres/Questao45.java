package br.com.solutis.conjunto.tres;

import java.util.Scanner;

/**
 * @author Aldemir Carlos Alves de Lima
 */
public class Questao45 {

    /*
    45. Determine o maior valor de uma lista de 100 números fornecidos pelo usuário.
     */

    public static void main(String[] args) {
        System.out.println("Exercício 45 - Determine o maior valor de uma lista de 100 números fornecidos pelo usuário.");
        Scanner sc = new Scanner(System.in);

        int valor, maiorValor;

        maiorValor = Integer.MIN_VALUE;

        System.out.println("Digite 100 números:");

        for (int i = 1; i <= 100; i++) {
            System.out.print("Valor " + i + ": ");
            valor = sc.nextInt();

            if (valor > maiorValor) {
                maiorValor = valor;
            }
        }

        System.out.println("O maior valor fornecido é: " + maiorValor);

        sc.close();
    }
}
