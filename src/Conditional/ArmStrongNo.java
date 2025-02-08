package src.Conditional;
import java.util.Scanner;
public class ArmStrongNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int n=a;
      int sum=0;
        while(n>0){
            int r=n%10;
            sum=sum+(r*r*r);
            n=n/10;
        }

        //int b=(int)sum;

        System.out.println(sum==a);
        if(sum==a){
            System.out.println("Armstrong number");
        }else{
            System.out.println("Not Armstrong number");
        }

    }
}
