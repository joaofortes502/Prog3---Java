package aula4;

import java.util.Scanner;

public class at10 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num;
        do{
            System.out.print("Informe um número impar para gerar uma matriz quadrada: ");
            num = ler.nextInt();
        }while(num%2==0);

        int[][] matriz = new int[num][num];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("matriz ["+i+"]["+j+"]: ");
                matriz[i][j] = ler.nextInt();
            }
        }
        boolean simetrica = true;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]+" ");
                if(matriz[i][j]!=matriz[j][i]){
                    simetrica=false;
                }
            }
            System.out.println();
        }
        if(simetrica){
            System.out.print("é simetrica");
        }else{
            System.out.print("não é simetrica");
        }

    }
}
