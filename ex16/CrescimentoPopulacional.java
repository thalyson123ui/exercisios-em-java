package ex16;

import java.util.Scanner;

public class CrescimentoPopulacional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double POPA = sc.nextDouble(); // população país A
        double POPB = sc.nextDouble(); // população país B

        int anos = 0;

        // condição: POPB > POPA
        while (POPA < POPB) {
            POPA *= 1.03;   // crescimento de 3% ao ano
            POPB *= 1.015;  // crescimento de 1,5% ao ano
            anos++;
        }

        System.out.println(anos + " anos");
        sc.close();
    }
}
