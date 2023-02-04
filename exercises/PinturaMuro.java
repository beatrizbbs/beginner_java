/*
 * Class PinturaMuro
 * @author Beatriz Braga <beaatrizbatista@hotmail.com>
 * @version 1.6.0_65, 2022-06-22
 */

import java.util.Scanner;

class PinturaMuro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pintor = input.nextDouble();

        double preco = (36 * pintor) + 100;
        System.out.printf("%.1f\n", preco);
    }
}