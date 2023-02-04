/*
 * Class AsciiArt
 * @author Beatriz Braga <beaatrizbatista@hotmail.com>
 * @version 1.6.0_65, 2022-06-22
 */

import java.util.Scanner;

class AsciiArt {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int index = input.nextInt();


        for (int i = 0; i < index; ++i) {
            for (int j = 0; j < (index * 2); ++j) {
                if ((j <= (index - 1 - i)) || (j >= (index + i))) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }

            System.out.print("\n");
        }

    }

}