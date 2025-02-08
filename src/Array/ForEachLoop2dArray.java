package src.Array;
import java.util.Scanner;
import java.util.Arrays;
public class ForEachLoop2dArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int [][]arr=new int[rows][cols];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        //For Each Loop used to Print 2d Array
//        for(int []num:arr){
//            for(int nums:num){
//                System.out.print(nums+" ");
//            }
//            System.out.println();
//        }
        for(int []n:arr){
            System.out.println(Arrays.toString(n));
        }
        System.out.println();
    }
}
