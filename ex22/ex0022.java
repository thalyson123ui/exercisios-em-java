package ex22;

import java.util.Scanner;

public class ex0022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada
        int consumo = sc.nextInt();

        // Assinatura básica
        double valor = 7.0;

        if (consumo > 10) {
            int restante = consumo - 10;

            // Faixa 11 a 30 (até 20 m³)
            int faixa1 = Math.min(restante, 20);
            valor += faixa1 * 1.0;
            restante -= faixa1;

            // Faixa 31 a 100 (até 70 m³)
            if (restante > 0) {
                int faixa2 = Math.min(restante, 70);
                valor += faixa2 * 2.0;
                restante -= faixa2;
            }

            // Faixa acima de 100
            if (restante > 0) {
                valor += restante * 5.0;
            }
        }

        // Saída
        System.out.printf("Valor em Reais: %.2f%n", valor);

        sc.close();
    }
}
