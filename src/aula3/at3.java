package aula3;

import java.util.Scanner;

public class at3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String senha = "12345678";

        System.out.print("Digite a senha:");
        String tentativa = ler.next();

        if(senha.equals(tentativa)){
            System.out.print("Acesso autorizado");
        }else{
            System.out.print("Acesso negado");
        }
    }
}
