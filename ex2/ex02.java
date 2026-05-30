package ex2;
import java.util.Scanner;
public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //leitura dos números
        int numerofuncionario = sc.nextInt();
        int horastrabalhadas = sc.nextInt();
        double valorporhora = sc.nextDouble();

        //cálculo do salário
        double salario = horastrabalhadas * valorporhora;

        //exibição do resultado
        System.out.printf("NUMBER = %d%n", numerofuncionario);
        System.out.printf("SALARY = U$ %.2f%n", salario);

        sc.close();
    }
}
