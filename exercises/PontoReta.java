/*
 * Class PontoReta
 * @author Beatriz Braga <beaatrizbatista@hotmail.com>
 * @version 1.6.0_65, 2022-06-22
 */

import java.util.Scanner;

class PontoReta {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        double x = input.nextDouble(),
        y = input.nextDouble();

        if (((2 * x) + y) == 3) {
            System.out.printf("Ponto (%.1f, %.1f) pertence a reta 2x + y = 3.\n", x, y);
        }
        else {
            System.out.printf("Ponto (%.1f, %.1f) nao pertence a reta 2x + y = 3.\n", x, y);
        }

    }
}