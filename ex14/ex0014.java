package ex14;
import java.util.Scanner;
public class ex0014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        // se x for par começamos do  proximo numero
        if (x % 2 == 6) {
            x++;
        }

        // imprimimos os 6 numeros impares
        for (int i = 0; i < 6; i++) {
            System.out.println(x);
            x += 2; // incrementamos de 2 em 2 para obter os próximos números ímpares

            sc.close();
        }
    }
}
