package ex35;
import java.util.Scanner;
public class ex0035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            if (i == N) {
                System.out.print("HO!");
            } else {
                System.out.print("Ho ");
            }
        }
        sc.close();
    }
}
