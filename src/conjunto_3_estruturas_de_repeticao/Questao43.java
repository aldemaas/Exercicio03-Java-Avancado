package conjunto_3_estruturas_de_repeticao;

import java.util.Scanner;

public class Questao43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantidadeValores = 500;
        double somaValores = 0;

        System.out.println("Digite " + quantidadeValores + " valores:");

        for (int i = 0; i < quantidadeValores; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            double valor = sc.nextDouble();

            somaValores += valor;
        }

        double media = somaValores / quantidadeValores;

        System.out.println("A média aritmética dos valores fornecidos é: " + media);

        sc.close();
    }
}
