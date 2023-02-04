/*
 * Class AngryBirds
 * @author Beatriz Braga <beaatrizbatista@hotmail.com>
 * @version 1.6.0_65, 2022-06-22
 */

import java.util.Scanner;

class AngryBirds {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int vo = input.nextInt(),
            angle = input.nextInt();
        double distancia = input.nextDouble();

        double gravity = 9.8;
        double radians = Math.toRadians(angle);

        double R = ((Math.pow(vo, 2) * Math.sin(2*radians))/gravity);

        if ((R <= (distancia + 0.1)) && (R >= (distancia - 0.1))) {
            System.out.println("1");
        }
        else {
            System.out.println("0");
        }

    }
}