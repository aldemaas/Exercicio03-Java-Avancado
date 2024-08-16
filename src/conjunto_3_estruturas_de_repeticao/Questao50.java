package conjunto_3_estruturas_de_repeticao;

import java.util.Scanner;

import static Utils.UtilsConjunto3.getInteiroNaoNegativo;

/**
 * @author Vinícius dos Santos Andrade
 */
public class Questao50 {

    /*
    50. Imprima exatamente o n-ezimo termo da seqüência de Fibonacci.
     */

    public static void main(String[] args) {
        System.out.println("Exercício 50 - N-ésimo termo da sequência de Fibonacci");
        Scanner entrada = new Scanner(System.in);
        int termo, n;

        System.out.print("Digite o valor de n: ");
        n = getInteiroNaoNegativo(entrada);

        termo = enesimoTermoFibonacci(n);
        System.out.printf("O %dº termo da sequência de Fibonacci é: %d%n", n, termo);

        entrada.close();
    }

    public static int enesimoTermoFibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        int termoAnterior = 0;
        int termoAtual = 1;
        int termoProximo = 0;

        for (int i = 2; i <= n; i++) {
            termoProximo = termoAnterior + termoAtual;
            termoAnterior = termoAtual;
            termoAtual = termoProximo;
        }

        return termoProximo;
    }
}
