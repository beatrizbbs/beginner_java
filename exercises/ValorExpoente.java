/*
 * Class ValorExpoente
 * @author Beatriz Braga <beaatrizbatista@hotmail.com>
 * @version 1.6.0_65, 2022-06-22
 */

import java.util.Scanner;

class ValorExpoente {
    static int potencia_2 (int n) {
        if (n == 0) {
            return 1;
        }
        else {
            return (2 * (potencia_2(n - 1)));
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int soma = 2, expoente = 1;

        while (number >= soma) {
            expoente++;
            soma += potencia_2(expoente);
        }

        System.out.println(expoente);

    }
}