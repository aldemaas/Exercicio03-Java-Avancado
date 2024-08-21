package br.com.solutis.conjunto.dois;

/**
 * @author Kauê Alexandre dos Reis Santos
 */
public class Questao28 {

    /*
    28. Coloque em ordem crescente três números quaisquer.
    Como desafio, tente depois fazer uma solução com apenas 3 estruturas de decisão.
     */

    public static void main(String[] args) {
        System.out.println("Exercício 28 - 3 Números em ordem crescente");
        int a = 9;
        int b = 3;
        int c = 5;

        if (a > b) {
            int temp1 = a;
            a = b;
            b = temp1;
        }
        if (b > c) {
            int temp2 = b;
            b = c;
            c = temp2;
            if (a > b) {
                int temp3 = a;
                a = b;
                b = temp3;
            }
        }

        System.out.println("Números em ordem crescente: "
                + a + ", " + b + ", " + c);
    }
}
