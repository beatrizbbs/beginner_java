/*
 * Class DistanciaAviao
 * @author Beatriz Braga <beaatrizbatista@hotmail.com>
 * @version 1.6.0_65, 2022-06-22
 */

import java.util.Scanner;

class DistanciaAviao {
    public static int[][] trechos = 
    {{0,2,11,6,15,11,1},
    {2,0,7,12,4,2,15},
    {11,7,0,11,8,3,13},
    {6,12,11,0,10,2,1},
    {15,4,8,10,0,5,13},
    {11,2,3,2,5,0,14},
    {1,15,13,1,13,14,0}};

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int voo = input.nextInt();
        int partida = (voo/111) - 1;
        int destino;
        int tempo = 0;

        while (voo != -1) {
            destino = (voo/111) - 1;

            tempo += trechos[partida][destino];

            partida = destino;
            voo = input.nextInt();
        }
        
        System.out.println(tempo);

    }
}