package src.PEP_Class;

public class Two_Sum_Sorted_Array {

        public int[] twoSum(int[] nums, int target) {
            //Arrays.sort(nums); Only for sorted array
            int i=0;
            int j=nums.length-1;
            int []arr=new int[2];
            while(i<j){
                if(nums[i]+nums[j]==target){
                    arr[0]=i;
                    arr[1]=j;
                    //System.out.println(i+" "+j+" ");
                    return arr;
                }else if((nums[i]+nums[j])>target){
                    j--;
                }else{
                    i++;
                }
            }
            return arr;

    }
}
