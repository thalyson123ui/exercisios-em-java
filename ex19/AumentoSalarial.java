package ex19;

import java.util.Scanner;

public class AumentoSalarial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Entrada
        double salario = sc.nextDouble();
        double novoSalario;
        
        // Processamento
        if (salario > 500) {
            novoSalario = salario * 1.10; // aumento de 10%
        } else if (salario > 300) {
            novoSalario = salario * 1.07; // aumento de 7%
        } else {
            novoSalario = salario * 1.05; // aumento de 5%
        }
        
        // Saída
        System.out.printf("%.2f%n", novoSalario);
        
        sc.close();
    }
}
