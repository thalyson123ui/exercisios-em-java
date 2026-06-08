package ex20;

import java.util.Scanner;

public class Eletroshock {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Digite o código do bairro (S/I/T): ");
            char bairro = sc.next().toUpperCase().charAt(0);

            System.out.print("Digite a renda da família: ");
            double renda = sc.nextDouble();

            System.out.print("Digite o consumo em reais: ");
            double consumo = sc.nextDouble();

            // Validações iniciais
            if (renda < 0 || consumo < 0) {
                System.out.println("Erro: renda ou consumo não podem ser negativos.");
                return;
            }

            double desconto = 0;

            switch (bairro) {
                case 'S': // Santa Ana
                    if (renda >= 50 && renda <= 500) {
                        desconto = 50;
                    } else if (renda > 500 && renda <= 1000) {
                        desconto = 25;
                    }
                    break;

                case 'I': // Industriários
                    if (renda >= 240 && renda <= 1000) {
                        desconto = 240;
                    } else if (renda > 1000 && renda <= 5000) {
                        desconto = 120;
                    }
                    break;

                case 'T': // Tabatinga
                    // Aqui você adiciona as regras específicas se tiver a tabela completa
                    break;

                default:
                    System.out.println("Erro: bairro inválido.");
                    return;
            }

            double valorFinal = consumo - desconto;
            if (desconto > 0) {
                System.out.println("Desconto aplicado: R$ " + desconto);
            } else {
                System.out.println("Sem desconto para esta faixa de renda.");
            }
            System.out.println("Valor final da conta: R$ " + valorFinal);
        }
    }
}
