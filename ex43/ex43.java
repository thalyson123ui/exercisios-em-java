package ex43;

import java.util.Scanner;

public class ex43 {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // valor da compra
        int M = sc.nextInt(); // valor pago

        int troco = M - N;

        int[] notas = {2, 5, 10, 20, 50, 100};
        boolean possivel = false;

        // Testa todas as combinações de duas notas
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas.length; j++) {
                if (notas[i] + notas[j] == troco) {
                    possivel = true;
                    break;
                }
            }
            if (possivel) break;
        }

        if (possivel) {
            System.out.println("possível");
        } else {
            System.out.println("impossível");
        }

        sc.close();
    }
}
