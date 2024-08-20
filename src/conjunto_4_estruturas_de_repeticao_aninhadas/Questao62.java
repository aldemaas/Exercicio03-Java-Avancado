package conjunto_4_estruturas_de_repeticao_aninhadas;

import java.util.Scanner;

/**
 * @author Kauê Alexandre dos Reis Santos
 */
public class Questao62 {

    /*
    62. Desenhe a seguinte pirâmide de números. O usuário determina a quantidade de linhas.
    01
    02 02
    03 03 03
    04 04 04 04
    05 05 05 05 05
    06 06 06 06 06 06
    07 07 07 07 07 07 07
    08 08 08 08 08 08 08 08
    09 09 09 09 09 09 09 09 09
    10 10 10 10 10 10 10 10 10 10
    11 11 11 11 11 11 11 11 11 11 11
    ...
     */

    public static void main(String[] args) {
        System.out.println("Exercício 62 - desenha uma pirâmide de números com o número de linhas determinado pelo usuário.");
        Scanner sc = new Scanner(System.in);
        int quantidadeLinhas;

        System.out.println("Digite a quantidade de linhas da pirâmide:");
        quantidadeLinhas = sc.nextInt();

        if (quantidadeLinhas <= 0) {
            System.out.println("A quantidade de linhas deve ser maior que zero.");
            return;
        }

        for (int i = 1; i <= quantidadeLinhas; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%02d ", i);
            }
            System.out.println();
        }

        sc.close();
    }
}
