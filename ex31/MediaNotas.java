package ex31;

import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int notasValidas = 0;
        double soma = 0.0;

        // Continua lendo até obter duas notas válidas
        while (notasValidas < 2) {
            double nota = sc.nextDouble();

            if (nota < 0.0 || nota > 10.0) {
                System.out.println("NOTA INVÁLIDA");
            } else {
                soma += nota;
                notasValidas++;
            }
        }

        double media = soma / 2.0;
        System.out.printf("MÉDIA = %.2f%n", media);

        sc.close();
    }
}
