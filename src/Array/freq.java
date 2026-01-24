package src.Array;
import java.util.Scanner;
public class freq {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
        }
        int []freq=new int[10];
        for(int i=0;i<n;i++){
           freq[arr[i]]++;
        }
//        for(int i=0;i<n;i++){
//            System.out.println(freq[i]);
//        }
        int max=0;
        for(int i=1;i<n;i++){
            if(freq[i]>max){
                max=i;
            }
        }
        System.out.println(max);
    }

    public static class reversenumber {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
           long temp=sc.nextLong();

            //System.out.println(x);
            long sum=0;

            while(temp!=0){
                long r=temp%10;
                sum=sum*10+r;
                temp=temp/10;
            }
            System.out.println(sum);
            if(sum>Integer.MAX_VALUE){
                System.out.println("-1");
            }else {
                System.out.println("fine");

            }
        }
    }
}
