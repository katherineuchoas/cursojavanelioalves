package Excercises.ConditionalStructure.Quadrant;

import java.util.Locale;
import java.util.Scanner;

/*
Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
Se o ponto estiver na origem, escreva a mensagem “Origem”.
Se o ponto estiver
            |Y
        Q2  |   Q1
      ______|______X
        Q3  |   Q4
            |
*/

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
