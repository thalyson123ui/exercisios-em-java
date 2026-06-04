package ex11;
import java.util.Scanner;
public class ex0011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horainicial = sc.nextInt();
        int horafinal = sc.nextInt();

        int duracao;
        if (horafinal > horainicial) {
            duracao = horafinal - horainicial;
        }else {
            duracao = (24 - horainicial) + horafinal;
        }
        System.out.println("A duração do jogo é de " + duracao + " horas.");
        sc.close();
    }
}
