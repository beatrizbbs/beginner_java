/*
 * Class AnimaisCedulas
 * @author Beatriz Braga <beaatrizbatista@hotmail.com>
 * @version 1.6.0_65, 2022-06-22
 */

import java.util.Scanner;

class AnimaisCedulas {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int valor = input.nextInt();
        String animal = "";

        if (valor == 2) {
            animal = "Tartaruga";
        }
        else if (valor == 5) {
            animal = "Garça";
        }
        else if (valor == 10) {
            animal = "Arara";
        }
        else if (valor == 20) {
            animal = "Mico-leão-dourado";
        }
        else if (valor == 50) {
            animal = "Onça-pintada";
        }
        else if (valor == 100) {
            animal = "Garoupa";
        }
        else {
            animal = "erro";
        }

        System.out.println(animal);
    }
}