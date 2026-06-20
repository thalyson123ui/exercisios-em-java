package ex47;

public class ex0047 {
    public static void main(String[] args) {
        int termo = 1; // primeiro termo da série

        for (int i = 1; i <= 20; i++) {
            System.out.print(termo + " ");
            termo *= 3; // cada termo é o anterior multiplicado por 3
        }
    }
}
