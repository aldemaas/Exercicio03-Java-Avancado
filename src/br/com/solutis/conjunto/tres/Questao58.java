package br.com.solutis.conjunto.tres;

import utils.Data;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import static utils.UtilsConjunto2.*;

/**
 * @author Gabriel de Abreu Farias Azevedo
 */
public class Questao58 {

    /*
    58. Leia uma data e uma quantidade de dias, em seguida exiba esta data somada pela
    quantidade de dias fornecida.

    Exemplo: 29/04/2007 + 3 = 02/05/2007.
     */

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Por gentileza informe a data: ");

        int dias;
        byte dia, mes;
        short ano;

        System.out.print("Digite o dia: ");
        dia = getDia(sc);

        System.out.print("Digite o mês: ");
        mes = getMes(sc);

        System.out.print("Digite o ano: ");
        ano = getAno(sc);

        Data dataObj = new Data(dia, mes, ano);

        System.out.println("Quantos dias deseja adicionar?");
        dias = sc.nextInt();

        dataObj.avanceDias(dias);

        System.out.println("Data final: " + dataObj);
    }
}
