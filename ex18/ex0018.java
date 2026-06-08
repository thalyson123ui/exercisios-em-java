package ex18;

import java.util.Scanner;

public class ex0018 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String numero = sc.nextLine();
            String invertido = new StringBuilder(numero).reverse().toString();
            int resultado = Integer.parseInt(invertido);
            System.out.println(resultado);
        }
    }
}
