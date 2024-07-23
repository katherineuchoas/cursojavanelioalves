package Excercises.SequenceStructure.Salary;

import java.util.Locale;
import java.util.Scanner;

/*
Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais.
*/

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
