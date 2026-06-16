package ex36;

import java.util.Scanner;

public class PapaiNoel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt(); // número sorteado
        sc.close();
        
        // Monta a sequência de "HO"
        for (int i = 1; i <= N; i++) {
            if (i == N) {
                System.out.print("HO!");
            } else {
                System.out.print("HO ");
            }
        }
    }
}
