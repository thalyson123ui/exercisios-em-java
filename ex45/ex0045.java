package ex45;

import java.util.Scanner;

public class ex0045 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[5];
        float[] idades = new float[5];

        // Leitura dos dados
        for (int i = 0; i < 5; i++) {
            nomes[i] = sc.next();
            idades[i] = sc.nextFloat();
        }

        // Encontrar maior idade
        float maiorIdade = idades[0];
        for (int i = 1; i < 5; i++) {
            if (idades[i] > maiorIdade) {
                maiorIdade = idades[i];
            }
        }

        // Encontrar pessoa mais nova
        float menorIdade = idades[0];
        String nomeMaisNovo = nomes[0];
        for (int i = 1; i < 5; i++) {
            if (idades[i] < menorIdade) {
                menorIdade = idades[i];
                nomeMaisNovo = nomes[i];
            }
        }

        // Calcular média das idades
        float soma = 0;
        for (int i = 0; i < 5; i++) {
            soma += idades[i];
        }
        float media = soma / 5;

        // Saída
        System.out.println("Maior Idade = " + maiorIdade);
        System.out.println("Nome da pessoa mais nova = " + nomeMaisNovo);
        System.out.printf("Média das idades = %.1f\n", media);

        sc.close();
    }
}
