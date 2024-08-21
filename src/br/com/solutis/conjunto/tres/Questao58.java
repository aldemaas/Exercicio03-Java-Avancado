package br.com.solutis.conjunto.tres;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Questao58 {
    //58. Leia uma data e uma quantidade de dias, em seguida exiba esta data somada pela
    //quantidade de dias fornecida. Exemplo: 29/04/2007 + 3 = 02/05/2007.
    private static final Scanner sc = new Scanner(System.in);
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public static void main(String[] args) {
        System.out.print("Por gentileza informe a data: ");
        String entradaData = sc.nextLine();
        LocalDate data = LocalDate.parse(entradaData, formatter);

        System.out.println("Quantos dias deseja adicionar?");
        int dias = sc.nextInt();

        LocalDate novaData = data.plusDays(dias);

        System.out.println("Nova data será: " + novaData.format(formatter));
    }
}
