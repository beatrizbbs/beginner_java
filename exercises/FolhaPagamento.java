/*
 * Class FolhaPagamento
 * @author Beatriz Braga <beaatrizbatista@hotmail.com>
 * @version 1.6.0_65, 2022-06-22
 */

import java.util.Scanner;

class FolhaPagamento {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double valor_hora = input.nextDouble();
        int quant_hora = input.nextInt();

        // salario bruto
        double bruto = valor_hora * quant_hora;
        System.out.printf("Salario bruto: R$%.2f\n", bruto);

        // imposto de renda
        double IR = (bruto * 11) / 100;
        System.out.printf("IR: R$%.2f\n", IR);

        // INSS
        double INSS = (bruto * 8) / 100;
        System.out.printf("INSS: R$%.2f\n", INSS);

        // descontos
        double descontos = IR + INSS;
        System.out.printf("Total de descontos: R$%.2f\n", descontos);

        // salario liquido
        double liquido = bruto - descontos;
        System.out.printf("Salario liquido: R$%.2f\n", liquido);

    }
}