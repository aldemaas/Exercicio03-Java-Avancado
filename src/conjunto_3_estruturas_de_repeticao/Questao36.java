package conjunto_3_estruturas_de_repeticao;

import java.util.Scanner;

/**
 * @author Pedro Messias de Lucena Maia
 */
public class Questao36 {

    /*
    36. Exiba todos os números ímpares existentes entre dois números informados pelo usuário.
    Dica: use o operador % para calcular o resto da divisão entre dois números.
     */
    public static void main(String[] args) {
        System.out.println("Exercício 36 - Exiba todos os números ímpares existentes entre dois números informados pelo usuário.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite dois números.");

        int num1, num2, menorNum, maiorNum;

        num1 = sc.nextInt();
        num2 = sc.nextInt();

        menorNum = Math.min(num1, num2);
        maiorNum = Math.max(num1, num2);

        System.out.println("Números ímpares entre: " + menorNum + " e " + maiorNum + ":");
        for (int i = menorNum + 1; i < maiorNum; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}
