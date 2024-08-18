package conjunto_2_estruturas_condicionais;

import java.util.Scanner;

public class Questao16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a data do seu aniversário.");

        int day = sc.nextInt();

        System.out.println("Informe o número do mês.");
        int month = sc.nextInt();

        String[] mesesNome = {
                "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
                "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
        };
        //Validação mês
        if (month < 1 || month > 12) {
            System.out.println("Mês inválido!");
        }
        else {
            // Validação com base no mês
            boolean validDay = true;
            switch (month) {
                case 1:
                case 2:
                    if (day < 1 || day > 29) {
                        // Considerando a existência de anos bissextos
                        validDay = false;
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    if (day < 1 || day > 30) {
                        validDay = false;
                    }
                    break;
                default:
                    if (day < 1 || day > 31) {
                        validDay = false;
                    }
                    break;
            }

            if (!validDay) {
                System.out.println("Dia inválido para este mês!");
            }
            else {
                String nomeMes = mesesNome[month - 1];
                System.out.println("Você nasceu no dia " + day + " de " + nomeMes);
            }

            // Trimestre
            String trimestre;
            switch (month) {
                case 1:
                case 2:
                case 3:
                    trimestre = "primeiro trimestre";
                    break;
                case 4:
                case 5:
                case 6:
                    trimestre = "segundo trimestre";
                    break;
                case 7:
                case 8:
                case 9:
                    trimestre = "terceiro trimestre";
                    break;
                case 10:
                case 11:
                case 12:
                    trimestre = "quarto trimestre";
                    break;
                default:
                    trimestre = "Trimestre Inválido!";
                    break;
            }
            System.out.println("Você nasceu no " + trimestre + " do ano.");
            sc.close();
        }
    }

}
