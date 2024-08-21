package br.com.solutis.conjunto.dois;

import java.util.Scanner;

/**
 * @author Suerdo Flaubert Campos de Lucena Júnior
 */
public class Questao9 {

    /*
    9. Verifique se o usuário é maior de idade ou não.
     */

    public static void main(String[] args) {
        System.out.println("Exercício 9 - Verifique se o usuário é maior de idade ou não.");
        Scanner sc = new Scanner(System.in);

        int idadeUsuario;

        System.out.println("Digite sua idade: ");
        idadeUsuario = sc.nextInt();

        if(idadeUsuario < 0) {
            System.out.println("Não existe idade negativa.");
        } else if (idadeUsuario >= 18) {
            System.out.println("Maior de idade.");
        } else {
            System.out.println("Ainda não é maior de idade");
        }

        sc.close();
    }
}
