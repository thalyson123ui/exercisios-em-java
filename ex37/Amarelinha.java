package ex37;

import java.util.Scanner;

public class Amarelinha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leitura dos dados do jogador 1
        String nome1 = sc.next();
        String escolha1 = sc.next(); // "PAR" ou "ÍMPAR"
        int numero1 = sc.nextInt();

        // Leitura dos dados do jogador 2
        String nome2 = sc.next();
        String escolha2 = sc.next(); // "PAR" ou "ÍMPAR"
        int numero2 = sc.nextInt();

        sc.close();

        // Soma dos números
        int soma = numero1 + numero2;

        // Verifica se a soma é par ou ímpar
        boolean somaPar = (soma % 2 == 0);

        // Determina o vencedor
        if (somaPar) {
            if (escolha1.equalsIgnoreCase("PAR")) {
                System.out.println(nome1.toUpperCase());
            } else if (escolha2.equalsIgnoreCase("PAR")) {
                System.out.println(nome2.toUpperCase());
            }
        } else {
            if (escolha1.equalsIgnoreCase("ÍMPAR")) {
                System.out.println(nome1.toUpperCase());
            } else if (escolha2.equalsIgnoreCase("ÍMPAR")) {
                System.out.println(nome2.toUpperCase());
            }
        }
    }
}
