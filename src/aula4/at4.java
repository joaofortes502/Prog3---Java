package aula4;

import java.util.Scanner;

public class at4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] nMatricula = new int[3];
        float[] media = new float[3];
        int cont = 0;
        int num;
        do {
            System.out.print("Informe o número de matrícula: ");
            num = ler.nextInt();
            boolean nExiste = true;
            for (int i = 0; i < cont; i++) {
                if (num==nMatricula[i]){
                    nExiste = false;
                    break;
                }
            }
            if(nExiste){
                nMatricula[cont]=num;
                cont++;
            }else{
                System.out.println("Número de matrícula já inserido.");
            }

        }while (cont<3);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Informe a nota "+(j+1)+" do aluno "+(i+1)+":");
                media[i]+= ler.nextFloat();
            }
            media[i]=media[i]/3;
        }
        for (int i = 0; i < 3; i++) {
            System.out.printf("Aluno de matrícula %d obteve média de %.2f",nMatricula[i],media[i]);
            System.out.println();
        }
    }
}
