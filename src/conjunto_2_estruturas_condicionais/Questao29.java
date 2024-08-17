package conjunto_2_estruturas_condicionais;

import java.util.Scanner;

public class Questao29 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Recebe os pontos dos vértices do retângulo
        System.out.print("Digite as coordenadas do ponto superior esquerdo (x1, y1):");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        System.out.print("Digite as coordenadas do ponto inferior direito (x2, y2):");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        if (x1 == x2 && y1 == y2) {
            System.out.println("É um ponto.");
        } else if (x1 == x2 || y1 == y2) {
            System.out.println("É uma reta " + (x1 == x2 ? "vertical." : "horizontal."));
        } else {
            System.out.println("É um retângulo.");
            System.out.println("Área do retângulo: " + Math.abs((x2 - x1) * (y2 - y1)));
        }

        System.out.println("Digite as coordenadas de um ponto (x, y):");
        int x = sc.nextInt();
        int y = sc.nextInt();

        String posicao;
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
