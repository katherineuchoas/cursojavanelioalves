package Excercises.RepetitiveStructure.InvalidPassword;

import java.util.Scanner;

public class InvalidPassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("VAMOS COMEÇAR!");
        System.out.println("Digite sua senha:");
        int password = sc.nextInt();

        while (password != 2002) {
            System.out.println("Senha inválida! Tente novamente:");
            password = sc.nextInt();
        }
        System.out.println("ACESSO PERMITIDO!");
    }
}
