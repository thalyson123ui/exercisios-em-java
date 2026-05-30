package ex1;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //leitura das notas
        double A = sc.nextDouble();
        double B = sc.nextDouble();

        //calculo da media ponderada
        double media = (A * 3.5 + B * 7.5) / 11.0;

        //saida formatada com 5 casas decimais
        System.out.printf("MEDIA = %.5f\n", media);

        sc.close();
    }
}
