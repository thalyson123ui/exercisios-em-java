package ex50;

import java.util.Scanner;

public class ElevadorChines {
    
    // Função que verifica se um número é válido (não contém '4' nem "13")
    public static boolean valido(long num) {
        String s = String.valueOf(num);
        return !s.contains("4") && !s.contains("13");
    }

    // Função que encontra o N-ésimo andar válido
    public static long encontrarAndar(long N) {
        long count = 0;
        long num = 0;
        while (true) {
            num++;
            if (valido(num)) {
                count++;
                if (count == N) {
                    return num;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLong()) {
            long N = sc.nextLong();
            long resultado = encontrarAndar(N);
            System.out.println(resultado);
        }

        sc.close();
    }
}
