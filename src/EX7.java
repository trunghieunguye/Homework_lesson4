import java.util.Scanner;

public class EX7 {
    public static void main(String[] args) {
        int n,m,i;
        System.out.print("n = ");
        n =new Scanner(System.in).nextInt();//chieu dai hcn
        System.out.print("m = ");
        m =new Scanner(System.in).nextInt();//chieu rong hcn
        for(i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++) {
                if(i == 1 || i == m || j == 1 || j == n)
                    System.out.print("*  ");
                else
                    System.out.print("   ");
            }
            System.out.println("");
        }
        }

    }


