package conjunto_2_estruturas_condicionais;

import java.util.Scanner;

/**
 * @author Kauê Alexandre dos Reis Santos
 */
public class Questao22 {

    /*
    22. Verifique se duas datas de aniversário (dia e mês) são iguais.
     */

    public static void main(String[] args) {
        System.out.println("Exercício 22 - Comparação de datas de aniversário");
        Scanner sc = new Scanner(System.in);

        int dia1, mes1, dia2, mes2;

        System.out.print("Digite o dia e o mês da primeira data de aniversário: ");
        dia1 = sc.nextInt();
        mes1 = sc.nextInt();

        System.out.print("Digite o dia e o mês da segunda data de aniversário: ");
        dia2 = sc.nextInt();
        mes2 = sc.nextInt();

        if (dia1 == dia2 && mes1 == mes2) {
            System.out.println("As duas datas de aniversário são iguais.");
        } else {
            System.out.println("As duas datas de aniversário são diferentes.");
        }

        sc.close();
    }
}
