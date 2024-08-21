package br.com.solutis.conjunto.dois;

import java.util.Scanner;

/**
 * @author Kauê Alexandre dos Reis Santos
 */
public class Questao19 {

    /*
    19. Exiba dois números fornecidos pelo usuário em ordem crescente
     */

    public static void main(String[] args) {
        System.out.println("Exercício 19 - 2 Números em ordem crescente");
        Scanner sc = new Scanner(System.in);
        int num1, num2;

        System.out.print("Digite o primeiro número: ");
        num1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        num2 = sc.nextInt();

        if (num1 < num2) {
            System.out.println("Ordem crescente: " + num1 + ", " + num2);
        } else {
            System.out.println("Ordem crescente: " + num2 + ", " + num1);
        }

        sc.close();
    }
}
