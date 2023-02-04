/*
 * Class FaltasTrabalho
 * @author Beatriz Braga <beaatrizbatista@hotmail.com>
 * @version 1.6.0_65, 2022-06-22
 */

import java.util.Scanner; 

class FaltasTrabalho {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int quant_faltas = 0,
            falta = input.nextInt();
        double[] dias_semana = {0, 0, 0, 0, 0, 0};

        while (falta != -1) {
            dias_semana[(falta - 2)]++;
            quant_faltas++;
            falta = input.nextInt();
        }

        for (int i = 0; i < 6; i++){
            dias_semana[i] = (dias_semana[i] / (double) quant_faltas) * 100;
            System.out.printf("%.1f ", dias_semana[i]);
        }

        System.out.printf("\n");
    }
}