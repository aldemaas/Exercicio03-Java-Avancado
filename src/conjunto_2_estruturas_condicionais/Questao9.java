package conjunto_2_estruturas_condicionais;

import java.util.Scanner;

public class Questao9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idadeUsuario = sc.nextInt();

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
