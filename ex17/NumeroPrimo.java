package ex17;

import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // número de casos de teste

        for (int i = 0; i < N; i++) {
            int X = sc.nextInt();
            if (ehPrimo(X)) {
                System.out.println(X + " é primo");
            } else {
                System.out.println(X + " não é primo");
            }
        }

        sc.close();
    }

    // Função para verificar se um número é primo
    public static boolean ehPrimo(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;

        // só precisa verificar até a raiz quadrada de num
        int limite = (int) Math.sqrt(num);
        for (int i = 3; i <= limite; i += 2) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
