package src.Array;
import java.util.Scanner;
public class ICountDigitInNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        digits(n);
    }

  static void digits(int n) {
        if(n<0){
            n=n*-1;
        }
      System.out.println((int)(Math.log10(n))+1);
    }
}
