/*
 * Class MediaColecoes
 * @author Beatriz Braga <beaatrizbatista@hotmail.com>
 * @version 1.6.0_65, 2022-06-22
 */

import java.util.Scanner;

class MediaColecoes {
    public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    double elemento = input.nextDouble();
    double soma, quant;

    // identificar final do programan
    while (elemento != -1) {

        // reiniciar as variaveis
        soma = 0;
        quant = 0;

        // colecao
        while (elemento != -1) {
            soma += elemento;
            quant++;

            elemento = input.nextDouble();
        }

        System.out.printf("%.2f\n", (soma/quant));

        elemento = input.nextDouble();
    }


    }
}