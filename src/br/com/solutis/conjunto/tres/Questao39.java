package br.com.solutis.conjunto.tres;

import java.util.Scanner;

/**
 * @author Kauê Alexandre dos Reis Santos
 */
public class Questao39 {

    /*
    39. Verifique se um número é perfeito, ou seja, se a soma dos seus divisores (exceto o próprio
    número) é igual a ele mesmo.
     */

    public static void main(String[] args) {
        System.out.println("Exercício 39 - Verificação de número perfeito");
        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.println("Digite um número para verificar se é perfeito (Números perfeitos: 6, 28. 496 e 9128:");
        numero = sc.nextInt();

        if (numero <= 0) {
            System.out.println("O número deve ser positivo.");
        } else if (NumPerfeito(numero)) {
            System.out.println(numero + " é um número perfeito. " +
                    "Poís a soma dos seus divisores é igual a ele mesmo.");
        } else {
            System.out.println(numero + " não é um número perfeito.");
        }

        sc.close();
    }

    // Verificando se o número é perfeito
    private static boolean NumPerfeito(int numero) {
        int somaDivisores = 0;

        for (int i = 1; i <= numero / 2; i++) {
            if (numero % i == 0) {
                somaDivisores += i;
                System.out.println("Divisível por: " + i);
            }
        }

        return somaDivisores == numero;
    }
}
