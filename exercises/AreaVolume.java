/*
 * Class AreaVolume
 * @author Beatriz Braga <beaatrizbatista@hotmail.com>
 * @version 1.6.0_65, 2022-06-22
 */

import java.util.Scanner;

class AreaVolume {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        double raio = input.nextDouble();

        double pi = Math.PI;

        double circulo = (pi * Math.pow(raio, 2));
        double esfera = ((4/3.0) * pi * Math.pow(raio, 3));


        System.out.printf("Um circulo com raio de %.2f centimetros tem uma area de %.2f centimetros quadrados.\n", raio, circulo);
        System.out.printf("Uma esfera com raio de %.2f centimetros tem um volume de %.2f centimetros cubicos.\n", raio, esfera);
        }
    }