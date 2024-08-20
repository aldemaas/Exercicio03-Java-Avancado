package conjunto_3_estruturas_de_repeticao;

import java.util.Scanner;

public class Questao40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de pessoas no grupo:");
        int quantidadePessoas = sc.nextInt();

        if (quantidadePessoas <= 0) {
            System.out.println("A quantidade de pessoas deve ser maior que zero.");
            return;
        }

        int somaIdades = 0;
        int maiorIdade = Integer.MIN_VALUE;
        int menorIdade = Integer.MAX_VALUE;
        int quantidadeMaioresDeIdade = 0;

        for (int i = 0; i < quantidadePessoas; i++) {
            System.out.println("Digite a idade da pessoa " + (i + 1) + ":");
            int idade = sc.nextInt();

            if (idade < 0) {
                System.out.println("Idade inválida. A idade deve ser um número positivo.");
                return;
            }

            somaIdades += idade;
            if (idade > maiorIdade) {
                maiorIdade = idade;
            }
            if (idade < menorIdade) {
                menorIdade = idade;
            }
            if (idade >= 18) {
                quantidadeMaioresDeIdade++;
            }
        }

        double mediaIdades = (double) somaIdades / quantidadePessoas;

        System.out.println("Média das idades: " + mediaIdades);
        System.out.println("Maior idade: " + maiorIdade);
        System.out.println("Menor idade: " + menorIdade);
        System.out.println("Quantidade de pessoas maiores de idade: " + quantidadeMaioresDeIdade);

        sc.close();

    }
}
