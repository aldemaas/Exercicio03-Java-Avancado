package br.com.solutis.conjunto.dois;

import java.util.Scanner;

/**
 * @author Pedro Emanoel Souza Rocha
 */
public class Questao30 {

    /*
    30. Receba dois retângulos através dos seus quatro vértices. Cada vértice é um ponto e é
    formado por duas coordenadas x e y. Faça a crítica destes pontos, pois eles não podem se
    sobrepor. Observe que o usuário pode fornecê-los em qualquer ordem. Em seguida informe
    se os dois retângulos se interceptam em algum lugar.
     */

    static class PontoXY {
        int x;
        int y;

        public PontoXY(int x, int y) {
            this.y = y;
            this.x = x;
        }

        void r() {
            System.out.println(this.x + " " + this.y);
        }
    }

    public static void main(String[] args) {
        System.out.println("Exercício 30 - Verificação de sobreposição de retângulos");
        Scanner sc = new Scanner(System.in);

        String ponto;
        String[] aux;
        int x, y;
        boolean isSobreposto;

        PontoXY[] priRetan = new PontoXY[4];
        PontoXY[] segRetan = new PontoXY[4];

        int[] priRetanLimits;
        int[] segRetanLimits;

        System.out.println("informe os 4 pontos x e y do seu retangulo 1, exempro x,y");
        for (int i = 0; i < 4; i++) {
            System.out.println((i + 1) + "º ponto:");
            ponto = sc.nextLine();
            aux = ponto.split(",");
            x = Integer.parseInt(aux[0].trim());
            y = Integer.parseInt(aux[1].trim());
            priRetan[i] = new PontoXY(x, y);
        }

        System.out.println("informe os 4 pontos x e y do seu retangulo 2, exempro x,y");
        for (int i = 0; i < 4; i++) {
            System.out.println((i + 1) + "º ponto:");
            ponto = sc.nextLine();
            aux = ponto.split(",");
            x = Integer.parseInt(aux[0].trim());
            y = Integer.parseInt(aux[1].trim());
            segRetan[i] = new PontoXY(x, y);
        }

        priRetanLimits = calculateLimits(priRetan);
        segRetanLimits = calculateLimits(segRetan);

        isSobreposto = sobrepor(priRetanLimits, segRetanLimits);

        if (isSobreposto) {
            System.out.println("Os retângulos se sobrepõem.");
        } else {
            System.out.println("Os retângulos não se sobrepõem.");
        }

        sc.close();
    }

    private static int[] calculateLimits(PontoXY[] retan) {
        int minX = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE;
        int minY = Integer.MAX_VALUE;
        int maxY = Integer.MIN_VALUE;

        for (PontoXY p : retan) {
            if (p.x < minX) minX = p.x;
            if (p.x > maxX) maxX = p.x;
            if (p.y < minY) minY = p.y;
            if (p.y > maxY) maxY = p.y;
        }

        return new int[]{minX, maxX, minY, maxY};
    }

    private static boolean sobrepor(int[] limits1, int[] limits2) {
        int minX1 = limits1[0], maxX1 = limits1[1], minY1 = limits1[2], maxY1 = limits1[3];
        int minX2 = limits2[0], maxX2 = limits2[1], minY2 = limits2[2], maxY2 = limits2[3];

        return !(minX1 > maxX2 || maxX1 < minX2 || minY1 > maxY2 || maxY1 < minY2);
    }
}
