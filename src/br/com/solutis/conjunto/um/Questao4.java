package br.com.solutis.conjunto.um;

import java.util.Scanner;

import static utils.UtilsConjunto1.lerNota;

/**
 * @author Aldemir Carlos Alves de Lima
 */
public class Questao4 {

    /*
      4. Determine e exiba a média aritmética de um aluno a partir de suas 4 notas.
     */

    public static void main(String[] args) {
        System.out.println("Exercicio 4 - Media aritmética");
        Scanner sc = new Scanner(System.in);

        double nota1, nota2, nota3, nota4, mediaAluno;

        nota1 = lerNota(sc, "Digite a primeira nota do aluno: ");
        nota2 = lerNota(sc, "Digite a segunda nota do aluno: ");
        nota3 = lerNota(sc, "Digite a terceira nota do aluno: ");
        nota4 = lerNota(sc, "Digite a quarta nota do aluno: ");

        mediaAluno = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("A média final do aluno é: " + mediaAluno);

        sc.close();
    }
}
