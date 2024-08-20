package conjunto_4_estruturas_de_repeticao_aninhadas;

import java.util.Scanner;

public class Questao64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de triângulos: ");
        int quantidade = sc.nextInt();
        sc.close();

        for (int i = 1; i <= quantidade; i++) {
            for (int j = 1; j <= i; j++) {
                for (int k = 1; k <= j; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
