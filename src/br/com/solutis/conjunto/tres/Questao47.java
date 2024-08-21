package br.com.solutis.conjunto.tres;

import java.util.Scanner;

public class Questao47 {
    /*
     *   47. Leia uma relação de pacientes de uma clínica, cada um com o nome, o sexo, o peso, a
     *   idade e a altura. Para sinalizar o fim da lista será fornecido “fim” no nome do último paciente.
     *    Exiba um relatório contendo:
     *    i. a quantidade de pacientes.
     *    ii. a média de idade dos homens.
     *    iii. a quantidade de mulheres com altura entre 1,60 e 1,70 e peso acima de 70kg.
     *    iv. a quantidade de pessoas com idade entre 18 e 25.
     *    v. o nome do paciente mais velho.
     *    vi. o nome da mulher mais baixa.
     *    vii. – neste item, você cria uma situação interessante constrói o algoritmo correspondente.
     */
    private static final Scanner sc = new Scanner(System.in);
    // não gosto desse código, mas necessaria se for apenas uma class.
    public static void main(String[] args) {
        int quantidadePacientes = 0;
        int somaIdadeHomens = 0;
        int quantidadeHomens = 0;
        int quantidadeMulheresAlturaPeso = 0;
        int quantidadeIdadeEntre18e25 = 0;
        String nomePacienteMaisVelho = "";
        int idadePacienteMaisVelho = 0;
        String nomeMulherMaisBaixa = "";
        double alturaMulherMaisBaixa = Double.MAX_VALUE;

        while (true) {
            System.out.print("Nome do paciente (ou 'fim' para encerrar): ");
            String nome = sc.nextLine();
            if (nome.equalsIgnoreCase("fim")) {
                break;
            }

            System.out.print("Sexo (M/F): ");
            char sexo = sc.nextLine().charAt(0);

            System.out.print("Idade: ");
            int idade = Integer.parseInt(sc.nextLine());

            System.out.print("Peso (kg): ");
            double peso = Double.parseDouble(sc.nextLine());

            System.out.print("Altura (m): ");
            double altura = Double.parseDouble(sc.nextLine());

            quantidadePacientes++;

            // i. Média de idade dos homens
            if (sexo == 'M' || sexo == 'm') {
                somaIdadeHomens += idade;
                quantidadeHomens++;
            }

            // ii. Quantidade de mulheres com altura entre 1,60 e 1,70 e peso acima de 70kg
            if ((sexo == 'F' || sexo == 'f') && altura >= 1.60 && altura <= 1.70 && peso > 70) {
                quantidadeMulheresAlturaPeso++;
            }

            // iii. Quantidade de pessoas com idade entre 18 e 25
            if (idade >= 18 && idade <= 25) {
                quantidadeIdadeEntre18e25++;
            }

            // iv. Nome do paciente mais velho
            if (idade > idadePacienteMaisVelho) {
                idadePacienteMaisVelho = idade;
                nomePacienteMaisVelho = nome;
            }

            // v. Nome da mulher mais baixa
            if ((sexo == 'F' || sexo == 'f') && altura < alturaMulherMaisBaixa) {
                alturaMulherMaisBaixa = altura;
                nomeMulherMaisBaixa = nome;
            }
        }

        // Resultados
        System.out.println("\n--- Relatório Final ---");
        System.out.println("Quantidade de pacientes: " + quantidadePacientes);

        if (quantidadeHomens > 0) {
            double mediaIdadeHomens = (double) somaIdadeHomens / quantidadeHomens;
            System.out.println("Média de idade dos homens: " + mediaIdadeHomens);
        } else {
            System.out.println("Não há homens na lista.");
        }

        System.out.println("Quantidade de mulheres com altura entre 1,60m e 1,70m e peso acima de 70kg: " + quantidadeMulheresAlturaPeso);
        System.out.println("Quantidade de pessoas com idade entre 18 e 25 anos: " + quantidadeIdadeEntre18e25);

        if (!nomePacienteMaisVelho.isEmpty()) {
            System.out.println("Nome do paciente mais velho: " + nomePacienteMaisVelho);
        } else {
            System.out.println("Não há pacientes na lista.");
        }

        if (!nomeMulherMaisBaixa.isEmpty()) {
            System.out.println("Nome da mulher mais baixa: " + nomeMulherMaisBaixa);
        } else {
            System.out.println("Não há mulheres na lista.");
        }

        // vi. Item extra criado pelo programador
        System.out.println("Situação Extra: Quantidade de pacientes acima do peso ideal (IMC > 25):");
        // Este item pode ser implementado como um adicional no código
    }
}
