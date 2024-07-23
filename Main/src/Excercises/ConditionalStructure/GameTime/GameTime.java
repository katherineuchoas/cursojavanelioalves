package Excercises.ConditionalStructure.GameTime;

import java.util.Locale;
import java.util.Scanner;

/*
Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
*/

public class GameTime {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("HÁ QUANTO TEMPO ESTOU JOGANDO?");
        System.out.println("O CÁLCULO OBSERVARÁ O TEMPO MÍNIMO DE 1 HORA E MÁXIMO DE 24 HORAS");
        System.out.println("Digite a hora em que começou a jogar:");
        int startTime =sc.nextInt();
        System.out.println("Digite a hora que parou de jogar:");
        int finishTime =sc.nextInt();
        int gameHours;

        if (startTime < finishTime){
            gameHours = finishTime - startTime;
        }
        else {
            gameHours = 24 - startTime + finishTime;
        }
        System.out.println("Você jogou por " + gameHours + " horas");
        sc.close();
    }
}
