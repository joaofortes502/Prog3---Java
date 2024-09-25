package aula4;

import java.util.Scanner;

public class at2 {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        int cont = 0;
        Scanner ler = new Scanner(System.in);
        while (cont<10){
            System.out.print("Informe um número");
            int numero = ler.nextInt();
            boolean novo = true;
            for(int i=0;i<cont;i++){
                if(vetor[i]==numero){
                    novo = false;
                    break;
                }
            }
            if(novo){
                vetor[cont] = numero;
                cont++;
            }else{
                System.out.println("Número já inserido.");
            }
        }
        for(int valor:vetor){
            System.out.print(valor+ " ");
        }
    }
}
