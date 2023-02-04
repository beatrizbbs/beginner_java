/*
 * Class RaizDois
 * @author Beatriz Braga <beaatrizbatista@hotmail.com>
 * @version 1.6.0_65, 2022-06-22
 */

import java.util.Scanner;

class RaizDois {

    static double raiz (int semente) {
        double x;
        if (semente == 0) {
            x = 1;
        }
        else {
            x = 1.0/(2 + (raiz(semente -1)));
            System.out.printf("%.14f\n", (x+1));
        }
        return x;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        raiz(number);
    }
}