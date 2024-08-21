package br.com.solutis.conjunto.tres;

import java.util.Scanner;

import static utils.UtilsConjunto3.getInteiroNaoNegativo;

/**
 * @author Vinícius dos Santos Andrade
 */
public class Questao38 {

     /*
     38. Verifique se um número é primo ou não
      */

    public static void main(String[] args) {
        System.out.println("Exercício 38 - Verificação de número primo");
        Scanner entrada = new Scanner(System.in);
        int numero;

        System.out.print("Digite um número inteiro positivo: ");
        numero = getInteiroNaoNegativo(entrada);

        if (isPrimo(numero)) {
            System.out.println(numero + " é primo.");
        } else {
            System.out.println(numero + " não é primo.");
        }

        entrada.close();
    }

    /**
     * Verifica se um número é primo.
     * <p>
     * Um número primo é um número natural maior que 1 que não tem divisores positivos
     * além de 1 e ele mesmo. Este metodo verifica a primalidade de um número
     * iterando de 2 até a raiz quadrada do número. Se o número for divisível por
     * qualquer número nesse intervalo, ele não é primo e o metodo retorna 'false'.
     * Caso contrário, o número é primo e o metodo retorna 'true'.
     * <p>
     * A otimização de verificar apenas até a raiz quadrada do número se baseia no
     * fato de que se um número não for primo, ele terá pelo menos um fator primo
     * menor ou igual à sua raiz quadrada.
     *
     * @param numero o número a ser verificado
     * @return {@code true} se o número for primo; {@code false} caso contrário
     */
    public static boolean isPrimo(int numero) {
        if (numero < 2) return false;

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }

    /**
     * Verifica se um número inteiro é primo.
     * <p>
     * Um número primo é um número maior que 1 que não possui divisores positivos além de 1 e ele mesmo.
     * Esta função determina se o número fornecido é primo utilizando uma abordagem otimizada, que reduz
     * a quantidade de divisões necessárias para verificar a primalidade.
     * <p>
     * O metodo segue os seguintes passos para verificar se um número é primo:
     * <ol>
     *     <li>Retorna `false` se o número é menor ou igual a 1.</li>
     *     <li>Retorna `true` se o número é 2 ou 3, que são os primeiros números primos.</li>
     *     <li>Retorna `false` se o número é divisível por 2 ou 3, excluindo esses casos.</li>
     *     <li>Para números maiores, verifica divisibilidade por números da forma 6k ± 1, até a raiz quadrada do número.</li>
     * </ol>
     *
     * @param n O número inteiro a ser verificado.
     * @return `true` se o número for primo, `false` caso contrário.
     */
    public static boolean isPrimo2(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;

        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }
}
