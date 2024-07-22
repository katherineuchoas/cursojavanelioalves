package Excercises.SequenceStructure.DoublePrecisionFloatingPoint;

import java.util.Locale;
import java.util.Scanner;

public class DoublePrecisionFloatingPoint {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B, C, triangle, pi, circle, trapeze, squeze, rectangle;

        pi = 3.14159;
        System.out.println("Vamos iniciar!");
        System.out.println("Para realizar o cálculo, digite três parâmetros.");
        System.out.println("Para A digite:");
        A= sc.nextDouble();
        System.out.println("Para B digite:");
        B= sc.nextDouble();
        System.out.println("Para C digite:");
        C= sc.nextDouble();

        triangle = A * C / 2.0;
        circle = pi * C * C;
        trapeze = (A + B) / 2.0 * C;
        squeze = B * B;
        rectangle = A * B;


        System.out.printf("Com base nos valores informados, é possível ter. %n Um triânguo com área: %.3f%n Um círculo com área de: %.3f%n Um trapézio com área de: %.3f%n Um quadrado com área de: %.3f%n E um retângulo com área de %.3f%n", triangle, circle, trapeze, squeze, rectangle);

        sc.close();
    }

}
