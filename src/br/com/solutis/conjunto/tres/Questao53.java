package br.com.solutis.conjunto.tres;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author Pedro Messias de Lucena Maia
 */
public class Questao53 {

    /*
    53. Exiba a tabuada de um número fornecido pelo usuário. Por exemplo se ele digitar o número 5, então
    será mostrado:
    5 x 1 = 5
    5 x 2 = 10
    5 x 3 = 15
    5 x 4 = 20
    5 x 5 = 25
    5 x 6 = 30
    5 x 7 = 35
    5 x 8 = 40
    5 x 9 = 45
    5 x 10 = 50
     */

    public static void main(String[] args) {
        System.out.println("Exercício 53 - Exiba a tabuada de um número fornecido pelo usuário.");
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int x, tabuada;

        System.out.println("Forneça um número.");
        x = sc.nextInt();

        tabuada = 10;

        for ( int i = 1; i <= tabuada;  i++ ){
            System.out.println(x + " x " + i + " = " + (x * i));
        }

        sc.close();
    }
}
