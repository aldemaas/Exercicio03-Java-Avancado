package conjunto_2_estruturas_condicionais;

import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");
        int idadeCidadao = sc.nextInt();

        if (idadeCidadao < 16) {
            System.out.println("Você não pode votar.");
        } else if ((idadeCidadao >= 16 && idadeCidadao < 18) || idadeCidadao >= 65) {
            System.out.println("O voto é facultativo.");
        } else {
            System.out.println("O voto é obrigatório.");
        }
        sc.close();
    }
}
