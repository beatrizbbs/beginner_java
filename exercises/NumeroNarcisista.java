/*
 * Class NumeroNarcisista
 * @author Beatriz Braga <beaatrizbatista@hotmail.com>
 * @version 1.6.0_65, 2022-06-22
 */

import java.util.Scanner;

class NumeroNarcisista {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int original = number;

        int[] algorismos = new int[10];
        int quant = 0;

        while (number != 0) {
            algorismos[quant] = number % 10;
            quant++;
            number = number / 10;
        }

        int n = 0;

        for (int i = 0; i < quant; i++) {
            n += Math.pow(algorismos[i], quant);
        }

        if (n == original) {
            System.out.println("SIM");
        }
        else {
            System.out.println("NAO");
        }

        }
    }