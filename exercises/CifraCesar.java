/*
 * Class CifraCesar
 * @author Beatriz Braga <beaatrizbatista@hotmail.com>
 * @version 1.6.0_65, 2022-06-22
 */

import java.util.Scanner; 

class CifraCesar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int deslocamento = input.nextInt();
        String linha = input.nextLine();

        linha = linha.toLowerCase();
        linha = linha.replaceFirst(" ", "");

        for (int i = 0; i < 26; i++) {
            char letter = (char) (i + 'a');
            char replace = (char) (((i + deslocamento) % 26) + 'A');
            linha = linha.replace(letter, replace);
        }

        System.out.printf("%s\n", linha);

    }
}