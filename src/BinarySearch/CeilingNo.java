package src.BinarySearch;
import java.util.Scanner;
public class CeilingNo {


        static int bs(int []num,int key){
            int s=num[0];
            int e=num[num.length-1];
            int mid=(s+e)/2;
            while(s<=e){
                if(mid==key){
                    return mid;
                }
                else if(mid<key){
                    s=mid+1;
                }else {
                    e = mid - 1;
                }
                mid=(s+e)/2;
            }
            return s;
        }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int target= sc.nextInt();
            int []arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }

            int a=bs(arr,target);

                System.out.println("Ceiling No "+a);

        }
    }


