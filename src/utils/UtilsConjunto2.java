package utils;

import java.util.Scanner;

public class UtilsConjunto2 {

    /**
     * Lê e retorna um valor de dia (entre 1 e 31) a partir da entrada do usuário.
     * <p>
     * A função solicita ao usuário que insira um valor para o dia, verificando se a entrada
     * é um número válido e dentro do intervalo permitido (1 a 31). Caso o usuário insira
     * um valor inválido, a função informará o erro e solicitará uma nova entrada até que
     * um valor válido seja fornecido.
     *
     * @param entrada Um objeto Scanner para ler a entrada do usuário.
     * @return Um número do tipo byte que representa o dia (entre 1 e 31).
     */
    public static byte getDia(Scanner entrada) {
        byte dia = -1;
        boolean validInput = false;

        do {
            try {
                dia = Byte.parseByte(entrada.nextLine().trim());
                if (dia < 1 || dia > 31) {
                    System.out.println("Dia inválido. Digite um dia entre 1 e 31.");
                } else {
                    validInput = true; // Entrada válida
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, insira um número válido.");
            }
        } while (!validInput);

        return dia;
    }

    /**
     * Lê e retorna um valor de mês (entre 1 e 12) a partir da entrada do usuário.
     * <p>
     * A função solicita ao usuário que insira um valor para o mês, verificando se a entrada
     * é um número válido e dentro do intervalo permitido (1 a 12). Caso o usuário insira
     * um valor inválido, a função informará o erro e solicitará uma nova entrada até que
     * um valor válido seja fornecido.
     *
     * @param entrada Um objeto Scanner para ler a entrada do usuário.
     * @return Um número do tipo byte que representa o mês (entre 1 e 12).
     */
    public static byte getMes(Scanner entrada) {
        byte mes = -1;
        boolean validInput = false;

        do {
            try {
                mes = Byte.parseByte(entrada.nextLine().trim());
                if (mes < 1 || mes > 12) {
                    System.out.println("Mês inválido. Digite um mês entre 1 e 12.");
                } else {
                    validInput = true; // Entrada válida
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, insira um número válido.");
            }
        } while (!validInput);

        return mes;
    }

    /**
     * Lê e retorna um valor de ano (maior ou igual a 0) a partir da entrada do usuário.
     * <p>
     * A função solicita ao usuário que insira um valor para o ano, verificando se a entrada
     * é um número válido e maior ou igual a 0. Caso o usuário insira um valor inválido, a função
     * informará o erro e solicitará uma nova entrada até que um valor válido seja fornecido.
     *
     * @param entrada Um objeto Scanner para ler a entrada do usuário.
     * @return Um número do tipo short que representa o ano (maior ou igual a 0).
     */
    public static short getAno(Scanner entrada) {
        short ano = -1;
        boolean validInput = false;

        do {
            try {
                ano = Short.parseShort(entrada.nextLine().trim());
                if (ano < 0) {
                    System.out.println("Ano inválido. Digite um ano maior ou igual a 0.");
                } else {
                    validInput = true; // Entrada válida
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, insira um número válido.");
            }
        } while (!validInput);

        return ano;
    }

    /**
     * Lê e retorna um valor de hora (entre 0 e 23) a partir da entrada do usuário.
     * <p>
     * A função solicita ao usuário que insira um valor para a hora, verificando se a entrada
     * é um número válido e dentro do intervalo permitido (0 a 23). Caso o usuário insira
     * um valor inválido, a função informará o erro e solicitará uma nova entrada até que
     * um valor válido seja fornecido.
     *
     * @param entrada Um objeto Scanner para ler a entrada do usuário.
     * @return Um número do tipo byte que representa a hora (entre 0 e 23).
     */
    public static byte getHora(Scanner entrada) {
        byte hora = -1;
        boolean validInput = false;

        do {
            try {
                hora = Byte.parseByte(entrada.nextLine().trim());
                if (hora < 0 || hora > 23) {
                    System.out.println("Hora inválida. Digite uma hora entre 0 e 23.");
                } else {
                    validInput = true; // Entrada válida
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, insira um número válido.");
            }
        } while (!validInput);

        return hora;
    }

    /**
     * Lê e retorna um valor de minuto (entre 0 e 59) a partir da entrada do usuário.
     * <p>
     * A função solicita ao usuário que insira um valor para o minuto, verificando se a entrada
     * é um número válido e dentro do intervalo permitido (0 a 59). Caso o usuário insira
     * um valor inválido, a função informará o erro e solicitará uma nova entrada até que
     * um valor válido seja fornecido.
     *
     * @param entrada Um objeto Scanner para ler a entrada do usuário.
     * @return Um número do tipo byte que representa o minuto (entre 0 e 59).
     */
    public static byte getMinuto(Scanner entrada) {
        byte minuto = -1;
        boolean validInput = false;

        do {
            try {
                minuto = Byte.parseByte(entrada.nextLine().trim());
                if (minuto < 0 || minuto > 59) {
                    System.out.println("Minuto inválido. Digite um minuto entre 0 e 59.");
                } else {
                    validInput = true; // Entrada válida
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, insira um número válido.");
            }
        } while (!validInput);

        return minuto;
    }

    /**
     * Lê e retorna um valor de segundo (entre 0 e 59) a partir da entrada do usuário.
     * <p>
     * A função solicita ao usuário que insira um valor para o segundo, verificando se a entrada
     * é um número válido e dentro do intervalo permitido (0 a 59). Caso o usuário insira
     * um valor inválido, a função informará o erro e solicitará uma nova entrada até que
     * um valor válido seja fornecido.
     *
     * @param entrada Um objeto Scanner para ler a entrada do usuário.
     * @return Um número do tipo byte que representa o segundo (entre 0 e 59).
     */
    public static byte getSegundo(Scanner entrada) {
        byte segundo = -1;
        boolean validInput = false;

        do {
            try {
                segundo = Byte.parseByte(entrada.nextLine().trim());
                if (segundo < 0 || segundo > 59) {
                    System.out.println("Segundo inválido. Digite um segundo entre 0 e 59.");
                } else {
                    validInput = true; // Entrada válida
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, insira um número válido.");
            }
        } while (!validInput);

        return segundo;
    }
}
