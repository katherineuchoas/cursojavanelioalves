package Excercises.Salary;

import java.util.Locale;
import java.util.Scanner;

public class Salary {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double salary, workedHours, hourlyWage;

        System.out.println("Vamos realizar o calculo do seu salário. Digite o valor da sua hora trabalhada:");
        hourlyWage = sc.nextDouble();
        System.out.println("Digite quantas horas trabalhou nesse mês:");
        workedHours = sc.nextDouble();

        salary = (workedHours * hourlyWage);
        System.out.println("Seu salário esse mês será de: R$" + salary);
        sc.close();
    }
}
