package Excercises.Area;

import java.util.Locale;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double area, radius, pi = 3.14159;
        System.out.println("Digite o valor do raio sobre o qual quer calcular a area:");
        radius = sc.nextDouble();

        area = pi * radius * radius;

        System.out.printf("Area com extensão de=%.4f%n", area);

        sc.close();
    }
}

