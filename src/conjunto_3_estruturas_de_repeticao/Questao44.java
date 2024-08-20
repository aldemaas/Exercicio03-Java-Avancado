package conjunto_3_estruturas_de_repeticao;

import java.util.Scanner;

public class Questao44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite quantos valores quer para calcular a média: ");
        int quantidade = sc.nextInt();

        double soma = 0.0;

        if (quantidade > 0) {
            System.out.println("Digite os " + quantidade + " valores:");

            for (int i = 1; i <= quantidade; i++) {
                System.out.print("Valor " + i + ": ");
                double valor = sc.nextDouble();
                soma += valor;
            }

            double media = soma / quantidade;

            System.out.println("A média aritmética dos " + quantidade + " valores é: " + media);
        } else {
            System.out.println("A quantidade de valores deve ser maior que zero.");
        }

        sc.close();
    }
}
