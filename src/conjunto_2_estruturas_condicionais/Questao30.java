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
        void r(){
            System.out.println(this.x + " " + this.y);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PontoXY[] priRetan = new PontoXY[4];

        System.out.println("informe os 4 pontos x e y do seu retangulo 1, exempro x,y");
        for (int i=0; i < 4; i++) {
            System.out.println((i + 1) + "º ponto:");
            String ponto= sc.nextLine();
            String[] aux = ponto.split(",");
            int x = Integer.parseInt(aux[0].trim());
            int y = Integer.parseInt(aux[1].trim());
            priRetan[i] = new PontoXY(x, y);
        }
        PontoXY[] segRetan = new PontoXY[4];
        System.out.println("informe os 4 pontos x e y do seu retangulo 2, exempro x,y");
        for (int i=0; i < 4; i++) {
            System.out.println((i + 1) + "º ponto:");
            String ponto= sc.nextLine();
            String[] aux = ponto.split(",");
            int x = Integer.parseInt(aux[0].trim());
            int y = Integer.parseInt(aux[1].trim());
            segRetan[i] = new PontoXY(x, y);
        }
        int[] priRetanLimits = calculateLimits(priRetan);
        int[] segRetanLimits = calculateLimits(segRetan);

        boolean sobre= sobrepor(priRetanLimits, segRetanLimits);
        if (sobre) {
            System.out.println("Os retângulos se sobrepõem.");
        } else {
            System.out.println("Os retângulos não se sobrepõem.");
        }




        /*for(PontoXY p: priRetan){
            p.r();
        }*/

        sc.close();
    }
    private static int[] calculateLimits(PontoXY[] retan) {
        int minX= Integer.MAX_VALUE;
        int maxX= Integer.MIN_VALUE;
        int minY= Integer.MAX_VALUE;
        int maxY= Integer.MIN_VALUE;

        for (PontoXY p : retan) {
            if (p.x < minX) minX = p.x;
            if (p.x > maxX) maxX = p.x;
            if (p.y < minY) minY = p.y;
            if (p.y > maxY) maxY = p.y;
        }

        return new int[]{minX, maxX, minY, maxY};
    }

    private static boolean sobrepor(int[] limits1, int[] limits2) {
        int minX1= limits1[0], maxX1 = limits1[1], minY1 = limits1[2], maxY1 = limits1[3];
        int minX2= limits2[0], maxX2 = limits2[1], minY2 = limits2[2], maxY2 = limits2[3];

        return !(minX1 > maxX2 || maxX1 < minX2 || minY1 > maxY2 || maxY1 < minY2);
    }
}
