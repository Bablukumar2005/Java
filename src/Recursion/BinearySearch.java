package src.Recursion;

public class BinearySearch {
    public static void main(String[] args) {
        int []arr={2,4,6,7,9,19};
        int target=9;
        int s=0;
        int e=arr.length-1;
        int mid=(s+e)/2;
        int ans=bs(arr,s,e,target);
        System.out.println(ans);
    }
    static int bs(int []nums ,int s,int e,int target){
        if(s>e){
            return -1;
        }
        int mid=(s+e)/2;
        if(nums[mid]==target){
            return mid;
        }
        else if(nums[mid]<target){
            s=mid+1;
           return  bs(nums,s,e,target);
        }else{
            e=mid-1;
            return bs(nums,s,e,target);
        }
    }
}
