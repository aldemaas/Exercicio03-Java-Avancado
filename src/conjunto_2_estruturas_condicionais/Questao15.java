package conjunto_2_estruturas_condicionais;

import java.util.Scanner;

/**
 * @author Pedro Messias de Lucena Maia
 */
public class Questao15 {

    /*
    15. Verifique a validade de uma data de aniversário (solicite apenas o número do dia e do mês).
    Além de falar se a data está ok, informe também o nome do mês.
    Dica: meses com 30 dias: abril, junho, setembro e novembro.
     */

    public static void main(String[] args) {
        System.out.println("Exercício 15 - Dia e mês de aniversário");
        Scanner sc = new Scanner(System.in);

        int day, month;
        boolean validDay;

        System.out.println("Informe o dia do seu aniversário:");
        day = sc.nextInt();

        System.out.println("Informe o número do mês.");
        month = sc.nextInt();

        String[] mesesNome = {
                "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
                "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
        };

        // Validação mês
        if (month < 1 || month > 12) {
            System.out.println("Mês inválido!");
        } else {
            // Validação com base no mês
            validDay = true;
            switch (month) {
                case 2 -> {
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

            sc.close();
        }
    }
}
