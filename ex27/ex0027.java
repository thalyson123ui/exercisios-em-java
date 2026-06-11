package ex27;

import java.util.Scanner;

public class ex0027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double soma = 0;
        int leituras = 4;

        for (int i = 1; i <= leituras; i++) {
            int valor = sc.nextInt();
            soma += valor;

            if (valor < 110) {
                System.out.println(valor + " normal");
            } else if (valor <= 125) {
                System.out.println(valor + " alterada");
            } else {
                System.out.println(valor + " muito alta");
            }
        }

        double media = soma / leituras;
        System.out.printf("media das leituras: %.2f%n", media);

        if (media < 110) {
            System.out.println("normal");
        } else if (media <= 125) {
            System.out.println("alterada");
        } else {
            System.out.println("muito alta");
        }

        sc.close();
    }
}
