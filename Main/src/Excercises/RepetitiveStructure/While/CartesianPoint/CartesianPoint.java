package Excercises.RepetitiveStructure.While.CartesianPoint;

import java.util.Scanner;

/*
Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).
*/

public class CartesianPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("VAMOS COMEÇAR!");
        System.out.println("Informe as coordenadas de X:");
        int x = sc.nextInt();
        System.out.println("Informe as coordenadas de Y:");
        int y = sc.nextInt();

        while (x!= 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("PRIMEIRO QUADRANTE");
            }
            else if (x < 0 && y > 0) {
                System.out.println("SEGUNDO QUADRANTE");
            }
            else if (x < 0 && y < 0) {
                System.out.println("TERCEIRO QUADRANTE");
            }
            else {
                System.out.println("QUARTO QUADRANTE");
            }
            x = sc.nextInt();
            y = sc.nextInt();
        }

    }

}

