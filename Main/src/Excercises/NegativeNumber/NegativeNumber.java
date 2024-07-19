package Excercises.NegativeNumber;

import java.util.Locale;
import java.util.Scanner;

public class NegativeNumber {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Vamos iniciar!");
        System.out.println("Digite um número:");
        int number =sc.nextInt();

        if (number >= 0){
             System.out.println("Não negativo!");
        }
        else{
            System.out.println("Negativo!");
        }

        sc.close();
    }
}
