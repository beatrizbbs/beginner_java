/*
 * Class Desconto
 * @author Beatriz Braga <beaatrizbatista@hotmail.com>
 * @version 1.6.0_65, 2022-06-22
 */

import java.util.Scanner;

class Desconto {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        double preco = input.nextDouble();

        if (preco > 200) {
            preco *= 0.95;
        }

        System.out.printf("%.2f\n", preco);

    }
}