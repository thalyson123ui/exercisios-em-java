package ex4;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner letra = new Scanner(System.in); 
      int a, b, c, maior, menor;
       
       System.out.println("Informe um número para letra a: ");
       a = letra.nextInt(); 
       
       System.out.println("Informe um número para letra b: ");
       b = letra.nextInt();
       
       System.out.println("Informe um número para letra c: ");
       c = letra.nextInt();
       
       maior = a; 
       
       if (b > a && b > c) {
          
          maior = b; 
          
       } else if(c > a && c > b) {
          
          maior = c;
       }
       
       menor = a; 
       
 
       if (b < a && b < c) {
          
          menor = b; 
          
       } else if(c < a && c < b) {
          
          menor = c;
       }
       
       System.out.println("Maior número: " + maior);
       System.out.println("Menor número: " + menor);
         letra.close();
    }
}
