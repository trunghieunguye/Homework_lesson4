import java.util.Scanner;
public class EX5 {
    public static void main(String[] args) {
        System.out.print("Nhập số: ");
        int n = new Scanner(System.in).nextInt();
        int m = n;
        int check = 0;
        while (m > 0) {
            check = check * 10 + m % 10;
            m /= 10;
        }
        if (check == n) {
            System.out.printf("%d là số thuận nghịch!", n);
        } else {
            System.out.printf("%d không phải số thuận nghịch!", n);
        }
    }

}
