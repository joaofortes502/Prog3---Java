package aula3;

import java.util.Scanner;

public class at4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Informe um número:");
        int numero = ler.nextInt();
        if(numero%2==0){
            System.out.print("Par!");
        }else{
            System.out.print("Impar!");
        }
    }
}
