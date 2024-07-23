package Excercises.SequenceStructure.Area;

import java.util.Locale;
import java.util.Scanner;

/*
Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
casas decimais conforme exemplos.
Fórmula da área: area = π . raio2
Considere o valor de π = 3.14159
*/

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

