package aula3;

import java.util.Scanner;

/* */
public class at2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nome;
        int idade;
        System.out.print("Informe o nome do competidor: ");
        nome = ler.next();
        System.out.print("Informe a idade do competidor: ");
        idade = ler.nextInt();

        if(idade>4 && idade<8){
            System.out.print("Infantil A");
        } else if (idade>7 && idade<11) {
            System.out.print("Infantil B");
        } else if (idade>10 && idade<14) {
            System.out.print("Juvenil A");
        } else if (idade>13 && idade<18){
            System.out.print("Juvenil B");
        } else if(idade<18){
            System.out.print("Adulto");
        }
    }
}
