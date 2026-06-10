package ex24;

import java.util.Scanner;

public class ex0024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira um número inteiro de 5 algarismos: ");
        int numero = sc.nextInt();
        sc.close();

        String numStr = Integer.toString(Math.abs(numero));

        if (numStr.length() != 5) {
            System.out.println("Por favor, insira um número inteiro de 5 algorismos.");
            return;
        }

        String numInvertido = new StringBuilder(numStr).reverse().toString();
        System.out.println("Número invertido: " + numInvertido);

        if (numStr.equals(numInvertido)) {
            System.out.println("O número é um palíndromo.");
        } else {
            System.out.println("O número não é um palíndromo.");
        }
    }
}
