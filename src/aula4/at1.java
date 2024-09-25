package aula4;

import java.util.Random;

public class at1 {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int[] vetorA = new int[5];
        int[] vetorB = new int[5];

        for (int i=0;i<vetorA.length;i++){
            vetorA[i] = aleatorio.nextInt(10);
            vetorB[i] = vetorA[i];
        }

        for(int valor:vetorA){
            System.out.print(valor+" ");
        }
        System.out.println();
        for(int valor:vetorB){
            System.out.print(valor+" ");
        }

    }
}
