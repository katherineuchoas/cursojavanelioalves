package Excercises.Interval;

import java.util.Locale;
import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("VAMOS INDENTIFICAR O INTERVALO DO NÚMERO DESEJADO!");
        System.out.println("DIGITE O NÚMERO:");
        double number = sc.nextDouble();

        String interval = "";

        if (number >= 0.25 && number <= 25.00) {
            interval = "Intervalo (0.25]";
        } else if (number >= 25.01 && number <= 50.00) {
            interval = "Intervalo (25.50]";
        } else if (number >= 50.01 && number <= 75.00) {
            interval = "Intervalo (50.75]";
        } else if (number >= 75.01 && number <= 100.00) {
            interval = "Intervalo (75.100]";
        } else {
            System.out.println("FORA DO INTERVALO.");
            sc.close();
            return;
        }
        System.out.println(interval);
        sc.close();
    }
}
