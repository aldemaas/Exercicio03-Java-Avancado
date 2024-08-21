package br.com.solutis.conjunto.tres;

import java.util.Scanner;

/**
 * @author Aldemir Carlos Alves de Lima
 */
public class Questao46 {

    /*
    46. Determine a quantidade de homens e mulheres (separadamente) que são maiores de
    idade, baseado numa lista de 200 pessoas.
     */
    public static void main(String[] args) {
        System.out.println("Exercício 46 - Quantidade de homens e mulheres maiores de idade.");
        Scanner sc = new Scanner(System.in);

        int homensMaiores = 0;
        int mulheresMaiores = 0;

        System.out.println("Digite o gênero (M/F) e a idade de 200 pessoas:");

        for (int i = 1; i <= 200; i++) {
            System.out.print("Pessoa " + i + " - Gênero (M/F): ");
            char genero = sc.next().toUpperCase().charAt(0);

            System.out.print("Pessoa " + i + " - Idade: ");
            int idade = sc.nextInt();

            if (idade >= 18) {
                if (genero == 'M') {
                    homensMaiores++;
                } else if (genero == 'F') {
                    mulheresMaiores++;
                }
            }
        }

        System.out.println("Quantidade de homens maiores de idade: " + homensMaiores);
        System.out.println("Quantidade de mulheres maiores de idade: " + mulheresMaiores);

        sc.close();
    }
}
