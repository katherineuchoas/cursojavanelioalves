package Excercises.RepetitiveStructure.While.InvalidPassword;

import java.util.Scanner;

/*
Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
*/

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
