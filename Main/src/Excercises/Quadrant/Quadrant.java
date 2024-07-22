package Excercises.Quadrant;

import java.util.Locale;
import java.util.Scanner;

public class Quadrant {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("VAMOS INDENTIFICAR EM QUE QUADRANTE ESTÁ O PONTO PELAS COORDENADAS!");
        System.out.println("DIGITE A POSIÇÃO DE X:");
        double x = sc.nextDouble();
        System.out.println("DIGITE A POSIÇÃO DE Y:");
        double y= sc.nextDouble();

        String interval = "";

        if (x == 0.0 && y == 0.0) {
            interval = "ORIGEM";
        } else if (x == 0.0) {
            System.out.println("O PONTO ESTÁ NO EIXO Y");;
        } else if (y == 0.0) {
            System.out.println("O PONTO ESTÁ NO EIXO X");
        } else if (x > 0.0 && y > 0.0) {
            System.out.println("O PONTO ESTÁ NO QUADRANTE Q1");
        } else if (x < 0.0 && y > 0.0) {
            System.out.println("O PONTO ESTÁ NO QUADRANTE Q2");
        } else if (x < 0.0 && y < 0.0) {
            System.out.println("O PONTO ESTÁ NO QUADRANTE Q3");
        } else {
            System.out.println("O PONTO ESTÁ NO QUADRANTE Q4");
        }
        sc.close();
    }
}
