/*
 * Class Media
 * @author Beatriz Braga <beaatrizbatista@hotmail.com>
 * @version 1.6.0_65, 2022-06-22
 */

import java.util.Scanner;

class Media {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();

        double media = (number1 + number2 + number3) / 3;

        System.out.printf("%.2f\n", media);
    }
}