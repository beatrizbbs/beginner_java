/*
 * Class ParImpar
 * @author Beatriz Braga <beaatrizbatista@hotmail.com>
 * @version 1.6.0_65, 2022-06-22
 */

import java.util.Scanner;

class ParImpar {

    static boolean even(int number) {
        return ((number % 2) == 0);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        while (number != -1) {
            if (even(number)) {
                System.out.println("PAR");
            }
            else {
                System.out.println("IMPAR");
            }

            number = input.nextInt();
        }
    }
}

else if (number > 10) {
                    number -= 10;
                    ++notas_10;
                }
                else if (number > 2) {
                    number -= 2;
                    ++notas_2;
                }