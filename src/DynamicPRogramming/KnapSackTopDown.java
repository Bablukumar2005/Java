package src.DynamicPRogramming;

public class KnapSackTopDown {
    public static void main(String[] args) {

        int W=50;
        int[] wt = {10, 20, 30};
        int[] val = {60, 100, 120};
        int n=val.length;
        int[][] t =new int[n+1][W+1];
        int a=KnapSack(val,wt,n,W,t);
        System.out.println("max profit:"+a);
    }

    static int KnapSack(int[] val, int[] wt, int n, int W, int[][] t) {
       //base condition
        for (int i=0;i<n+1;i++){
           for(int j=0;j<W+1;j++){
               if(i==0 || j==0){
                   t[i][j]=0;
               }
           }
       }
        //Choice condition convert to iteration(top down approach)
        for(int i=1;i<n+1;i++){
            for(int j=1;j<W+1;j++){

                if(wt[i-1]<=j){
                    t[i][j]=Math.max(val[i-1]+t[i-1][j-wt[i-1]],t[i-1][j]);
                }
                else{
                    t[i][j]=t[i-1][j];
                }
            }
        }

      return t[n][W] ;
    }
}
