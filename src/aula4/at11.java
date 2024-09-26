package aula4;

import java.util.Random;

public class at11 {
    public static void main(String[] args){
        Random random = new Random();
        int[][] cartela = new int[5][5];
        int linha=0;
        int coluna=0;
        int numero;
        while (linha<5){
            while (coluna<5){
                numero = random.nextInt(30);
                boolean existe = false;
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 5; j++) {
                        if (numero==cartela[i][j]){
                            existe = true;
                            break;
                        }
                    }
                }
                if (!existe){
                    cartela[linha][coluna]=numero;
                    coluna++;
                    if (coluna==5){
                        coluna=0;
                        linha++;
                        if(linha==5){
                            break;
                        }
                    }
                }

            }
        }

        for (int linhas[]:cartela){
            for (int valor:linhas){
                System.out.print(valor+" ");
            }
            System.out.println();
        }
    }
}
