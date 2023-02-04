/*
 * Class OperacoesString
 * @author Beatriz Braga <beaatrizbatista@hotmail.com>
 * @version 1.6.0_65, 2022-06-22
 */

import java.util.Scanner;

class OperacoesString {

    static boolean even(int number) {
        return ((number % 2) == 0);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String linha = input.nextLine();

        // quantidade de caracteres
        System.out.println(linha.length());

        // primeiro caractere
        System.out.println(linha.charAt(0));

        // ultimo caractere
        System.out.println(linha.charAt(linha.length() - 1));

        // maiusculo
        System.out.println(linha.toUpperCase());

        // minusculo
        System.out.println(linha.toLowerCase());

        // "a" por "e"
        System.out.println(linha.replace("a", "e"));

        // indices pares
        for (int i = 0; i < linha.length(); i++) {
            if (even(i)) {
                System.out.printf("%c", linha.charAt(i));
            }
        }
        System.out.printf("\n");

        // Quantidade de vogais
        int quant_vogal = 0;
        for (int i = 0; i < linha.length(); i++) {
            if ((linha.charAt(i) == 'a') || 
            (linha.charAt(i) == 'e') || 
            (linha.charAt(i) == 'i') ||
            (linha.charAt(i) == 'o') ||
            (linha.charAt(i) == 'u')) {
                quant_vogal++;
            }
            else if ((linha.charAt(i) == 'A') || 
            (linha.charAt(i) == 'E') || 
            (linha.charAt(i) == 'I') ||
            (linha.charAt(i) == 'O') ||
            (linha.charAt(i) == 'U')) {
                quant_vogal++;
            }
        }
        System.out.println(quant_vogal);
    }
}