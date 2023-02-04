/*
 * Class TimeFutebol
 * @author Beatriz Braga <beaatrizbatista@hotmail.com>
 * @version 1.6.0_65, 2022-06-22
 */

import java.util.Scanner;

class TimeFutebol {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int quant_partidas = 0;
        int[] gols_casa = new int[100];
        int gol = input.nextInt();

        while (gol != -1){
            gols_casa[quant_partidas] = gol;
            quant_partidas++;
            gol = input.nextInt();
        }

        int[] gols_contra = new int[quant_partidas];
        for (int i = 0; i < quant_partidas; i++) {
            gol = input.nextInt();
            gols_contra[i] = gol;
        }

        int vitorias = 0, empates = 0, derrotas = 0;

        for (int i = 0; i < quant_partidas; i++) {
            if (gols_casa[i] > gols_contra[i]) {
                vitorias++;
            }
            else if (gols_casa[i] == gols_contra[i]) {
                empates++;
            }
            else {
                derrotas++;
            }
        }

        System.out.printf("%d %d %d\n", vitorias, empates, derrotas);

    }
}