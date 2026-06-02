package ex6;

import java.util.Scanner;

public class ex006 {
    public static void main(String[] args) {
        int x_distancia; 
       double x_combustivel;
       
       double total;
       
       try (Scanner numero = new Scanner(System.in)) {
           System.out.println("Informe a distância percorrida"); 
           x_distancia = numero.nextInt(); 
           
           System.out.println("Informe o combustível gasto ?");
           x_combustivel = numero.nextDouble(); 
       }
       
       total = x_distancia / x_combustivel;
       
       System.out.printf("O consumo médio de um automóvel é de: %.2f km/h",  total);
    }
}