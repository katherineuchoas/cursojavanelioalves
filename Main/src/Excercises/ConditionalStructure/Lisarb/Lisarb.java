package Excercises.ConditionalStructure.Lisarb;

import java.util.Locale;
import java.util.Scanner;

/*
Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem
que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem
qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e
mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.

* RENDA                   |   IMPOSTO DE RENDA
* DE R$ 0.00 A R$ 2000.00 |       ISENTO
* R$ 2000.01 A R$ 3000.00 |         8%
* R$ 3000.01 A R$ 4500.00 |        18%
* ACIMA DE R$ 4500.01     |        28%

Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de
salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é
de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com
duas casas decimais.
*/

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
