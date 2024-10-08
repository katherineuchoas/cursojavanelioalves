package Excercises.SequenceStructure.Difference;

import java.util.Locale;
import java.util.Scanner;

/*
Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
*/

public class Difference {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int a, b, c, d, difference;

        System.out.println("Vamos realizar a diferença dos números informados. Digite um número:");
        a = sc.nextInt();
        System.out.println("Digite mais um número:");
        b = sc.nextInt();
        System.out.println("Digite mais um número:");
        c = sc.nextInt();
        System.out.println("Digite o último número:");
        d = sc.nextInt();

        difference = (a * b - c * d);
        System.out.println("A diferença entre os números informados é:" + difference);
        sc.close();
    }
}
