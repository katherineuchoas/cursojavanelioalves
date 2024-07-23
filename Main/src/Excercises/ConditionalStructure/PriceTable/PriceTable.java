package Excercises.ConditionalStructure.PriceTable;

import java.util.Locale;
import java.util.Scanner;

/*
Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar.
 * CÓDIGO - ESPECIFICAÇÃO       -  PREÇO
 * 1      - CACHORRO QUENTE      - R$ 4.00
 * 2      - X-SALADA             - R$ 4.50
 * 3      - X-BACON              - R$ 5.00
 * 4      - TORRADA SIMPLES      - R$ 2.00
 * 5      - REFRIGERANTE         - R$ 1.50
*/

public class PriceTable {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("VAMOS REGISTRAR SUA COMPRA!");
        System.out.println("DIGITE O CÓDIGO DO ITEM ADQUIRIDO:");
        int codItem = sc.nextInt();
        System.out.println("Digite a quantidade desejada:");
        int quantity = sc.nextInt();
        String item = "";
        double price = 0.0;

        if (codItem == 1) {
            item = "Cachorro Quente";
            price = quantity * 4.00;
        } else if (codItem == 2) {
            item = "X-Salada";
            price = quantity * 4.50;
        } else if (codItem == 3) {
            item = "X-Bacon";
            price = quantity * 5.00;
        } else if (codItem == 4) {
            item = "Torrada Simples";
            price = quantity * 2.00;
        } else if (codItem == 5) {
            item = "Refrigerante";
            price = quantity * 2.00;
        } else {
            System.out.println("Código de item inválido.");
            sc.close();
            return;
        }

        System.out.println("Você comprou " + item + ". E o valor total do seu pedido é de R$ " + price+"0");
        sc.close();
    }
}
