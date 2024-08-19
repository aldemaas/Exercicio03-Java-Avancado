package conjunto_4_estruturas_de_repeticao_aninhadas;

import java.util.Scanner;

public class Questao61 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de linhas para a pirâmide: ");

        int linhas = sc.nextInt();
        sc.close();

        if (linhas <= 0) {
            System.out.println("O número de linhas deve ser um número positivo.");
            return;
        }


        for (int i = 1; i <= linhas; i++) {
            // Imprime a linha com i asteriscos
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Pula para a próxima linha
            System.out.println();
        }
    }
}
