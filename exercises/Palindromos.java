/*
 * Class Palindromos
 * @author Beatriz Braga <beaatrizbatista@hotmail.com>
 * @version 1.6.0_65, 2022-06-22
 */

import java.util.Scanner;

class Palindromos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String linha = input.nextLine();

        linha = linha.replace(" ", "");
        linha = linha.toUpperCase();
        int igual = 0;

        int index = 0;
        while (index < (linha.length()/2) && (linha.charAt(index) == linha.charAt(linha.length() - 1 - index))) {
            index++;
            if (index == (linha.length()/2)) {
                igual = 1;
            }
        }

        System.out.printf("%s %d\n", linha, igual);

    }
}
