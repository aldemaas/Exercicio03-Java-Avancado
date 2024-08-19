package conjunto_2_estruturas_condicionais;

import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o numerador: ");
        int numerador = sc.nextInt();

        System.out.print("Digite o denominador: ");
        int denominador = sc.nextInt();

        if (denominador != 0) {
            double numeroReal = (double) numerador / denominador;
            System.out.println("O número real é: " + numeroReal);
        } else {
            System.out.println("Erro: O denominador não pode ser zero.");
        }
        sc.close();
    }
}
