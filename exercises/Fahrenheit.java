/*
 * Class Fahrenheit
 * @author Beatriz Braga <beaatrizbatista@hotmail.com>
 * @version 1.6.0_65, 2022-06-22
 */

import java.util.Scanner;

class Fahrenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double celcius = input.nextDouble();

        double fahrenheit = ((9 * celcius)/5) + 32.0;
        System.out.printf("%.1f\n", fahrenheit);
    }
}