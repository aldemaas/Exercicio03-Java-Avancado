package br.com.solutis.conjunto.dois;

import java.util.Scanner;

/**
 * @author Suerdo Flaubert Campos de Lucena Júnior
 */
public class Questao11 {

    /*
    11. A partir da idade informada de um cidadão diga se ele não pode votar (idade inferior a 16),
    ou se o voto é facultativo (idade menor ou igual a 16, ou maior ou igual a 65), ou ainda se o
    voto é obrigatório.
     */

    public static void main(String[] args) {
        System.out.println("Exercício 11 - Verifique se o cidadão pode votar.");
        Scanner sc = new Scanner(System.in);

        int idadeCidadao;

        System.out.print("Digite a sua idade: ");
        idadeCidadao = sc.nextInt();

        if (idadeCidadao < 16) {
            System.out.println("Você não pode votar.");
        } else if (idadeCidadao < 18 || idadeCidadao >= 65) {
            System.out.println("O voto é facultativo.");
        } else {
            System.out.println("O voto é obrigatório.");
        }
        sc.close();
    }
}
