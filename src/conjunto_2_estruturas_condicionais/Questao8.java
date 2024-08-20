package conjunto_2_estruturas_condicionais;

import java.util.Scanner;

/**
 * @author Suerdo Flaubert Campos de Lucena Júnior
 */
public class Questao8 {

    /*
    8. Transforme um número Racional (formado por numerador e denominador) para um número
    Real. Antes de dividir, verifique se o denominador é diferente de zero. Emita uma
    mensagem de alerta ao usuário se for zero.
     */

    public static void main(String[] args) {
        System.out.println("Exercício 8 - Transforme um número Racional para um número Real.");
        Scanner sc = new Scanner(System.in);

        int numerador, denominador;
        double numeroReal;

        System.out.print("Digite o numerador: ");
        numerador = sc.nextInt();

        System.out.print("Digite o denominador: ");
        denominador = sc.nextInt();

        if (denominador != 0) {
            numeroReal = (double) numerador / denominador;
            System.out.println("O número real é: " + numeroReal);
        } else {
            System.out.println("Erro: O denominador não pode ser zero.");
        }

        sc.close();
    }
}
