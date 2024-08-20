package conjunto_2_estruturas_condicionais;


import java.util.Scanner;

public class Questao17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o dia do seu aniversário: ");

        int day = sc.nextInt();

        System.out.print("Informe o número do mês: ");
        int month = sc.nextInt();

        String[] mesesNome = {
                "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
                "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
        };

        if (month < 1 || month > 12) {
            System.out.println("Mês inválido!");
        } else {

            boolean validDay = true;
            switch (month) {
                case 2:
                    if (day < 1 || day > 29) {

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
        switch (mes) {
            case 1:
                return (dia <= 19) ? "Capricórnio" : "Aquário";
            case 2:
                return (dia <= 18) ? "Aquário" : "Peixes";
            case 3:
                return (dia <= 20) ? "Peixes" : "Áries";
            case 4:
                return (dia <= 19) ? "Áries" : "Touro";
            case 5:
                return (dia <= 20) ? "Touro" : "Gêmeos";
            case 6:
                return (dia <= 20) ? "Gêmeos" : "Câncer";
            case 7:
                return (dia <= 22) ? "Câncer" : "Leão";
            case 8:
                return (dia <= 22) ? "Leão" : "Virgem";
            case 9:
                return (dia <= 22) ? "Virgem" : "Libra";
            case 10:
                return (dia <= 22) ? "Libra" : "Escorpião";
            case 11:
                return (dia <= 21) ? "Escorpião" : "Sagitário";
            case 12:
                return (dia <= 21) ? "Sagitário" : "Capricórnio";
            default:
                return "Signo inválido";
        }
    }
}
