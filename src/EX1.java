import java.sql.SQLOutput;
import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
        System.out.print("a = ");
        int a = new Scanner(System.in).nextInt();
        System.out.print("b = ");
        int b = new Scanner(System.in).nextInt();
        System.out.print("c = ");
        int c = new Scanner(System.in).nextInt();
        System.out.print("d = ");
        int d = new Scanner(System.in).nextInt();
        if (a > b && a > c && a > d) {
            System.out.print("max = " + a);}
        if (b > a && b > c && b > d) {
            System.out.print("max = " + b);}
        if (c > a && c > b && c > d) {
            System.out.print("max = " + c);}
        if (d > a && d > b && d > c) {
            System.out.print("max = " + d);}




    }
}