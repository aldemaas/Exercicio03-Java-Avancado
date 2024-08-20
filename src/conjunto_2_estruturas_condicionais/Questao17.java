package conjunto_2_estruturas_condicionais;

import java.util.Scanner;

/**
 * @author Aldemir Carlos Alves de Lima
 */
public class Questao17 {

    /*
    17. Acrescente no exercício anterior a apresentação do signo do horóscopo da pessoa.
     */

    public static void main(String[] args) {
        System.out.println("Exercício 17 - Dia e mês de aniversário");
        Scanner sc = new Scanner(System.in);

        int day, month;
        boolean validDay;

        System.out.print("Informe o dia do seu aniversário: ");
        day = sc.nextInt();

        System.out.print("Informe o número do mês: ");
        month = sc.nextInt();

        String[] mesesNome = {
                "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
                "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
        };

        if (month < 1 || month > 12) {
            System.out.println("Mês inválido!");
        } else {
            validDay = true;
            switch (month) {
                case 2 -> {
                    if (day < 1 || day > 29) {

                        validDay = false;
                    }
                }
                case 4, 6, 9, 11 -> {
                    if (day < 1 || day > 30) {
                        validDay = false;
                    }
                }
                default -> {
                    if (day < 1 || day > 31) {
                        validDay = false;
                    }
                }
            }

            if (!validDay) {
                System.out.println("Dia inválido para este mês!");
            } else {
                String nomeMes = mesesNome[month - 1];
                String signo = obterSigno(day, month);
                System.out.println("Você nasceu no dia " + day + " de " + nomeMes);
                System.out.println("Seu signo é: " + signo);
            }

            sc.close();
        }
    }

    public static String obterSigno(int dia, int mes) {
        return switch (mes) {
            case 1 -> (dia <= 19) ? "Capricórnio" : "Aquário";
            case 2 -> (dia <= 18) ? "Aquário" : "Peixes";
            case 3 -> (dia <= 20) ? "Peixes" : "Áries";
            case 4 -> (dia <= 19) ? "Áries" : "Touro";
            case 5 -> (dia <= 20) ? "Touro" : "Gêmeos";
            case 6 -> (dia <= 20) ? "Gêmeos" : "Câncer";
            case 7 -> (dia <= 22) ? "Câncer" : "Leão";
            case 8 -> (dia <= 22) ? "Leão" : "Virgem";
            case 9 -> (dia <= 22) ? "Virgem" : "Libra";
            case 10 -> (dia <= 22) ? "Libra" : "Escorpião";
            case 11 -> (dia <= 21) ? "Escorpião" : "Sagitário";
            case 12 -> (dia <= 21) ? "Sagitário" : "Capricórnio";
            default -> "Signo inválido";
        };
    }
}
