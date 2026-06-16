package ex38;

import java.util.Scanner;

public class VerificaPrimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt(); // número recebido
        sc.close();

        if (ehPrimo(numero)) {
            System.out.println("É PRIMO");
        } else {
            System.out.println("NÃO É PRIMO");
        }
    }

    // Função que verifica se um número é primo
    public static boolean ehPrimo(int n) {
        if (n <= 1) return false; // 0 e 1 não são primos
        if (n == 2) return true;  // 2 é primo
        if (n % 2 == 0) return false; // múltiplos de 2 não são primos

        // Verifica divisores até a raiz quadrada de n
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
