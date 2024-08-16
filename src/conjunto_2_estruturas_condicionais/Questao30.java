package conjunto_2_estruturas_condicionais;

import java.util.Scanner;

public class Questao30 {
    static class PontoXY{
        int x;
        int y;

        public PontoXY(int x, int y) {
            this.y = y;
            this.x = x;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PontoXY[] priRetan = new PontoXY[4];

        System.out.println("informe os 4 pontos x e y do seu retangulo 1, exempro x,y");
        System.out.println("primeiro ponto:");
        String ponto = sc.nextLine();
        priRetan[0] = new PontoXY(Integer.parseInt(String.valueOf(ponto.charAt(0))),
                Integer.parseInt(String.valueOf(ponto.charAt(2))));
        System.out.println(priRetan[0].x +" "+ priRetan[0].y);
        System.out.println("informe os 4 pontos x e y do seu retangulo 1");

        sc.close();
    }
}
