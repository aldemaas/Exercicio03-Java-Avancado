package br.com.solutis.conjunto.quatro;

/**
 * @author Suerdo Flaubert Campos de Lucena Júnior
 */
public class Questao59 {

    /*
    59. Exiba as 10 tabuadas (de 1 a 10).
     */

    public static void main(String[] args) {
        System.out.println("Exercício 59 - exibe as 10 tabuadas (de 1 a 10).");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Tabuada do " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }
}
