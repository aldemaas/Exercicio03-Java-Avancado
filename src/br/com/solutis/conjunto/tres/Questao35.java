package br.com.solutis.conjunto.tres;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Suerdo Flaubert Campos de Lucena Júnior
 */
public class Questao35 {

    /*
    35. Exiba uma quantidade de números sorteados determinada pelo usuário. Peça também que
    o usuário determine a faixa do sorteio.
     */

    public static void main(String[] args) {
        System.out.println("Exercício 35 - Exiba uma quantidade de números sorteados determinada pelo usuário. Peça também que o usuário determine a faixa do sorteio.");
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int quantidade, minimo, maximo;

        System.out.print("Digite a quantidade de números a serem sorteados: ");
        quantidade = sc.nextInt();

        System.out.print("Digite o valor mínimo da faixa: ");
        minimo = sc.nextInt();

        System.out.print("Digite o valor máximo da faixa: ");
        maximo = sc.nextInt();

        if (maximo > minimo) {
            System.out.println("Números sorteados:");
            for (int i = 1; i <= quantidade; i++) {
                int numeroSorteado = random.nextInt((maximo - minimo) + 1) + minimo;
                System.out.println("Número sorteado " + i + ": " + numeroSorteado);
            }
        } else {
            System.out.println("O valor máximo deve ser maior que o valor mínimo.");
        }

        sc.close();
    }
}
