/*
 * Class DataExtenso
 * @author Beatriz Braga <beaatrizbatista@hotmail.com>
 * @version 1.6.0_65, 2022-06-22
 */

import java.util.Scanner;

class DataExtenso {
    public static String[] meses = 
                                {"janeiro", "fevereiro" , "marco",
                                "abril", "maio", "junho",
                                "julho", "agosto", "setembro",
                                "outubro", "novembro", "dezembro"};

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int data = input.nextInt(),
        ano = (data % 10000),
        mes = (data / 10000) % 100,
        dia = data / 1000000;

        System.out.printf("%d de %s de %d\n", dia, meses[mes - 1], ano);

    }

}