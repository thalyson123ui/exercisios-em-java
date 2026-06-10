package ex25;
import java.util.Scanner;
public class ex0025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // entrada: 5 numeros (0 ou 1)
        String entrada = sc.nextLine().trim();
        sc.close();

        // verifica se a entrada  tem exatamente 5 caracteristicas
        if (entrada.length() != 5) {
            System.out.println("Entrada inválida. Por favor, insira exatamente 5 números (0 ou 1).");
            return;
        }

        // extrai cada requisito
        int interfacegrafica = entrada.charAt(0) - '0';
        int inteligenciaartificial = entrada.charAt(1) - '0';
        int encapsulamento = entrada.charAt(2) - '0';
        int identacao = entrada.charAt(3) - '0';
        int structs = entrada.charAt(4) - '0';
        
        // requisito 1: interface grafica ou inteligencia artificial
        boolean requisito1 = (interfacegrafica == 1 || inteligenciaartificial == 1);

        // requisito 2: encapsulamento e identacao
        boolean requisito2 = (encapsulamento == 1 && identacao == 1);

        // requisito 3: structs
        boolean requisito3 = (structs == 1);

        // verifica se todos os requisitos são atendidos
        if (requisito1 && requisito2 && requisito3) {
            System.out.println("Sim");
        } else {
            System.out.println("Não");
        }
    }
}
