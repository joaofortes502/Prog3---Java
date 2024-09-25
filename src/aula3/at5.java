package aula3;

import java.util.Scanner;

public class at5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Informe um número:");
        int numero = ler.nextInt();

        if(9<numero && numero<16){
            System.out.print("Está entre 10 e 15");
        }else {
            System.out.print("Não está entre 10 e 15");
        }
    }
}
