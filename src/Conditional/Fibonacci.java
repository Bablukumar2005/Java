package src.Conditional;
import java.util.Scanner;
public class Fibonacci {
    static void fibon(int n){
        int i=0;
        int a = 0;
        int b = 1;
        while(i<n) {
            System.out.println(a);
            int c = a + b;
            a=b;
            b=c;
            i++;

        }

    }
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibon(n);
    }
}
