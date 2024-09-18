package Classes.POO;

import Classes.POO.ExerciceWithPOO.entities.Triangle;

import java.util.Scanner;

public class ExerciseWithPoo {
    public static void main(String[] args) {

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        Scanner sc = new Scanner(System.in);

        System.out.println("Para calcular e dizer qual triangulo possui a maior área, precisamos que informe o tamanho de cada lado do triangulo.");
        System.out.println("Digite a medida do lado A do triangulo X:");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Agora vamos as medidas do triangulo Y.");
        System.out.println("Digite a medida do lado A do triangulo Y:");
        y.a = sc.nextDouble();
        System.out.println("Digite a medida do lado B do triangulo Y:");
        y.b = sc.nextDouble();
        System.out.println("Digite a medida do lado C do triangulo Y:");
        y.c = sc.nextDouble();

        double p = (x.a + x.b + x.c) / 2;

        double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));
        double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));

        if (areaX > areaY){

            System.out.println("O triangulo X poussui a maior área " + areaX);
        } else{
            System.out.println("O triangulo Y poussui a maior área " + areaY);
        }

        sc.close();

    }

}
