package conjunto_3_estruturas_de_repeticao;

import java.util.Scanner;

/**
 * @author Kauê Alexandre dos Reis Santos
 */
public class Questao40 {

    /*
    40. Solicite ao usuário a idade de cada um componente de um grupo de pessoas. A quantidade
    de pessoas também será determinada por ele.
    Após o término da entrada, apresente:
    a. a média das idades,
    b. a maior idade,
    c. a menor idade,
    d. a quantidade de pessoas maior de idade.
     */

    public static void main(String[] args) {
        System.out.println("Exercício 40 - Média, maior e menor idade e quantidade de pessoas maiores de idade.");
        Scanner sc = new Scanner(System.in);

        double mediaIdades;
        int quantidadePessoas, somaIdades, maiorIdade,
                menorIdade, quantidadeMaioresDeIdade, idade;

        System.out.println("Digite a quantidade de pessoas no grupo:");
        quantidadePessoas = sc.nextInt();

        if (quantidadePessoas <= 0) {
            System.out.println("A quantidade de pessoas deve ser maior que zero.");
            return;
        }

        somaIdades = 0;
        maiorIdade = Integer.MIN_VALUE;
        menorIdade = Integer.MAX_VALUE;
        quantidadeMaioresDeIdade = 0;

        for (int i = 0; i < quantidadePessoas; i++) {
            System.out.println("Digite a idade da pessoa " + (i + 1) + ":");
            idade = sc.nextInt();

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

        mediaIdades = (double) somaIdades / quantidadePessoas;

        System.out.println("Média das idades: " + mediaIdades);
        System.out.println("Maior idade: " + maiorIdade);
        System.out.println("Menor idade: " + menorIdade);
        System.out.println("Quantidade de pessoas maiores de idade: " + quantidadeMaioresDeIdade);

        sc.close();
    }
}
