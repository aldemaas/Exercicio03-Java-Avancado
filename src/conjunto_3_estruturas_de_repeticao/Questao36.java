package conjunto_3_estruturas_de_repeticao;

import java.util.Scanner;

public class Questao36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite dois números.");

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        sc.close();

        int menorNum = Math.min(num1, num2);
        int maiorNum = Math.max(num1, num2);

        System.out.println("Números ímpares entre " + menorNum + " e " + maiorNum + ":");
        for (int i = menorNum + 1; i < maiorNum; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
