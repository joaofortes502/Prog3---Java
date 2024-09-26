package aula4;

import java.util.Random;

public class at7 {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int[][] matriz = new int[4][4];
        int somaL3 = 0;
        int somaC2 = 0;
        int soma = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = aleatorio.nextInt(11);
                soma+=matriz[i][j];
                if (i==2){
                    somaL3+=matriz[i][j];
                }
                if (j==1){
                    somaC2+=matriz[i][j];
                }
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println("Soma da linha 3: "+somaL3);
        System.out.println("Soma da coluna 2: "+somaC2);
        System.out.println("Soma total: "+soma);
    }
}
