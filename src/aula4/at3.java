package aula4;

import java.util.Random;

public class at3 {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int[] vetor = new int[100];
        int[] par = new int[100];
        int[] impar = new int[100];

        int cPar=0;
        int cImpar = 0;

        for(int i=0;i<vetor.length;i++){
            vetor[i] = aleatorio.nextInt(100);
            if(vetor[i]%2==0){
                par[cPar] = vetor[i];
                cPar++;
            }else{
                impar[cImpar] = vetor[i];
                cImpar++;
            }
        }

        for(int valor:vetor){
            System.out.print(valor+" ");
        }
        System.out.println();

        for(int valor:par){
            System.out.print(valor+" ");
        }
        System.out.println();

        for(int valor:impar){
            System.out.print(valor+" ");
        }

    }
}
