package conjunto_3_estruturas_de_repeticao;

import java.math.BigInteger;
import java.util.Scanner;

import static Utils.UtilsConjunto3.getInteiroNaoNegativo;

/**
 * @author Vinícius dos Santos Andrade
 */
public class Questao37 {

    /*
     37. Calcule o fatorial de um número.
     */

    public static void main(String[] args) {
        System.out.println("Exercício 37 - Cálculo do fatorial de um número");
        Scanner entrada = new Scanner(System.in);
        int n;

        System.out.print("Digite um número inteiro: ");
        n = getInteiroNaoNegativo(entrada);

        System.out.println("Fatorial de " + n + " (iterativo): " + fatorial(n));
        System.out.println("Fatorial de " + n + " (recursivo): " + fatorialRecursivo(n));

        /*
         Obs1: O cálculo do fatorial para valores muito grandes pode resultar em valores
         extremamente grandes que podem exceder o limite de armazenamento de tipos primitivos
         como int e long. Para valores de n acima de 20, o valor de n! pode exceder o limite
         de armazenamento de um long, resultando em overflow e valores incorretos. Por isso,
         é recomendável usar BigInteger para calcular fatoriais de valores grandes.
        */

        /*
        Obs2: O cálculo do fatorial de forma recursiva pode resultar em estouro de pilha
        (StackOverflowError) para valores muito grandes de n, devido à profundidade excessiva
         da pilha de chamadas recursivas. Para valores de n acima de 11660(na máquina), o cálculo recursivo
         do fatorial pode exceder o limite de profundidade da pilha de chamadas, resultando em um estouro de pilha. Por isso, é recomendável usar a abordagem iterativa para calcular
         fatoriais de valores muito grandes.
         */

        entrada.close();
    }

    /**
     * Calcula o fatorial de um número de forma iterativa utilizando BigInteger.
     * <p>
     * Este metodo utiliza a classe BigInteger para calcular o fatorial de um número inteiro n.
     * O fatorial de um número n (representado como n!) é o produto de todos os inteiros positivos
     * de 1 até n. Por exemplo, 5! = 5 * 4 * 3 * 2 * 1 = 120.
     * <p>
     * Para números grandes, o valor de n! pode crescer exponencialmente, resultando em valores
     * que não podem ser representados por tipos primitivos como int ou long devido ao limite
     * de tamanho desses tipos. O tipo long em Java, por exemplo, é um inteiro de 64 bits que
     * pode armazenar valores entre −2^63 e 2^63-1. Para valores de n maiores que 20, o valor
     * de n! pode exceder esses limites, causando overflow e resultando em valores incorretos.
     * <p>
     * A classe BigInteger, por outro lado, permite representar inteiros de tamanho arbitrário,
     * limitados apenas pela memória disponível na máquina. Por isso, BigInteger é a escolha ideal
     * para operações aritméticas que resultam em valores extremamente grandes, como é o caso
     * do cálculo de fatoriais para valores elevados de n.
     *
     * @param n O número inteiro para o qual o fatorial será calculado. Deve ser um número não-negativo.
     * @return O fatorial de n representado como um BigInteger.
     * @throws IllegalArgumentException se n for negativo.
     */
    public static BigInteger fatorial(int n) {
        if (n < 0) throw new IllegalArgumentException("O número deve ser não-negativo.");

        BigInteger fatorial = BigInteger.ONE;

        for (int i = 1; i <= n; i++)
            fatorial = fatorial.multiply(BigInteger.valueOf(i));

        return fatorial;
    }

    /**
     * Calcula o fatorial de um número de forma recursiva utilizando BigInteger.
     * <p>
     * Este metodo implementa o cálculo do fatorial de forma recursiva, utilizando a classe BigInteger
     * para lidar com números muito grandes. A abordagem recursiva consiste em dividir o problema em
     * subproblemas menores. Especificamente, n! é calculado como n * (n-1)!, onde o caso base é 0!,
     * que por definição é 1.
     * <p>
     * O uso de BigInteger é essencial para garantir que o cálculo do fatorial para valores grandes de n
     * seja preciso, sem risco de overflow. Diferente dos tipos primitivos como int e long, que têm limites
     * fixos de armazenamento, BigInteger pode crescer conforme necessário para armazenar valores muito grandes,
     * tornando-o adequado para operações aritméticas que resultam em números de alta magnitude.
     *
     * @param n O número inteiro para o qual o fatorial será calculado. Deve ser um número não-negativo.
     * @return O fatorial de n representado como um BigInteger.
     * @throws IllegalArgumentException se n for negativo.
     */
    public static BigInteger fatorialRecursivo(int n) {
        if (n < 0) throw new IllegalArgumentException("O número deve ser não-negativo.");
        if (n == 0) return BigInteger.ONE;
        return BigInteger.valueOf(n).multiply(fatorialRecursivo(n - 1));
    }
}
