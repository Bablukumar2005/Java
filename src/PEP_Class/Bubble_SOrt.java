package src.PEP_Class;
import java.util.Scanner;
public class Bubble_SOrt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            boolean flag=true;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j+1] =temp;
                    flag=false;
                }
            }
            if(flag){
                break;
            }
        }
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
