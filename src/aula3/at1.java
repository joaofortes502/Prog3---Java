package aula3;

import java.util.Scanner;

public class at1 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o nome do mes, sera retornado o seu indice.");
        String mes = ler.next();
        switch (mes){
            case "janeiro":
                System.out.print(1);
                break;
            case "fevereiro":
                System.out.print(2);
                break;
            case "março":
                System.out.print(3);
                break;
            case "abril":
                System.out.print(4);
                break;
            case "maio":
                System.out.print(5);
                break;
            case "junho":
                System.out.print(6);
                break;
            case "julho":
                System.out.print(7);
                break;
            case "agosto":
                System.out.print(8);
                break;
            case "setembro":
                System.out.print(9);
                break;
            case "outubro":
                System.out.print(10);
                break;
            case "novembro":
                System.out.print(11);
                break;
            case "dezembro":
                System.out.print(12);
                break;


        }

    }
}
