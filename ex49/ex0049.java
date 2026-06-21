package ex49;

import java.util.Scanner;

public class ex0049 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada
        System.out.print("Digite o peso (kg): ");
        float peso = sc.nextFloat();

        System.out.print("Digite a altura (m): ");
        float altura = sc.nextFloat();

        // Cálculo do IMC
        float imc = peso / (altura * altura);

        // Determinação da situação
        String situacao;
        if (imc < 20) {
            situacao = "Abaixo do peso";
        } else if (imc >= 20 && imc < 25) {
            situacao = "Peso Normal";
        } else if (imc >= 25 && imc < 30) {
            situacao = "Sobrepeso";
        } else if (imc >= 30 && imc <= 40) {
            situacao = "Obeso";
        } else {
            situacao = "Obeso Mórbido";
        }

        // Saída
        System.out.println("IMC = " + imc + " - " + situacao);

        sc.close();
    }
}
