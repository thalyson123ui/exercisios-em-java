package ex26;

import java.util.Scanner;

public class ParqueDiversao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada: altura (float) e idade (int)
        float altura = sc.nextFloat();
        int idade = sc.nextInt();
        sc.close();

        int brinquedos = 0;

        // Barca Viking: 1,5m de altura e 12 anos
        if (altura >= 1.5f && idade >= 12) {
            brinquedos++;
        }

        // Elevator of Death: 1,4m de altura e 14 anos
        if (altura >= 1.4f && idade >= 14) {
            brinquedos++;
        }

        // Final Killer: 1,7m de altura OU 16 anos
        if (altura >= 1.7f || idade >= 16) {
            brinquedos++;
        }

        // Saída: número de brinquedos que pode andar
        System.out.println(brinquedos);
    }
}
