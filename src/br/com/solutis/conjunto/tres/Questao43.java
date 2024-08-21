package br.com.solutis.conjunto.tres;

import java.util.Scanner;

public class Questao43 {

    /*
    43. Calcule a média aritmética de 500 valores fornecidos pelo usuário.
     */

    public static void main(String[] args) {
        System.out.println("Exercício 43 - Calcule a média aritmética de 500 valores fornecidos pelo usuário.");
        Scanner sc = new Scanner(System.in);

        int quantidadeValores = 500;
        double somaValores = 0;

        System.out.println("Digite " + quantidadeValores + " valores:");

        for (int i = 0; i < quantidadeValores; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            double valor = sc.nextDouble();

            somaValores += valor;
        }

        double media = somaValores / quantidadeValores;

        System.out.println("A média aritmética dos valores fornecidos é: " + media);

        sc.close();
    }
}
