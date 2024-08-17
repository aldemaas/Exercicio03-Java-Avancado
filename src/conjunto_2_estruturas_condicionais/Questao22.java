package conjunto_2_estruturas_condicionais;

import java.util.Scanner;

public class Questao22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o dia da primeira data de aniversário: ");
        int dia1 = sc.nextInt();

        System.out.print("Digite o mês da primeira data de aniversário: ");
        int mes1 = sc.nextInt();

        System.out.print("Digite o dia da segunda data de aniversário: ");
        int dia2 = sc.nextInt();

        System.out.print("Digite o mês da segunda data de aniversário: ");
        int mes2 = sc.nextInt();

        if (dia1 == dia2 && mes1 == mes2) {
            System.out.println("As duas datas de aniversário são iguais.");
        } else {
            System.out.println("As duas datas de aniversário são diferentes.");
        }

        sc.close();
    }
}
