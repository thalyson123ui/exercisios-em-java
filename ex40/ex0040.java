package ex40;

import java.util.Scanner;

public class ex0040 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada: três valores inteiros
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        // Verificação da condição de existência do triângulo
        if (a < b + c && b < a + c && c < a + b) {
            // Identificação do tipo de triângulo
            if (a == b && b == c) {
                System.out.println("EQUILÁTERO");
            } else if (a == b || b == c || a == c) {
                System.out.println("ISÓSCELES");
            } else {
                System.out.println("ESCALENO");
            }
        } else {
            System.out.println("VALORES NÃO FORMAM UM TRIÂNGULO");
        }

        scanner.close();
    }
}
