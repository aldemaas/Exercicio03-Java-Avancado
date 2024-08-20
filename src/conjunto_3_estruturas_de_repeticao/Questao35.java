package conjunto_3_estruturas_de_repeticao;

import java.util.Random;
import java.util.Scanner;

public class Questao35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Digite a quantidade de números a serem sorteados: ");
        int quantidade = sc.nextInt();

        System.out.print("Digite o valor mínimo da faixa: ");
        int minimo = sc.nextInt();

        System.out.print("Digite o valor máximo da faixa: ");
        int maximo = sc.nextInt();

        if (maximo > minimo) {
            System.out.println("Números sorteados:");
            for (int i = 1; i <= quantidade; i++) {
                int numeroSorteado = random.nextInt((maximo - minimo) + 1) + minimo;
                System.out.println("Número sorteado " + i + ": " + numeroSorteado);
            }
        } else {
            System.out.println("O valor máximo deve ser maior que o valor mínimo.");
        }
        sc.close();
    }
}
