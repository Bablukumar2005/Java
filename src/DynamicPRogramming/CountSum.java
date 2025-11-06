package src.DynamicPRogramming;

public class CountSum {
    public static void main(String[] args) {

        int []wt = {5, 2, 3, 10, 6, 8};
        int W = 8;
        //int[] val = {60, 100, 120};
        int n=wt.length;
        int[][] t =new int[n+1][W+1];
        int a=CountSum(wt,n,W,t);
        System.out.println("count:"+a);
    }
    public static int CountSum(int nums[],int n,int target,int [][]t){
        //base Condition
        for(int i=0;i<n+1;i++){
            for(int j=0;j<target+1;j++){
                if( j==0){
                    t[i][j]=1;
                }
                else if(i==0){
                    t[i][j]=0;
                }

            }
        }
        //Code
        for(int i=1;i<n+1;i++){
            for(int j=0;j<target+1;j++){
                if(nums[i-1]<=j){
                    t[i][j]=(int)((long)(t[i-1][j-nums[i-1]]+t[i-1][j]));
                }else{
                    t[i][j]=t[i-1][j];
                }
            }
        }
        return t[n][target];
    }
}
