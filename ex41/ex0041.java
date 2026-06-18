package ex41;

import java.util.Scanner;

public class ex0041 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada: altura e peso
        double altura = scanner.nextDouble();
        double peso = scanner.nextDouble();

        double pesoIdeal;

        // Definição do peso ideal conforme a altura
        if (altura <= 1.50) {
            pesoIdeal = 50.0;
        } else if (altura <= 1.90) {
            pesoIdeal = 70.0;
        } else {
            pesoIdeal = 100.0;
        }

        // Comparação com o peso informado
        if (peso == pesoIdeal) {
            System.out.println("Parabéns peso ideal!");
        } else if (peso < pesoIdeal) {
            double diferenca = pesoIdeal - peso;
            System.out.printf("Engorde %.0f kg%n", diferenca);
        } else {
            double diferenca = peso - pesoIdeal;
            System.out.printf("Emagreça %.0f kg%n", diferenca);
        }

        scanner.close();
    }
}
