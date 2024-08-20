package conjunto_3_estruturas_de_repeticao;

import java.util.Scanner;

public class Questao56 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o nome dos candidatos:");
        String[] candidatos = new String[4];
        candidatos[3] = "Branco";
        for(int i = 0; i<3;i++){
            System.out.println((i+1)+"º candidato");
            candidatos[i] = sc.nextLine();
        }
        System.out.println("--------------------------");

        int bra = 0;
        int pri = 0;
        int seg = 0;
        int ter = 0;
        String votar = "s";
        while (votar.equals("s")){
            System.out.println("Escolha em que votar\n0 para "+candidatos[3]
                    +":\n1 para o candidato "+candidatos[0]
                    +":\n2 para o candidato "+candidatos[1]
                    +":\n3 para o candidato "+candidatos[2]+":");
            int votacao = sc.nextInt();
            if(votacao == 0){
                bra++;
            }else if(votacao == 1){
                pri++;
            }else if(votacao == 2){
                seg++;
            }else if(votacao == 3){
                ter++;
            }else {
                System.out.println("Opção invalida!");
            }
            sc.nextLine();
            System.out.println("Caso tenho proximo eleitor tecle 's' no caso de não 'n':");
            votar = sc.nextLine();
            if(votar.equals("n")){
                double aux = bra+pri+seg+ter;
                double porBra = (bra*100)/aux;
                System.out.printf("Total de votos em Brancos %d que equivale %.2f%% dos votos\n",bra,porBra);
                double porPri = (pri*100)/aux;
                System.out.printf("Total de votos para %s %d que equivale %.2f%% dos votos\n",candidatos[0],
                        pri,porPri);
                double porSeg = (seg*100)/aux;
                System.out.printf("Total de votos para %s %d que equivale %.2f%% dos votos\n",candidatos[1],
                        seg,porSeg);
                double porTer = (ter*100)/aux;
                System.out.printf("Total de votos para %s %d que equivale %.2f%% dos votos\n",candidatos[2],
                        ter,porTer);
                int auxInt = (int) aux;
                System.out.println("Total de votos apurados: "+ auxInt);
            }

        }
        sc.close();
    }
}
