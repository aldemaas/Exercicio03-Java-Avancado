package conjunto_4_estruturas_de_repeticao_aninhadas;

import java.util.Scanner;

public class Questao63 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de linhas para a pirâmide: ");
        int linhas = sc.nextInt();

        for (int i = 1; i <= linhas; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.printf("%02d ", j);
            }
            System.out.println();
        }

        sc.close();
    }
}
