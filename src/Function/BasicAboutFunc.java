
//Function remove the repeated line of code
//like if we want to add two number for 1000 times
// so we have to copy the concept of adding code 1000 times
//so just made a method(fun)and call it whatever times you want

package src.Function;
import java.util.Scanner;
public class BasicAboutFunc {
//    public static void main(String[] args) {
//        sum();
//        sum();
//        sum();
//    }
//    static void sum(){
//        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter the number a:");
//        int a=sc.nextInt();
//        System.out.print("Enter the number b:");
//        int b=sc.nextInt();
//        int sum=a+b;
//        System.out.println(sum);
//
//
//    }

public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    int row=sc.nextInt();
    int col=sc.nextInt();
    int [][]arr=new int[row][col];
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr.length;j++){
            arr[i][j]=sc.nextInt();
        }
    }
    int [][]arra=Calcu(arr);
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr.length;j++){
            System.out.println(arr[i][j]);
        }
    }

}
static int[][] Calcu(int [][]grid){
    int sum=0;
    for(int i=0;i<grid.length;i++){
        for(int j=0;j<grid.length;j++){
            if(grid[i][j]==0){
                grid[i][j]=1;
                return grid;
            }

        }
    }
    return grid;
    }
}
