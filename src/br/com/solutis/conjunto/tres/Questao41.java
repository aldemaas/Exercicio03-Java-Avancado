package br.com.solutis.conjunto.tres;

import java.util.Scanner;

import static utils.UtilsConjunto3.getInteiroNaoNegativo;

/**
 * @author Vinícius dos Santos Andrade
 */
public class Questao41 {

    /*
    41. Crie um jogo para o usuário descobrir um número sorteado de 1 a 100.
    A cada tentativa dele, forneça uma dica falando se o número é maior ou menor. Quando ele descobrir exiba
    uma mensagem de parabéns e mostre em quantas tentativas ele conseguiu.
     */

    public static void main(String[] args) {
        System.out.println("Exercício 41 - Jogo de adivinhação");
        Scanner entrada = new Scanner(System.in);

        int numeroSorteado = (int) (Math.random() * 100) + 1;
        int tentativas = 0;
        int palpite;

        System.out.println("Tente adivinhar o número sorteado de 1 a 100.");
        do {
            System.out.print("Digite seu palpite: ");
            palpite = getInteiroNaoNegativo(entrada);
            tentativas++;

            if (palpite < 1 || palpite > 100) {
                System.out.println("O número deve estar entre 1 e 100.");
            } else if (palpite < numeroSorteado) {
                System.out.println("O número sorteado é maior.");
            } else {
                System.out.println("O número sorteado é menor.");
            }
        } while (palpite != numeroSorteado);

        System.out.println("Parabéns! Você acertou o número sorteado (" + numeroSorteado + ") em " + tentativas + " tentativas.");
        entrada.close();
    }
}
