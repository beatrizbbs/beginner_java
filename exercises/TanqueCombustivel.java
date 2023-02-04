/*
 * Class TanqueCombustivel
 * @author Beatriz Braga <beaatrizbatista@hotmail.com>
 * @version 1.6.0_65, 2022-06-22
 */

import java.util.Scanner;

class TanqueCombustivel {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int raio = input.nextInt(),
            altura = input.nextInt(),
            modo = input.nextInt();

        double pi = Math.PI;

        double calota = (pi/3) * Math.pow(altura, 2) * ((3 * raio) - altura);

        if (modo == 1) {
            System.out.printf("%.4f\n", calota);
        }
        else if (modo == 2) {
            double combustivel = (((4/3.0) * pi * Math.pow(raio, 3)) - calota);
            System.out.printf("%.4f\n", combustivel);
        }
    }
}