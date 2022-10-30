import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {
        System.out.print("n = ");
        int n = new Scanner(System.in).nextInt();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {

                System.out.println(i);
            }

        }
    }

}

