/*
 * Class SomaColecoes
 * @author Beatriz Braga <beaatrizbatista@hotmail.com>
 * @version 1.6.0_65, 2022-06-22
 */

import java.util.Scanner;

class SomaColecoes {
    public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    int elemento = input.nextInt();
    int soma;

    // identificar final do programan
    while (elemento != -1) {

        // reiniciar a variavel
        soma = 0;

        // colecao
        while (elemento != -1) {
            soma += elemento;

            elemento = input.nextInt();
        }

        System.out.printf("%d\n", soma);

        elemento = input.nextInt();
    }


    }
}