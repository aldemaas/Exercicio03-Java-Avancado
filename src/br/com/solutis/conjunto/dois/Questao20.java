package br.com.solutis.conjunto.dois;

import java.util.Scanner;

/**
 * @author Aldemir Carlos Alves de Lima
 */
public class Questao20 {

    /*
    20. Solicite o nome e a idade de duas pessoas. Em seguida exiba o nome da pessoa mais
    velha e o nome da pessoa mais nova.
     */

    public static void main(String[] args) {
        System.out.println("Exercício 20 - Pessoa mais velha e mais nova");
        Scanner sc = new Scanner(System.in);

        String nome1, nome2;
        int idade1, idade2;

        System.out.print("Digite o nome da primeira pessoa: ");
        nome1 = sc.nextLine();

        System.out.print("Digite o nome da segunda pessoa: ");
        nome2 = sc.nextLine();

        System.out.print("Digite a idade da primeira pessoa: ");
        idade1 = sc.nextInt();

        System.out.print("Digite a idade da segunda pessoa: ");
        idade2 = sc.nextInt();

        if (idade1 > idade2) {
            System.out.println(nome1 + " é mais velho(a) que " + nome2);
        } else if (idade1 < idade2) {
            System.out.println(nome2 + " é mais velho(a) que " + nome1);
        } else {
            System.out.println(nome1 + " e " + nome2 + " têm a mesma idade.");
        }

        sc.close();
    }
}
