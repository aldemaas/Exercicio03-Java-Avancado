package conjunto_2_estruturas_condicionais;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Questao17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Map<Integer, String> meses = new HashMap<>();
        meses.put(1, "Janeiro");
        meses.put(2, "Fevereiro");
        meses.put(3, "Março");
        meses.put(4, "Abril");
        meses.put(5, "Maio");
        meses.put(6, "Junho");
        meses.put(7, "Julho");
        meses.put(8, "Agosto");
        meses.put(9, "Setembro");
        meses.put(10, "Outubro");
        meses.put(11, "Novembro");
        meses.put(12, "Dezembro");


        Map<Integer, Integer> diasNoMes = new HashMap<>();
        diasNoMes.put(1, 31);
        diasNoMes.put(2, 28);
        diasNoMes.put(3, 31);
        diasNoMes.put(4, 30);
        diasNoMes.put(5, 31);
        diasNoMes.put(6, 30);
        diasNoMes.put(7, 31);
        diasNoMes.put(8, 31);
        diasNoMes.put(9, 30);
        diasNoMes.put(10, 31);
        diasNoMes.put(11, 30);
        diasNoMes.put(12, 31);

        System.out.print("Digite o número do dia: ");
        int dia = sc.nextInt();

        System.out.print("Digite o número do mês: ");
        int mes = sc.nextInt();

        if (meses.containsKey(mes)) {
            String nomeMes = meses.get(mes);
            int maxDias = diasNoMes.get(mes);

            if (dia >= 1 && dia <= maxDias) {
                System.out.println("A data está correta: " + dia + " de " + nomeMes);
                System.out.println("Seu signo é: " + obterSigno(dia, mes));
            } else {
                System.out.println("Dia inválido para o mês de " + nomeMes);
            }
        } else {
            System.out.println("Mês inválido.");
        }

        sc.close();
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
