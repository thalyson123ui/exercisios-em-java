package ex3;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //leitura dos dados
        int numerofuncionario = sc.nextInt();
        int horastrabalhadas = sc.nextInt();
        double valorporhora = sc.nextDouble();

        //calculo do salario
        double salario = horastrabalhadas * valorporhora;

        //saida do resultado
        System.out.println("NUMBER = " + numerofuncionario);
        System.out.printf("SALARY = U$ %.2f%n", salario);
        sc.close();
    }
}
