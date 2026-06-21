package ex48;

import java.util.Scanner;

public class ex0048 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada
        System.out.print("Digite a idade do paciente: ");
        int idade = sc.nextInt();

        System.out.print("Digite o peso do paciente (kg): ");
        float peso = sc.nextFloat();

        int dosagemMg = 0;

        // Lógica de dosagem
        if (idade >= 12) {
            if (peso >= 60) {
                dosagemMg = 1000;
            } else {
                dosagemMg = 875;
            }
        } else {
            if (peso >= 5 && peso <= 9) {
                dosagemMg = 125;
            } else if (peso > 9 && peso <= 16) {
                dosagemMg = 250;
            } else if (peso > 16 && peso <= 24) {
                dosagemMg = 375;
            } else if (peso > 24 && peso <= 30) {
                dosagemMg = 500;
            } else if (peso > 30) {
                dosagemMg = 750;
            } else {
                System.out.println("Peso inválido para cálculo da dosagem.");
                sc.close();
                return;
            }
        }

        // Conversão da dosagem em gotas
        // 500 mg = 1 ml = 20 gotas
        // Portanto: gotas = (dosagemMg / 500) * 20
        int gotas = (dosagemMg * 20) / 500;

        // Saída
        System.out.println(gotas + " gotas");

        sc.close();
    }
}
