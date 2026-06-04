package ex10;
import java.util.Scanner;
public class ex0010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //le a idade em dias
        int idadeDias = sc.nextInt();

        //calcula anos, meses e dias
        int anos = idadeDias / 365;
        int meses = (idadeDias % 365) / 30;
        int dias = (idadeDias % 365) % 30;

        //imprimir no formato solicitado
        System.out.println(anos + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(dias + " dia(s)");
        sc.close();
    }
}
