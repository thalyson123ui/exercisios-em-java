import java.util.Scanner;

public class ex0030 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lê 3 pares de valores M e N
        for (int i = 0; i < 3; i++) {
            int M = sc.nextInt();
            int N = sc.nextInt();

            int menor = Math.min(M, N);
            int maior = Math.max(M, N);

            int soma = 0;

            // Imprime a sequência do menor até o maior
            for (int j = menor; j <= maior; j++) {
                System.out.print(j + " ");
                soma += j;
            }

            // Imprime a soma
            System.out.println("Soma = " + soma);
        }

        sc.close();
    }
}
