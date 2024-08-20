package conjunto_3_estruturas_de_repeticao;

import java.util.Scanner;

public class Questao45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maiorValor = Integer.MIN_VALUE;

        System.out.println("Digite 100 números:");

        for (int i = 1; i <= 100; i++) {
            System.out.print("Valor " + i + ": ");
            int valor = sc.nextInt();

            if (valor > maiorValor) {
                maiorValor = valor;
            }
        }

        System.out.println("O maior valor fornecido é: " + maiorValor);

        sc.close();
    }
}
