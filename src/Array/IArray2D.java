package src.Array;
import java.util.Arrays;
import java.util.Scanner;
public class IArray2D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();

        int [][]arr=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        //m1//
//        for(int i=0;i<rows;i++){
//            for(int j=0;j<arr[i].length;j++){
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
        //m2//
//        for(int i=0;i<arr.length;i++){//2d array is have many 1d array itself
//            System.out.println(Arrays.toString(arr[i]));
//        }
        //m3//
        for(int[] a:arr){
            System.out.println(Arrays.toString(a));
        }

    }
}
