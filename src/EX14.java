import java.util.Scanner;
public class EX14 {
    public static void main(String[] args) {
        System.out.print("Enter n = ");
        int n = new Scanner(System.in).nextInt();
        String even = "", odd = "";
        for (int i = 1; i < n; i++) {
            if (i % 2 == 0){
                even += ", " + i;
                continue;
            }
            odd += ", " + i;
        }
        System.out.println("Even number(s) in the interval [1,n) is(are) "+even);
        System.out.println("Odd number(s) in the interval [1,n) is(are) "+odd);
    }
}