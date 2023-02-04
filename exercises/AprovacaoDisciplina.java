/*
 * Class AprovacaoDisciplina
 * @author Beatriz Braga <beaatrizbatista@hotmail.com>
 * @version 1.6.0_65, 2022-06-22
 */

import java.util.Scanner;

class AprovacaoDisciplina {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        double[] notas = new double[100];
        double nota = input.nextDouble();
        int quant_alunos = 0;

        while (nota != -1) {
            notas[quant_alunos] = nota;
            quant_alunos++;
            nota = input.nextDouble();
        }

        int[] frequencias = new int[quant_alunos];
        int frequencia;

        for (int i = 0; i < quant_alunos; i++) {
            frequencia = input.nextInt();
            frequencias[i] = frequencia;
        }
        frequencia = input.nextInt();
        frequencia = input.nextInt();

        int quant_aprovados = 0, quant_rep_nota = 0, quant_rep_freq = 0;

        for (int i = 0; i < quant_alunos; i++) {
            if ((frequencias[i] / (double) frequencia) < 0.75) {
                quant_rep_freq++;
            }
            else if (notas[i] < 5) {
                quant_rep_nota++;
            }
            else {
                quant_aprovados++;
            }
        }

        System.out.printf("%d %d %d\n", quant_aprovados, quant_rep_nota, quant_rep_freq);
        
    }
}