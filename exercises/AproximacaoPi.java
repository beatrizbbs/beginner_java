/*
 * Class AproximacaoPi
 * @author Beatriz Braga <beaatrizbatista@hotmail.com>
 * @version 1.6.0_65, 2022-06-22
 */

import java.util.Scanner;

class AproximacaoPi {
    public static void main (String[] args) {
    Scanner input = new Scanner(System.in);

    double aproximacao = input.nextDouble();
    double pi = 0;

    for (double i = 0; i < aproximacao; i++) {
        if (i == 0) {
            pi += 3;
        }
        else if (i % 2 == 1) {
            pi += (4/(((i * 2) * ((i * 2) + 1) * ((i * 2) + 2))));
        }
        else if (i % 2 == 0) {
            pi -= (4/(((i * 2) * ((i * 2) + 1) * ((i * 2) + 2))));
        }

        System.out.printf("%.6f\n", pi);
    }

    }
}