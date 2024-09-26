package aula4;

import java.util.Random;

public class at9 {
    public static void main(String[] args) {
        Random aleatorio = new Random(20);
        int[][] matriz = new int[5][5];
        int somaDiagonalPrincipal = 0;
        int somaAcimaDiagonalPrincipal = 0;
        int somaAbaixoDiagonalPrincipal = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = aleatorio.nextInt(10);
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(i==j){
                    somaDiagonalPrincipal+=matriz[i][j];
                }
                if (j>i){
                    somaAcimaDiagonalPrincipal+= matriz[i][j];
                }
                if (i>j){
                    somaAbaixoDiagonalPrincipal+= matriz[i][j];
                }
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
               System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Soma diagonal principal: "+somaDiagonalPrincipal);
        System.out.println("Soma acima diagonal principal: "+somaAcimaDiagonalPrincipal);
        System.out.println("Soma abaixo diagonal principal: "+somaAbaixoDiagonalPrincipal);

    }
}
