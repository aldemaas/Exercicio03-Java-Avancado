package br.com.solutis.conjunto.tres;

import java.util.Scanner;

/**
 * @author Pedro Emanoel Souza Rocha
 */
public class Questao57 {

    /*
    57. Exiba todas as datas de um calendário que estão entre duas datas informadas pelo usuário
    (dia, mês e ano). Suponha que as duas datas informadas sejam válidas.
     */

    public static void main(String[] args) {
        System.out.println("Exercício 57 - Estruturas de Repetição");
        Scanner sc = new Scanner(System.in);

        String[] auxData1, auxData2;
        String data1, data2;
        int dia1, dia2, mes1, mes2, ano1, ano2;
        int auxDiferenca, mesDivereca, anoDifereca;

        System.out.println("Me informe duas datas para mostrar os dias validos entre elas no formato dd/mm/yyyy");
        System.out.println("Menor data:");
        data1 = sc.nextLine();

        System.out.println("Maior data:");
        data2 = sc.nextLine();

        auxData1 = data1.split("/");
        auxData2 = data2.split("/");

        mes1 = Integer.parseInt(auxData1[1].trim());
        mes2 = Integer.parseInt(auxData2[1].trim());
        dia1 = Integer.parseInt(auxData1[0].trim());
        dia2 = Integer.parseInt(auxData2[0].trim());
        ano1 = Integer.parseInt(auxData1[2].trim());
        ano2 = Integer.parseInt(auxData2[2].trim());

        if (data2.equals(data1)) {
            System.out.println("Não existe diferença entre as datas");
        }

        auxDiferenca = mes1 - mes2 - (ano2 - ano1);
        mesDivereca = -1;
        anoDifereca = ano2 - ano1;

        if (auxDiferenca != 0 && anoDifereca == 0) {
            mesDivereca = mes2 - mes1;
        }

        if (auxDiferenca == 0) {
            for (int i = dia1 + 1; i < dia2; i++) {
                if (i <= 9) {
                    System.out.printf(" 0%d/%s/%s", i, auxData1[1], auxData1[2]);
                } else {
                    System.out.printf(" %d/%s/%s", i, auxData1[1], auxData1[2]);
                }
            }
        }
        while (mesDivereca != -1) {
            if (mesDivereca == 0) {
                for (int i = dia1 + 1; i < dia2; i++) {
                    if (i <= 9) {
                        if (mes1 <= 9) {
                            System.out.printf(" 0%d/0%d/%s\n", i, mes1, auxData1[2]);
                        } else {
                            System.out.printf(" 0%d/%d/%s\n", i, mes1, auxData1[2]);
                        }

                    } else {
                        if (mes1 <= 9) {
                            System.out.printf(" %d/0%d/%s\n", i, mes1, auxData1[2]);
                        } else {
                            System.out.printf(" %d/%d/%s\n", i, mes1, auxData1[2]);
                        }
                    }
                }
                break;
            }
            if (mes1 == 1 || mes1 == 3 || mes1 == 5 || mes1 == 7 || mes1 == 8 || mes1 == 10 || mes1 == 12) {
                for (int i = dia1 + 1; i <= 31; i++) {
                    dia1++;
                    if (i <= 9) {
                        if (mes1 <= 9) {
                            System.out.printf(" 0%d/0%d/%s\n", i, mes1, auxData1[2]);
                        } else {
                            System.out.printf(" 0%d/%d/%s\n", i, mes1, auxData1[2]);
                        }

                    } else {
                        if (mes1 <= 9) {
                            System.out.printf(" %d/0%d/%s\n", i, mes1, auxData1[2]);
                        } else {
                            System.out.printf(" %d/%d/%s\n", i, mes1, auxData1[2]);
                        }
                    }
                }
            } else if (mes1 == 4 || mes1 == 6 || mes1 == 9 || mes1 == 11) {
                for (int i = dia1 + 1; i <= 30; i++) {
                    if (i <= 9) {
                        if (mes1 <= 9) {
                            System.out.printf(" 0%d/0%d/%s\n", i, mes1, auxData1[2]);
                        } else {
                            System.out.printf(" 0%d/%d/%s\n", i, mes1, auxData1[2]);
                        }

                    } else {
                        if (mes1 <= 9) {
                            System.out.printf(" %d/0%d/%s\n", i, mes1, auxData1[2]);
                        } else {
                            System.out.printf(" %d/%d/%s\n", i, mes1, auxData1[2]);
                        }
                    }
                }
            } else {
                for (int i = dia1 + 1; i <= 28; i++) {
                    if (i <= 9) {
                        if (mes1 <= 9) {
                            System.out.printf(" 0%d/0%d/%s\n", i, mes1, auxData1[2]);
                        } else {
                            System.out.printf(" 0%d/%d/%s\n", i, mes1, auxData1[2]);
                        }

                    } else {
                        if (mes1 <= 9) {
                            System.out.printf(" %d/0%d/%s\n", i, mes1, auxData1[2]);
                        } else {
                            System.out.printf(" %d/%d/%s\n", i, mes1, auxData1[2]);
                        }
                    }
                }

            }
            mes1++;
            dia1 = 0;
            mesDivereca = mes2 - mes1;
        }

        while (anoDifereca != -1) {
            if (mesDivereca == 0 && ano1 == ano2) {
                for (int i = dia1 + 1; i < dia2; i++) {
                    if (i <= 9) {
                        if (mes1 <= 9) {
                            System.out.printf(" 0%d/0%d/%s\n", i, mes1, ano1);
                        } else {
                            System.out.printf(" 0%d/%d/%s\n", i, mes1, ano1);
                        }

                    } else {
                        if (mes1 <= 9) {
                            System.out.printf(" %d/0%d/%s\n", i, mes1, ano1);
                        } else {
                            System.out.printf(" %d/%d/%s\n", i, mes1, ano1);
                        }
                    }
                }
                break;
            }
            if (mes1 == 1 || mes1 == 3 || mes1 == 5 || mes1 == 7 || mes1 == 8 || mes1 == 10 || mes1 == 12) {
                for (int i = dia1 + 1; i <= 31; i++) {
                    dia1++;
                    if (i <= 9) {
                        if (mes1 <= 9) {
                            System.out.printf(" 0%d/0%d/%s\n", i, mes1, ano1);
                        } else {
                            System.out.printf(" 0%d/%d/%s\n", i, mes1, ano1);
                        }

                    } else {
                        if (mes1 <= 9) {
                            System.out.printf(" %d/0%d/%s\n", i, mes1, ano1);
                        } else {
                            System.out.printf(" %d/%d/%s\n", i, mes1, ano1);
                        }
                    }
                }
            } else if (mes1 == 4 || mes1 == 6 || mes1 == 9 || mes1 == 11) {
                for (int i = dia1 + 1; i <= 30; i++) {
                    if (i <= 9) {
                        if (mes1 <= 9) {
                            System.out.printf(" 0%d/0%d/%s\n", i, mes1, ano1);
                        } else {
                            System.out.printf(" 0%d/%d/%s\n", i, mes1, ano1);
                        }

                    } else {
                        if (mes1 <= 9) {
                            System.out.printf(" %d/0%d/%s\n", i, mes1, ano1);
                        } else {
                            System.out.printf(" %d/%d/%s\n", i, mes1, ano1);
                        }
                    }
                }
            } else {
                int bi = 28;
                if (ano1 % 4 == 0) {
                    if (ano1 % 100 == 0) {
                        if (ano1 % 400 == 0) {
                            bi = 29;
                        }
                    } else {
                        bi = 29;
                    }
                }
                for (int i = dia1 + 1; i <= bi; i++) {
                    if (i <= 9) {
                        if (mes1 <= 9) {
                            System.out.printf(" 0%d/0%d/%s\n", i, mes1, ano1);
                        } else {
                            System.out.printf(" 0%d/%d/%s\n", i, mes1, ano1);
                        }

                    } else {
                        if (mes1 <= 9) {
                            System.out.printf(" %d/0%d/%s\n", i, mes1, ano1);
                        } else {
                            System.out.printf(" %d/%d/%s\n", i, mes1, ano1);
                        }
                    }
                }

            }
            mes1++;
            if (mes1 > 12) {
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
