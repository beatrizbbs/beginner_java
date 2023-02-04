/*
 * Class ContaEnergia
 * @author Beatriz Braga <beaatrizbatista@hotmail.com>
 * @version 1.6.0_65, 2022-06-22
 */

import java.util.Scanner;

class ContaEnergia {
    public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    int consumo = input.nextInt();
    char tipo = input.next().charAt(0);

    double preco = 0;

    if (consumo < 0) {
        System.out.println("-1.00");
        return;
    }

    if (tipo == 'R') {
        if (consumo <= 500) {
            preco = 0.40;
        }
        else {
            preco = 0.65;
        }
    }
    else if (tipo == 'I') {
        if (consumo <= 1000) {
            preco = 0.55;
        }
        else {
            preco = 0.60;
        }
    }
    else if (tipo == 'C') {
        if (consumo <= 5000) {
            preco = 0.55;
        }
        else {
            preco = 0.60;
        }
    }
    else {
        System.out.println("-1.00");
        return;
    }

    double calculo = consumo * preco;

    System.out.printf("%.2f\n", calculo);

    }
}