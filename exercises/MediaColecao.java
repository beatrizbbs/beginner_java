/*
 * Class MediaColecao
 * @author Beatriz Braga <beaatrizbatista@hotmail.com>
 * @version 1.6.0_65, 2022-06-22
 */

import java.util.Scanner;

class MediaColecao {
    public static void main(String[] args) {
        float acumulador = 0;
        int quantidade = 0;

        Scanner input = new Scanner(System.in);
        double number = input.nextDouble();
        while (number != -1.00f) {
            acumulador += number;
            ++quantidade;
            number = input.nextDouble();
        }

        double media = acumulador / quantidade;

        System.out.printf("%.2f\n", media);
    }
}