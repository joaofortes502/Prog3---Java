package aula4;

import java.util.Random;

public class at8 {
    public static void main(String[] args){
        Random aleatorio = new Random();
        int[][] matriz = new int[3][3];
        int[] sl = new int[3];
        int[] sc = new int[3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j]=aleatorio.nextInt(10);
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sl[i]+=matriz[i][j];
                sc[i]+=matriz[j][i];
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Soma linhas:");
        for(int valor:sl){
            System.out.print(valor+" ");
        }
        System.out.println();
        System.out.println("Soma colunas:");
        for(int valor:sc){
            System.out.print(valor+" ");
        }

    }
}
