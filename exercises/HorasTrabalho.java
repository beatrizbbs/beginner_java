/*
 * Class HorasTrabalho
 * @author Beatriz Braga <beaatrizbatista@hotmail.com>
 * @version 1.6.0_65, 2022-06-22
 */

import java.util.Scanner;

class HorasTrabalho {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int horas;
        int hora = input.nextInt();

        do {
            horas = 0;

            for (int i = 0; i < 7; i++) {
                horas += hora;
                hora = input.nextInt();
            }

            System.out.println(horas);
        }
        while (hora != -1);

    }
}