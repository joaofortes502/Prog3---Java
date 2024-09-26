package aula4;

public class at5 {
    public static void main(String[] args){

        int[] vetor =  {18, 7, 12, 3, 15, 20, 6, 11, 5, 19, 2, 9, 17, 10, 4, 8, 14, 1, 16, 13};

        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor.length - 1; j++) {
                if (vetor[j]>vetor[j+1]){
                    int temp = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = temp;
                }
            }
        }

        for (int valor:vetor){
            System.out.print(valor+" ");
        }
    }
}
