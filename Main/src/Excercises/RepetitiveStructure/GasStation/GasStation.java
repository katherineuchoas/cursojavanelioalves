package Excercises.RepetitiveStructure.GasStation;

import java.util.Scanner;

public class GasStation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("VAMOS COMEÇAR!");
        System.out.println("Informe o combustível escolhido:");
        int fuelAlcohol = 0;
        int fuelGasoline = 0;
        int fuelDiesel = 0;

        int fuel = sc.nextInt();

        while (fuel != 4){
            if (fuel == 1){
                fuelAlcohol += 1;
            } else if (fuel == 2) {
                fuelGasoline += 1;
            } else if (fuel == 3) {
                fuelDiesel += 1;
            } else {
                System.out.println("Código de item inválido.");
                System.out.println("Digite novamente o código do combustível escolhido:");
            }
            fuel = sc.nextInt();
        }

        System.out.println("MUITO OBRIGADO(A) POR SUA COMPRA!");
        System.out.println("Alcool: " + fuelAlcohol);
        System.out.println("Gasolina: " + fuelGasoline);
        System.out.println("Diesel: " + fuelDiesel);

        sc.close();
    }
}
