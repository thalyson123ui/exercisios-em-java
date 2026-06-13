package ex33;
import java.util.Scanner;
public class ex0033 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int numero = 1;

        for (int i = 0; i < N; i++) {
            System.out.println(numero + " " + (numero + 1) + " " + (numero + 2) + " " + (numero + 3));
            numero += 4;
        }

        sc.close();
    }
}
