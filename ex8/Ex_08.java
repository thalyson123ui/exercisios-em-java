package ex8;
 
import java.util.Scanner;
 
public class Ex_08 {
 
    public static void main(String[] args) {
 
       double rh, rm, rc = 0, impr = 0, rl = 0 ; 
       
       try (Scanner sc = new Scanner(System.in)) {
       
           System.out.println("Informe a renda dos homens: ");
           rh = sc.nextDouble(); 
           
           System.out.println("Informe a renda das mulheres: ");
           rm = sc.nextDouble();
           
           rc = rh + rm;
           
           if(rc <= 900) {
              
              System.out.println("Alíquota: isento \n ");
              
              
           } else if (rc > 900.01 && rc <= 1500.01) {
              
              System.out.println("Alíquota: 10% \n ");
              impr = rc * 0.10;
              rl = rc - impr;
              
           } else if (rc > 1500.01 && rc <= 2500.00) {
              
              System.out.println("Alíquota: 15% \n ");
              impr = rc * 0.15;
              rl = rc - impr;
              
           } else if (rc > 2500.00) {
              
              System.out.println("Alíquota: 25% \n ");
              
              impr = rc * 0.25;
              rl = rc - impr;
           }
       }
       
       System.out.printf("Renda Conjunta: %.2f \n", rc);
       System.out.printf("Imposto de renda: %.2f \n", impr);
       System.out.printf("Renda Líquida: %.2f", rl);
    }
}