package br.com.solutis.conjunto.dois;

import java.util.Scanner;

/**
 * @author Kauê Alexandre dos Reis Santos
 */
public class Questao29 {

    /*
    29. Receba do usuário dois pontos do plano cartesiano. Estes pontos devem representar os
    vértices superior esquerdo e inferior direito de um retângulo paralelo aos eixos x e y.
    Primeiramente informe se estes pontos podem constituir um retângulo, ou seja:
    - se é um retângulo
    - se é uma reta horizontal
    - se é uma reta vertical
    - se é um ponto
    Depois, calcule e exiba área deste retângulo.
    Em seguida, receba outro ponto e exiba a posição dele em relação ao retângulo.
    Uma das 10 seguintes situações é possível:
    - acima e à esquerda
    - acima
    - acima e à direita
    - embaixo e à esquerda
    - embaixo
    - embaixo e à direita
    - à esquerda
    - à direita
    - dentro do retângulo
    - na linha do retângulo
     */

    public static void main(String[] args) {
        System.out.println("Exercício 29 - Posição de um ponto em relação a um retângulo");
        Scanner sc = new Scanner(System.in);

        String posicao;
        int x, y, x1, y1, x2, y2;

        // Recebe os pontos dos vértices do retângulo
        System.out.print("Digite as coordenadas do ponto superior esquerdo (x1, y1):");
        x1 = sc.nextInt();
        y1 = sc.nextInt();

        System.out.print("Digite as coordenadas do ponto inferior direito (x2, y2):");
        x2 = sc.nextInt();
        y2 = sc.nextInt();

        if (x1 == x2 && y1 == y2) {
            System.out.println("É um ponto.");
        } else if (x1 == x2 || y1 == y2) {
            System.out.println("É uma reta " + (x1 == x2 ? "vertical." : "horizontal."));
        } else {
            System.out.println("É um retângulo.");
            System.out.println("Área do retângulo: " + Math.abs((x2 - x1) * (y2 - y1)));
        }

        System.out.println("Digite as coordenadas de um ponto (x, y):");
        x = sc.nextInt();
        y = sc.nextInt();

        if (x < x1 && y > y1) {
            posicao = "Acima e à esquerda.";
        } else if (x > x2 && y > y1) {
            posicao = "Acima e à direita.";
        } else if (x < x1 && y < y2) {
            posicao = "Embaixo e à esquerda.";
        } else if (x > x2 && y < y2) {
            posicao = "Embaixo e à direita.";
        } else if (x < x1) {
            posicao = "À esquerda.";
        } else if (x > x2) {
            posicao = "À direita.";
        } else if (y > y1) {
            posicao = "Acima.";
        } else if (y < y2) {
            posicao = "Embaixo.";
        } else {
            if (x == x1 || x == x2 || y == y1 || y == y2) {
                posicao = "Na linha do retângulo.";
            } else {
                posicao = "Dentro do retângulo.";
            }
        }

        System.out.println(posicao);

        sc.close();
    }
}
