/*
 * Class CaixaEletronico
 * @author Beatriz Braga <beaatrizbatista@hotmail.com>
 * @version 1.6.0_65, 2022-06-22
 */

import java.util.Scanner;

class CaixaEletronico {

    static boolean even(int number) {
        return ((number % 2) == 0);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if ((even(number)) && (number > 0)) {
            int notas_50 = 0;
            int notas_10 = 0;
            int notas_2 = 0;

            while (number > 0) {
                if (number >= 50) {
                    number -= 50;
                    ++notas_50;
                }
                else if (number >= 10) {
                    number -= 10;
                    ++notas_10;
                }
                else if (number >= 2) {
                    number -= 2;
                    ++notas_2;
                }
            }

            System.out.printf("%d notas de R$50, %d notas de R$10 e %d notas de R$2\n", notas_50, notas_10, notas_2);

        }
        else {
            System.out.println("Valor Invalido");
        }

    }
}