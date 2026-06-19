package ex42;

import java.util.Scanner;

public class ex0042 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada
        double A = sc.nextDouble(); // valor antigo
        double B = sc.nextDouble(); // valor novo

        // Cálculo da porcentagem
        double aumento = ((B - A) / A) * 100;

        // Saída formatada com duas casas decimais
        System.out.printf("%.2f%%\n", aumento);

        sc.close();
    }
}
