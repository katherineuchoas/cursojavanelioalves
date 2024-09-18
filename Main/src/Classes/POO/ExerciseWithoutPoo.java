package Classes.POO;

//Fazer um programa para ler as medidas dos lados de dois triângulos X e Y (suponha medidas
//válidas). Em seguida, mostrar o valor das áreas dos dois triângulos e dizer qual dos dois triângulos
//possui a maior área.
//A fórmula para calcular a área de um triângulo a partir das medidas de seus lados a, b e c é a
//seguinte (fórmula de Heron):
//area √ p( p  a)( p  b)( p  c) 2
//p = a + b + c / 2

import java.util.Scanner;

public class ExerciseWithoutPoo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Para calcular e dizer qual triangulo possui a maior área, precisamos que informe o tamanho de cada lado do triangulo.");
        System.out.println("Digite a medida do lado A do triangulo X:");
        double xa = sc.nextDouble();
        System.out.println("Digite a medida do lado B do triangulo X:");
        double xb = sc.nextDouble();
        System.out.println("Digite a medida do lado C do triangulo X:");
        double xc = sc.nextDouble();
        System.out.println("Agora vamos as medidas do triangulo Y.");
        System.out.println("Digite a medida do lado A do triangulo Y:");
        double ya = sc.nextDouble();
        System.out.println("Digite a medida do lado B do triangulo Y:");
        double yb = sc.nextDouble();
        System.out.println("Digite a medida do lado C do triangulo Y:");
        double yc = sc.nextDouble();

        double p = (xa + xb + xc) / 2;

        double areax = Math.sqrt(p * (p - xa) * (p - xb) * (p - xc));

        p = (ya + yb + yc) / 2;

        double areay = Math.sqrt(p * (p - ya) * (p - yb) * (p - yc));

        if (areax > areay){

            System.out.println("O triangulo X poussui a maior área " + areax);
        } else{
            System.out.println("O triangulo Y poussui a maior área " + areay);
        }

        sc.close();

    }

}
