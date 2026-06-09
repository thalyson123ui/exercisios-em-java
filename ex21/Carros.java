package ex21;

import java.util.Scanner;

public class Carros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] anos = new int[3];
        double[] velocidades = new double[3];

        // Leitura dos dados dos três carros
        for (int i = 0; i < 3; i++) {
            System.out.print("Digite o ano do carro: ");
            anos[i] = sc.nextInt();
            System.out.print("Digite a velocidade do carro: ");
            velocidades[i] = sc.nextDouble();
        }

        // Processamento
        int anoMaisNovo = anos[0];
        double velocidadeMaisRapida = velocidades[0];
        double somaVelocidades = 0;

        for (int i = 0; i < 3; i++) {
            if (anos[i] > anoMaisNovo) {
                anoMaisNovo = anos[i];
            }
            if (velocidades[i] > velocidadeMaisRapida) {
                velocidadeMaisRapida = velocidades[i];
            }
            somaVelocidades += velocidades[i];
        }

        double velocidadeMedia = somaVelocidades / 3;

        // Saída
        System.out.println("Ano do carro mais novo = " + anoMaisNovo);
        System.out.printf("Velocidade do mais rápido = %.2f%n", velocidadeMaisRapida);
        System.out.printf("Velocidade média = %.2f%n", velocidadeMedia);

        sc.close();
    }
}
