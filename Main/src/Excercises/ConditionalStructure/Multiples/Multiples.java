package Excercises.ConditionalStructure.Multiples;

import java.util.Locale;
import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("SÃO MÚLTIPLOS OU NÃO?");
        System.out.println("Digite um número:");
        int number1 =sc.nextInt();
        System.out.println("Digite o segundo número:");
        int number2 =sc.nextInt();

        if (number1 % number2 == 0 || number2 % number1 == 0){
            System.out.println("SÃO MÚLTIPLOS!");
        }
        else{
            System.out.println("NÃO SÃO MÚLTIPLOS!");
        }

        sc.close();
    }
}
