import java.util.Scanner;
public class EX13 {
    public static void main(String[] args) {
        System.out.print("Enter n = ");
        int n = new Scanner(System.in).nextInt();
        String numbers = "";
        for (int i = 1; i <= n; i++) {
            if (i % 7 == 0) {
                numbers += ", " + i;
                i += 6;
            }
        }
        System.out.println("7 can be divided by " + numbers + " (the numbers in the interval [1;n])");
    }
}