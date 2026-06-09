package ex23;

import java.util.Scanner;

public class ex0023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println(x > y ? 1 : 0);
        System.out.println(x == y ? 1 : 0);
        System.out.println(x < y ? 1 : 0);
        System.out.println(x != y ? 1 : 0);
        System.out.println(x >= y ? 1 : 0);
        System.out.println(x <= y ? 1 : 0);

        sc.close();
    }
}
