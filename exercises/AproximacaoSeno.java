/*
 * Class AproximacaoSeno
 * @author Beatriz Braga <beaatrizbatista@hotmail.com>
 * @version 1.6.0_65, 2022-06-22
 */

import java.util.Scanner;

class AproximacaoSeno {
    static double potencia (double number, double n) {
        if (n == 0) {
            return 1;
        }
        else {
            return (number * (potencia(number, n - 1)));
        }
    }

    static double fatorial (double n) {
        if (n == 1) {
            return 1;
        }
        else {
            return (n * fatorial(n - 1));
        }
    }


    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        double degree = input.nextDouble(), aproximacao = input.nextDouble();
        double seno = 0;
        double radians = Math.toRadians(degree);

        for (int i = 0; i < aproximacao; i++) {
            if (i == 0) {
                seno += radians;
            }
            else if ((i % 2) == 1) {
                seno -= ((potencia(radians, ((i * 2) + 1)))/ fatorial((i * 2) +1));
            }
            else {
                seno += ((potencia(radians, ((i * 2) + 1)))/ fatorial((i * 2) +1));
            }
            System.out.printf("%.10f\n", seno);
        }

    }
}