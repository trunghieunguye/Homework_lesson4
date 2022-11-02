import java.util.Scanner;
public class EX12 {
    public static void main(String[] args) {
        System.out.println("For m < n");
        System.out.print("Enter m = ");
        int m = new Scanner(System.in).nextInt();
        System.out.print("Enter n = ");
        int n = new Scanner(System.in).nextInt();
        String square_number = "";
        int count = 0;
        for (int i = m; i <= n; i++) {
            double temp = Math.sqrt(i) / Math.round(Math.sqrt(i));
            if (temp != 1) {
                continue;
            }
            count++;
            square_number += ", " + i;

        }
        System.out.println("The square number(s) in the interval is(are) " + square_number);
        System.out.println("The number of square number(s) is(are) " + count);
    }
}