package br.com.solutis.conjunto.quatro;

import java.util.Scanner;

/**
 * @author Pedro Messias de Lucena Maia
 */
public class Questao61 {

    /*
    61. Desenhe a seguinte pirâmide de asteriscos. O usuário determina a quantidade de linhas.
    *
    **
    ***
    ****
    *****
    ******
    *******
    ********
    *********
    **********
    ***********
    ************
    ...
     */

    public static void main(String[] args){
        System.out.println("Exercício 61 - desenha uma pirâmide de asteriscos com o número de linhas determinado pelo usuário.");
        Scanner sc = new Scanner(System.in);

        int linhas;

        System.out.print("Digite o número de linhas para a pirâmide: ");
        linhas = sc.nextInt();

        if (linhas <= 0) {
            System.out.println("O número de linhas deve ser um número positivo.");
            return;
        }

        for (int i = 1; i <= linhas; i++) {
            // Imprime a linha com i asteriscos
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // Pula para a próxima linha
        }

        sc.close();
    }
}
