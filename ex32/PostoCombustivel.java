package ex32;

import java.util.Scanner;

public class PostoCombustivel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int qtdAlcool = 0;
        int qtdGasolina = 0;
        int qtdDiesel = 0;

        double litrosAlcool = 0.0;
        double litrosGasolina = 0.0;
        double litrosDiesel = 0.0;

        // Lê 5 abastecimentos
        for (int i = 0; i < 5; i++) {
            int tipo = sc.nextInt();
            double litros = sc.nextDouble();

            switch (tipo) {
                case 1: // Álcool
                    qtdAlcool++;
                    litrosAlcool += litros;
                    break;
                case 2: // Gasolina
                    qtdGasolina++;
                    litrosGasolina += litros;
                    break;
                case 3: // Diesel
                    qtdDiesel++;
                    litrosDiesel += litros;
                    break;
                default:
                    System.out.println("Tipo inválido!");
                    i--; // não conta como abastecimento válido
            }
        }

        // Saída conforme exemplo
        System.out.printf("1. Álcool: %d - Qtd Litros: %.0f%n", qtdAlcool, litrosAlcool);
        System.out.printf("2. Gasolina: %d - Qtd Litros: %.0f%n", qtdGasolina, litrosGasolina);
        System.out.printf("3. Diesel: %d - Qtd litros: %.0f%n", qtdDiesel, litrosDiesel);

        sc.close();
    }
}
