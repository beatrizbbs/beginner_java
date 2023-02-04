/*
 * Class VolumeCombustivel
 * @author Beatriz Braga <beaatrizbatista@hotmail.com>
 * @version 1.6.0_65, 2022-06-22
 */

import java.util.Scanner;

class VolumeCombustivel {
    public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    double altura = input.nextDouble(),
        nivel = input.nextDouble(),
        raio = input.nextDouble(),

        volume = 0;
    
    double pi = Math.PI;
    
    if ((altura < 0) || (nivel < 0) || (raio < 0)) {
        System.out.println("-1.000");
        return;
    }

    if (nivel <= raio) {
        volume = (pi/3) * Math.pow(nivel, 2) * ((3 * raio) - nivel);
    }
    else if (nivel <= (altura - raio)) {
        volume += (((4/3.0) * pi * Math.pow(raio, 3))/ 2);
        nivel -= raio;
        volume += (pi * Math.pow(raio, 2) * nivel);
    }
    else {
        double altura_cilindro = altura - (2 * raio);
        volume += (pi * Math.pow(raio, 2) * altura_cilindro);
        altura -= altura_cilindro;

        volume += ((pi/3) * Math.pow(altura,2) * ((3 * raio) - altura));
    }

    System.out.printf("%.3f\n", volume);

    }
}