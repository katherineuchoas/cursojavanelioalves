package Excercises.Lisarb;

import java.util.Locale;
import java.util.Scanner;

public class Lisarb {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da sua renda mensal:");
        double salary = sc.nextDouble();
        double payment = 0.0;

        if (salary > 0.00 && salary <= 2000.00) {
            payment = 0;
        } else if (salary <= 3000.00) {
            payment = (salary - 2000.00) * 0.08;
        } else if (salary <= 4500.00) {
            payment = (1000.00 * 0.08) + ((salary - 3000.00) * 0.18);
        } else {
            payment = (1000.00 * 0.08) + (1500.00 * 0.18) + ((salary - 4500.00) * 0.28);
        }

        if (payment == 0) {
            System.out.println("Você não tem valores a pagar de impostos!");
        } else {
            System.out.printf("Você pagará R$ %.2f%n de impostos à Lisarb", payment);
        }

        sc.close();
    }
}
