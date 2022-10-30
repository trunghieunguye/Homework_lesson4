import java.util.Scanner;

public class EX8 {
    public static void main(String[] args) {
        int n,m,i;
        System.out.print("n = ");
        n =new Scanner(System.in).nextInt();//chieu dai hcn
        System.out.print("m = ");
        m =new Scanner(System.in).nextInt();//chieu rong hcn
        for(i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++) {
                System.out.print("*  ");
            }
            System.out.println("");
        }

        }



    }

