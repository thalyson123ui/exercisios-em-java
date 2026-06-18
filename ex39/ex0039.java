package ex39;
import java.util.Scanner;
public class ex0039 {
    public static void  main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada: número inteiro positivo
        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        // Saída: tabuada do número
        System.out.println("Tabuada de " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        scanner.close();
    }
}
