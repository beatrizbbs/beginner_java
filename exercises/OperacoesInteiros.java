/*
 * Class OperacoesInteiros
 * @author Beatriz Braga <beaatrizbatista@hotmail.com>
 * @version 1.6.0_65, 2022-06-22
 */

import java.util.Scanner;

class OperacoesInteiros {

    static boolean even(int number) {
        return ((number % 2) == 0);
    }

    public static void main(String[] args) {

        int geral, pares, impares, soma, maior , menor;

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        while (number != -1) {
            geral = 0; pares = 0; impares = 0; soma = 0; maior = 0; menor = 0;
            while (number != -1) {

                // quantidade de elemtnos
                ++geral;

                // quantos sao pares
                if (even(number)) {
                    ++pares;
                }
                else {
                
                // quantos sao impares
                    ++impares;
                }

                // soma total
                soma += number;

                // maior
                if (geral == 1) {
                    maior = number;
                }
                else if (number > maior){
                    maior = number;
                }

                // menor
                if (geral == 1) {
                    menor = number;
                }
                else if (number < menor){
                    menor = number;
                }

                number = input.nextInt();
            }

            System.out.println(geral);
            System.out.println(pares);
            System.out.println(impares);
            System.out.println(soma);

            // media
            double media = ((double) soma) / geral;
            System.out.printf("%.2f\n", media);

            System.out.println(maior);
            System.out.println(menor);

            number = input.nextInt();
        }
    }
}