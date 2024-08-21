package br.com.solutis.conjunto.quatro;

import java.util.Scanner;

/**
 * @author Aldemir Carlos Alves de Lima
 */
public class Questao63 {

    /*
    63. Desenhe a seguinte pirâmide de números.
    O usuário determina a quantidade de linhas.
    01
    01 02
    01 02 03
    01 02 03 04
    01 02 03 04 05
    01 02 03 04 05 06
    01 02 03 04 05 06 07
    01 02 03 04 05 06 07 08
    01 02 03 04 05 06 07 08 09
    01 02 03 04 05 06 07 08 09 10
    01 02 03 04 05 06 07 08 09 10 11
    ...
     */

    public static void main(String[] args) {
        System.out.println("Exercício 63 - desenha uma pirâmide de números com o número de linhas determinado pelo usuário.");
        Scanner sc = new Scanner(System.in);
        int linhas;

        System.out.print("Digite a quantidade de linhas para a pirâmide: ");
        linhas = sc.nextInt();

        for (int i = 1; i <= linhas; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.printf("%02d ", j);
            }
            System.out.println();
        }

        sc.close();
    }
}
