package conjunto_4_estruturas_de_repeticao_aninhadas;

import java.util.Scanner;

/**
 * @author Kauê Alexandre dos Reis Santos
 */
public class Questao64 {

    /*
    64. Desenhe a seguinte seqüência de triângulos. O usuário determina a quantidade de
    triângulos.

    *

    *
    **

    *
    **
    ***

    *
    **
    ***
    ****

    *
    **
    ***
    ****
    *****

    *
    **
    ***
    ****
    *****
    ******

    *
    **
    ***
    ****
    *****
    ******
    *******
    ...
     */

    public static void main(String[] args) {
        System.out.println("Exercício 64 - desenha uma sequência de triângulos com o número de triângulos determinado pelo usuário.");
        Scanner sc = new Scanner(System.in);
        int quantidade;

        System.out.print("Digite a quantidade de triângulos: ");
        quantidade = sc.nextInt();


        for (int i = 1; i <= quantidade; i++) {
            for (int j = 1; j <= i; j++) {
                for (int k = 1; k <= j; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println();
        }

        sc.close();
    }
}
