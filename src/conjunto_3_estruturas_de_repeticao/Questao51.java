package conjunto_3_estruturas_de_repeticao;

import java.util.Scanner;

public class Questao51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero de termos da sequência de Tribonacci: ");

        int n = sc.nextInt();
        sc.close();
        // Validador
        if (n <= 0){
            System.out.println("O numero de termos deve ser positivo");
        }
        imprimirTribonacci(n);
    }


    public static void imprimirTribonacci(int n){
        if (n >= 1)
            System.out.print("1 ");
        if (n >= 2)
            System.out.print("1 ");
        if (n >= 3)
            System.out.print("2 ");
        int a = 1, b = 1, c = 2;

        for (int i = 4; i <= n; i++) {
            int proximo = a + b + c;
            System.out.print(proximo + " ");
            // Atualizando os valores de a, b e c

            a = b;
            b = c;
            c = proximo;
        }
        System.out.println();
    }
}
