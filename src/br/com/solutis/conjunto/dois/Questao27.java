package br.com.solutis.conjunto.dois;

import java.util.Scanner;

/**
 * @author Gabriel de Abreu Farias Azevedo
 */
public class Questao27 {

    /*
     *   27. Descubra e apresente o maior entre três números fornecidos pelo usuário. Caso eles sejam
     *   iguais, avise ao usuário.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1, num2, num3;

        System.out.print("Informe o primeiro numero: ");
        num1 = sc.nextInt();

        System.out.print("Informe o segundo numero: ");
        num2 = sc.nextInt();

        System.out.print("Informe o terceiro numero: ");
        num3 = sc.nextInt();

        if (num1 == num2 && num2 == num3) {
            System.out.println("Os três numeros fornecidos são iguais");
        } else if (num1 == num2) {
            System.out.println("Apenas o primeiro e o segundo numero são iguais");
        } else if (num1 == num3) {
            System.out.println("Apenas o primeiro e o terceiro numero iguais");
        } else if (num2 == num3) {
            System.out.println("Apenas o segundo e o terceiro numero informado são iguais");
        } else {
            System.out.println("Nenhum numero fornecido é igual");
        }

        if (num1 > num2 && num1 > num3) {
            System.out.println("Informação que o usuário digitou primeiro é o maior");
        }

        if (num2 > num3 && num2 > num1) {
            System.out.println("Informação que o usuário digitou segundo é o maior");
        }

        if (num3 > num2 && num3 > num1) {
            System.out.println("Informação que o usuário digitou na terceira vez é o maior");
        }

        sc.close();
    }
}
