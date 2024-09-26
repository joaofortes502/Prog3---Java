package aula4;

import java.util.Scanner;

public class at6 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int[][] matriz =new int[2][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Matriz ["+i+"]["+j+"]:");
                matriz[i][j] = ler.nextInt();
            }
        }
        System.out.print("Informe o número a ser buscado:");
        int numero = ler.nextInt();
        boolean achou = false;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j]+" ");
                if (numero==matriz[i][j]) {
                    achou = true;
                }
            }
            System.out.println();
        }

        if(achou){
            System.out.print("o numero "+numero+" está na matriz");
        }else{
            System.out.print("o numero "+numero+" não está na matriz");
        }
    }
}
