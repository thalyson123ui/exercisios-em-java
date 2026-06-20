package ex46;

import java.util.Scanner;
import java.math.BigInteger;

public class SomaFatoriais {
    // Função para calcular fatorial usando BigInteger
    public static BigInteger fatorial(int n) {
        BigInteger resultado = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            resultado = resultado.multiply(BigInteger.valueOf(i));
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int M = sc.nextInt();
            int N = sc.nextInt();

            BigInteger soma = fatorial(M).add(fatorial(N));
            System.out.println(soma);
        }

        sc.close();
    }
}
