package ex15;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int a = 0, b = 1;

        for (int i = 1; i <= N; i++) {
            System.out.print(a);
            if (i < N) {
                System.out.print(" ");
            }
            int proximo = a + b;
            a = b;
            b = proximo;
        }

        sc.close();
    }
}
