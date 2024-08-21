package br.com.solutis.conjunto.tres;

import java.util.Scanner;

/**
 * @author Aldemir Carlos Alves de Lima
 */
public class Questao44 {

    /*
    44. Modifique o problema anterior para que a quantidade de valores também seja fornecida
    pelo usuário.
    */

    public static void main(String[] args) {
        System.out.println("Exercício 44 - Calcule a média aritmética de uma quantidade de valores fornecida pelo usuário.");
        Scanner sc = new Scanner(System.in);

        double soma, valor, media;
        int quantidade;

        System.out.print("Digite quantos valores quer para calcular a média: ");
        quantidade = sc.nextInt();

        soma = 0.0;

        if (quantidade > 0) {
            System.out.println("Digite os " + quantidade + " valores:");

            for (int i = 1; i <= quantidade; i++) {
                System.out.print("Valor " + i + ": ");
                valor = sc.nextDouble();
                soma += valor;
            }

            media = soma / quantidade;

            System.out.println("A média aritmética dos " + quantidade + " valores é: " + media);
        } else {
            System.out.println("A quantidade de valores deve ser maior que zero.");
        }

        sc.close();
    }
}
