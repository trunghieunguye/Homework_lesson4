import java.util.Scanner;
public class EX10 {
    public static void main(String[] args) {
        System.out.print("Enter h = ");
        int h = new Scanner(System.in).nextInt();
        int star, blank = h - 1;
        for (int i = 0; i < h; i++) {
            star = 1 + 2 * i;
            for (int j = 0; j < blank; j++) {
                System.out.print("\t ");
            }
            for (int k = 0; k < star; k++) {
                System.out.print("\t*");
            }
            blank--;
            System.out.println();
        }
    }
}
