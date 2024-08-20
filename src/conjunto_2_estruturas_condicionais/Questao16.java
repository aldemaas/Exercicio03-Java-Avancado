package conjunto_2_estruturas_condicionais;

import java.util.Scanner;

/**
 * @author Pedro Messias de Lucena Maia
 */
public class Questao16 {

    /*
    16. Acrescente no exercício anterior se a pessoa nasceu no 1º, 2º, 3º ou 4º trimestre.
     */

    public static void main(String[] args) {
        System.out.println("Exercício 16 - Dia e mês de aniversário");
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o dia do seu aniversário:");

        int day, month;
        boolean validDay;

        day = sc.nextInt();

        System.out.println("Informe o número do mês. ");
        month = sc.nextInt();

        String[] mesesNome = {
                "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
                "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
        };
        //Validação mês
        if (month < 1 || month > 12) {
            System.out.println("Mês inválido !");
        } else {
            validDay = true;
            switch (month) {
                case 1, 2 -> {
                    if (day < 1 || day > 29) {
                        validDay = false; // Considerando a existência de anos bissextos
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
                System.out.println("Você nasceu no dia " + day + " de " + nomeMes);
            }

            // Trimestre
            String trimestre = switch (month) {
                case 1, 2, 3 -> "primeiro trimestre";
                case 4, 5, 6 -> "segundo trimestre";
                case 7, 8, 9 -> "terceiro trimestre";
                case 10, 11, 12 -> "quarto trimestre";
                default -> "Trimestre Inválido!";
            };
            System.out.println("Você nasceu no " + trimestre + " do ano.");

            sc.close();
        }
    }
}
