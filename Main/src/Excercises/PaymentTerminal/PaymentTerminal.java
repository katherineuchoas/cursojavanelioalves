package Excercises.PaymentTerminal;

import java.util.Locale;
import java.util.Scanner;

public class PaymentTerminal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        long codeFirstItem, codeSecondItem;

        int quantity1, quantity2;

        double price1, price2, totalPrice, firstItem, secondItem;

        System.out.println("Digite o código do seu primeiro item:");
        codeFirstItem = sc.nextLong();

        System.out.println("Digite a quantidade de peças do seu primeiro item:");
        quantity1 = sc.nextInt();

        System.out.println("Digite o valor unitário do seu primeiro item:");
        price1 = sc.nextDouble();

        System.out.println("Digite o código do seu segundo item:");
        codeSecondItem = sc.nextLong();

        System.out.println("Digite a quantidade de peças do seu segundo item:");
        quantity2 = sc.nextInt();

        System.out.println("Digite o valor unitário do seu segundo item:");
        price2 = sc.nextDouble();

        firstItem = price1 * quantity1;

        secondItem = price2 * quantity2;

        totalPrice = firstItem + secondItem;

        System.out.printf("O total do primeiro item é de: R$%.2f%n %nO total do seu segundo item é de: R$%.2f%n %nO total da sua compra é de: R$%.2f%n", firstItem, secondItem, totalPrice);

        sc.close();
    }
}