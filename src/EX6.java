import java.util.Scanner;

public class EX6 {
    public static void main(String[] args) {
        System.out.print("n = ");
        int n=new Scanner(System.in).nextInt();
        int soDu, tong = 0;
        while (n > 0) {
            soDu = n % 10;
            n = n / 10;
            tong += soDu;
        }

        System.out.println("Tổng các chữ số = " + tong);

    }
}
