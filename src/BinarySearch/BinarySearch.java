package src.BinarySearch;
import java.util.Scanner;
public class BinarySearch {
    static boolean bs(int []num,int key){
        int s=num[0];
        int e=num[num.length-1];
        int mid=(s+e)/2;
        while(s<e){
            if(mid==key){
               return true;
            }
            else if(mid<key){
                s=mid+1;
            }else {
                e = mid - 1;
            }
            mid=(s+e)/2;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int target= sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        boolean a=bs(arr,target);
        if(a){
            System.out.println("target is available");
        }else {
            System.out.println("target is not available");
        }
    }
}
