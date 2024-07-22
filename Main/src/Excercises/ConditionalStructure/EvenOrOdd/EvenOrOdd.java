package Excercises.ConditionalStructure.EvenOrOdd;

import java.util.Locale;
import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("PAR OU IMPAR!");
        System.out.println("Digite um número:");
        int number =sc.nextInt();

        if (Math.abs(number % 2) == 1){
            System.out.println("IMPAR!");
        }
        else{
            System.out.println("PAR!");
        }

        sc.close();
    }
}
