package br.com.solutis.conjunto.dois;

import java.util.Scanner;

/**
 * @author Pedro Emanoel Souza Rocha
 */
public class Questao26 {

    /*
    26. Receba 2 horários e exiba a diferença entre eles em segundos. A entrada destes horários
    pode ocorrer em qualquer ordem.
    Dica: transforme os dois horários para segundos.
     */

    public static void main(String[] args) {
        System.out.println("Exercício 26 - Diferença entre horários em segundos");
        Scanner sc = new Scanner(System.in);

        String hora1, hora2;
        int segundos1, segundos2, resultado;
        int[] array1, array2;
        int aux;

        System.out.println("Informe dois horarios diferentes para doscobrir a diferença em segundos:");
        System.out.println("Primeiro horarios no formato hh:mm:ss");
        hora1 = sc.nextLine();

        System.out.println("Segundo horarios no formato hh:mm:ss");
        hora2 = sc.nextLine();

        array1 = new int[3];
        array2 = new int[3];

        aux = 0;
        for (int i = 0; i < 3; i++) {
            String convert1 = "" + hora1.charAt(aux) + hora1.charAt(aux + 1);
            String convert2 = "" + hora2.charAt(aux) + hora2.charAt(aux + 1);
            aux = aux + 3;
            array1[i] = Integer.parseInt(convert1);
            array2[i] = Integer.parseInt(convert2);
        }
        segundos1 = ((array1[0] * 60) * 60) + (array1[1] * 60) + array1[2];
        segundos2 = ((array2[0] * 60) * 60) + (array2[1] * 60) + array2[2];

        resultado = segundos1 - segundos2;

        if (resultado < 0) {
            resultado = resultado * -1;
        }

        System.out.println("A diferença em segundos é: " + resultado + "s");

        sc.close();
    }
}
