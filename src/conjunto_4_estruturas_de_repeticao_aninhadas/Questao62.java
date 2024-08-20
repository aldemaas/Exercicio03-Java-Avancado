package conjunto_4_estruturas_de_repeticao_aninhadas;

import java.util.Scanner;

public class Questao62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de linhas da pirâmide:");
        int quantidadeLinhas = sc.nextInt();

        if (quantidadeLinhas <= 0) {
            System.out.println("A quantidade de linhas deve ser maior que zero.");
            return;
        }

        for (int i = 1; i <= quantidadeLinhas; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%02d ", i);
            }
            System.out.println();
        }

        sc.close();
    }
}
