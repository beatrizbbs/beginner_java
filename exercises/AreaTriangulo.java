/*
 * Class AreaTriangle
 * @author Beatriz Braga <beaatrizbatista@hotmail.com>
 * @version 1.6.0_65, 2022-06-22
 */

import java.util.Scanner;

class AreaTriangle {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt(),
        b = input.nextInt(),
        c = input.nextInt();

        double s = (a + b + c) / 2.0;

        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        
        if (area > 0) {
            System.out.printf("%.2f\n", area);
        }
        else {
            System.out.printf("Triangle invalido\n", area);
        }
    

    }
}