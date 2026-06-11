package ex29;

public class ex0029 {
    public static void main(String[] args) {
        int[] valores = {1, 3, 9};

        for (int i : valores) {
            for (int j = 7; j >= 5; j--){
                System.out.println("i=" + i + " j=" + j);
            }
        }
    }
}
