package ex44;

import java.util.Scanner;

public class ex0044 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] valores = new double[5];

        // Entrada
        for (int i = 0; i < 5; i++) {
            valores[i] = sc.nextDouble();
        }

        // Inicializações
        double somaImpares = 0;
        int qtdImpares = 0;
        double maiorPar = Double.NEGATIVE_INFINITY;
        double maior = Double.NEGATIVE_INFINITY;
        double menor = Double.POSITIVE_INFINITY;

        // Processamento
        for (double v : valores) {
            int inteiro = (int) v;

            // Ímpares
            if (inteiro % 2 != 0) {
                somaImpares += v;
                qtdImpares++;
            }

            // Pares
            if (inteiro % 2 == 0 && v > maiorPar) {
                maiorPar = v;
            }

            // Maior e menor
            if (v > maior) maior = v;
            if (v < menor) menor = v;
        }

        // Média dos ímpares
        double mediaImpares = (qtdImpares > 0) ? somaImpares / qtdImpares : 0;

        // Diferença
        double diferenca = maior - menor;

        // Saída
        System.out.printf("Média dos Ímpares = %.0f\n", mediaImpares);
        System.out.printf("Maior número PAR = %.0f\n", maiorPar);
        System.out.printf("Diferença = %.0f\n", diferenca);

        sc.close();
    }
}
