package Utils;

import java.util.Scanner;

public class UtilsConjunto1 {

    /**
     * Lê e retorna um número do tipo double não negativo a partir da entrada do usuário.
     * <p>
     * A função solicita ao usuário que insira um número, e verifica se a entrada é um valor
     * válido e não negativo. Caso o usuário insira um valor inválido (como um texto ou um número
     * negativo), a função informará o erro e solicitará uma nova entrada até que um valor válido seja fornecido.
     *
     * @param entrada Um objeto Scanner para ler a entrada do usuário.
     * @return Um número do tipo double que é não negativo.
     */
    public static double getDoubleNaoNegativo(Scanner entrada) {
        double valor = -1;
        boolean validInput = false;

        do {
            try {
                valor = Double.parseDouble(entrada.nextLine().trim());
                if (valor >= 0) {
                    validInput = true;
                } else {
                    System.out.println("Entrada inválida. Por favor, insira um número não negativo.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, insira um número válido.");
            }
        } while (!validInput);

        return valor;
    }

    /**
     * Lê e retorna uma quantidade de meses, que deve ser um número inteiro positivo, a partir da entrada do usuário.
     * <p>
     * A função solicita ao usuário que insira um número inteiro, e verifica se a entrada é válida e maior ou igual a 1.
     * Caso o usuário insira um valor inválido (como um texto ou um número menor que 1), a função informará o erro e
     * solicitará uma nova entrada até que um valor válido seja fornecido.
     *
     * @param entrada Um objeto Scanner para ler a entrada do usuário.
     * @return Um número inteiro que representa a quantidade de meses, e que é maior ou igual a 1.
     */
    public static int getQuantidadeMes(Scanner entrada) {
        int valor = -1;
        boolean validInput = false;

        do {
            try {
                valor = Integer.parseInt(entrada.nextLine().trim());
                if (valor >= 1) {
                    validInput = true;
                } else {
                    System.out.println("Entrada inválida. Por favor, insira um número inteiro entre 1 e " + Integer.MAX_VALUE + ".");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
            }
        } while (!validInput);

        return valor;
    }
}
