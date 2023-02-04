/*
 * Class DiaSemana
 * @author Beatriz Braga <beaatrizbatista@hotmail.com>
 * @version 1.6.0_65, 2022-06-22
 */

import java.util.Scanner;

class DiaSemana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] horas = {0, 0, 0, 0, 0, 0, 0};
        int hora = input.nextInt();

        do {
            for (int i = 0; i < 7; i++) {
                horas[i] += hora;
                hora = input.nextInt();
            }
        }
        while (hora != -1);

        int maior_hora = horas[0];

        for (int i = 1; i < 7; i++) {
            if (maior_hora < horas[i]) {
                maior_hora = horas[i];
            }
        }

        for (int i = 0; i < 7; i++) {
            if (horas[i] == maior_hora) {
                System.out.println((i + 1));
            }
        }

    }
}