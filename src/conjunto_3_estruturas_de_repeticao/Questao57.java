package conjunto_3_estruturas_de_repeticao;

import java.util.Scanner;

public class Questao57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Me informe duas datas para mostrar os dias validos entre elas no formato dd/mm/yyyy");
        System.out.println("Primeira data:");
        String data1 = sc.nextLine();
        System.out.println("Segunda data:");
        String data2 = sc.nextLine();
        String[] auxData1 = data1.split("/");
        String[] auxData2 = data2.split("/");
        int mes1 = Integer.parseInt(auxData1[1].trim());
        int mes2 = Integer.parseInt(auxData2[1].trim());
        int dia1 = Integer.parseInt(auxData1[0].trim());
        int dia2 = Integer.parseInt(auxData2[0].trim());
        int ano1 = Integer.parseInt(auxData1[2].trim());
        int ano2 = Integer.parseInt(auxData2[2].trim());
        if(data2.equals(data1)){
            System.out.println("Não existe diferença entre as datas");
        }
        int auxDiferenca = mes1 - mes2 -(ano2-ano1);
        int mesDivereca = -1;
        int anoDifereca = ano2 - ano1;
        if(auxDiferenca != 0 && anoDifereca == 0){
            mesDivereca = mes2 - mes1;
        }

        if(auxDiferenca == 0){
            for(int i = dia1+1; i< dia2; i++){
                if(i <= 9 ){
                    System.out.printf(" 0%d/%s/%s",i,auxData1[1],auxData1[2]);
                }else {
                    System.out.printf(" %d/%s/%s",i,auxData1[1],auxData1[2]);
                }
            }
        }
        while(mesDivereca != -1){
            if(mesDivereca == 0){
                for(int i = dia1+1; i< dia2; i++){
                    if(i<= 9){
                        if(mes1<=9){
                            System.out.printf(" 0%d/0%d/%s\n",i,mes1,auxData1[2]);
                        }else{
                            System.out.printf(" 0%d/%d/%s\n",i,mes1,auxData1[2]);
                        }

                    }else{
                        if(mes1<=9){
                            System.out.printf(" %d/0%d/%s\n",i,mes1,auxData1[2]);
                        }else{
                            System.out.printf(" %d/%d/%s\n",i,mes1,auxData1[2]);
                        }
                    }
                }
                break;
            }
            if(mes1 == 1 || mes1 == 3 || mes1 == 5 || mes1 == 7 || mes1 == 8 || mes1 == 10 || mes1 == 12){
                for(int i = dia1+1; i<= 31; i++){
                    dia1++;
                    if(i<= 9){
                        if(mes1<=9){
                            System.out.printf(" 0%d/0%d/%s\n",i,mes1,auxData1[2]);
                        }else{
                            System.out.printf(" 0%d/%d/%s\n",i,mes1,auxData1[2]);
                        }

                    }else{
                        if(mes1<=9){
                            System.out.printf(" %d/0%d/%s\n",i,mes1,auxData1[2]);
                        }else{
                            System.out.printf(" %d/%d/%s\n",i,mes1,auxData1[2]);
                        }
                    }
                }
            }else if(mes1 == 4 || mes1 == 6 || mes1 == 9 || mes1 == 11){
                for(int i = dia1+1; i<= 30; i++){
                    if(i<= 9){
                        if(mes1<=9){
                            System.out.printf(" 0%d/0%d/%s\n",i,mes1,auxData1[2]);
                        }else{
                            System.out.printf(" 0%d/%d/%s\n",i,mes1,auxData1[2]);
                        }

                    }else{
                        if(mes1<=9){
                            System.out.printf(" %d/0%d/%s\n",i,mes1,auxData1[2]);
                        }else{
                            System.out.printf(" %d/%d/%s\n",i,mes1,auxData1[2]);
                        }
                    }
                }
            }else{
                for(int i = dia1+1; i<= 28; i++){
                    if(i<= 9){
                        if(mes1<=9){
                            System.out.printf(" 0%d/0%d/%s\n",i,mes1,auxData1[2]);
                        }else{
                            System.out.printf(" 0%d/%d/%s\n",i,mes1,auxData1[2]);
                        }

                    }else{
                        if(mes1<=9){
                            System.out.printf(" %d/0%d/%s\n",i,mes1,auxData1[2]);
                        }else{
                            System.out.printf(" %d/%d/%s\n",i,mes1,auxData1[2]);
                        }
                    }
                }

            }
            mes1++;
            dia1 = 0;
            mesDivereca = mes2 - mes1;
        }

        while(anoDifereca != -1){
            if(mesDivereca == 0 && ano1 == ano2){
                for(int i = dia1+1; i< dia2; i++){
                    if(i<= 9){
                        if(mes1<=9){
                            System.out.printf(" 0%d/0%d/%s\n",i,mes1,ano1);
                        }else{
                            System.out.printf(" 0%d/%d/%s\n",i,mes1,ano1);
                        }

                    }else{
                        if(mes1<=9){
                            System.out.printf(" %d/0%d/%s\n",i,mes1,ano1);
                        }else{
                            System.out.printf(" %d/%d/%s\n",i,mes1,ano1);
                        }
                    }
                }
                break;
            }
            if(mes1 == 1 || mes1 == 3 || mes1 == 5 || mes1 == 7 || mes1 == 8 || mes1 == 10 || mes1 == 12){
                for(int i = dia1+1; i<= 31; i++){
                    dia1++;
                    if(i<= 9){
                        if(mes1<=9){
                            System.out.printf(" 0%d/0%d/%s\n",i,mes1,ano1);
                        }else{
                            System.out.printf(" 0%d/%d/%s\n",i,mes1,ano1);
                        }

                    }else{
                        if(mes1<=9){
                            System.out.printf(" %d/0%d/%s\n",i,mes1,ano1);
                        }else{
                            System.out.printf(" %d/%d/%s\n",i,mes1,ano1);
                        }
                    }
                }
            }else if(mes1 == 4 || mes1 == 6 || mes1 == 9 || mes1 == 11){
                for(int i = dia1+1; i<= 30; i++){
                    if(i<= 9){
                        if(mes1<=9){
                            System.out.printf(" 0%d/0%d/%s\n",i,mes1,ano1);
                        }else{
                            System.out.printf(" 0%d/%d/%s\n",i,mes1,ano1);
                        }

                    }else{
                        if(mes1<=9){
                            System.out.printf(" %d/0%d/%s\n",i,mes1,ano1);
                        }else{
                            System.out.printf(" %d/%d/%s\n",i,mes1,ano1);
                        }
                    }
                }
            }else{
                int bi = 28;
                if (ano1 % 4 == 0) {
                    bi = 29;
                }
                for(int i = dia1+1; i<= bi; i++){
                    if(i<= 9){
                        if(mes1<=9){
                            System.out.printf(" 0%d/0%d/%s\n",i,mes1,ano1);
                        }else{
                            System.out.printf(" 0%d/%d/%s\n",i,mes1,ano1);
                        }

                    }else{
                        if(mes1<=9){
                            System.out.printf(" %d/0%d/%s\n",i,mes1,ano1);
                        }else{
                            System.out.printf(" %d/%d/%s\n",i,mes1,ano1);
                        }
                    }
                }

            }
            mes1++;
            if(mes1 > 12){
                mes1 = 1;
                ano1++;
            }
            dia1 = 0;
            anoDifereca = ano2 - ano1;
            mesDivereca = mes2 - mes1;
        }


        sc.close();
    }
}
