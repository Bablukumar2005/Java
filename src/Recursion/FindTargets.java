//package src.Recursion;
//
//import java.util.ArrayList;
//
//public class FindTargets {
//    public static void main(String[] args) {
//        int[] arr={1,2,0,4,5,7};
//        ArrayList<Integer> ans= findIndexs(arr,6,0,new ArrayList<>());
//        System.out.println(ans);
//    }
//    static ArrayList<Integer> findIndexs(int []nums,int target,int index,ArrayList<Integer> list){
//        if(index==nums.length){
//            return list;
//        }
//        if(nums[index]==target){
//            list.add(index);
//        }
//        return findIndexs(nums,target,index+1,list);
//    }
//}
package src.Recursion;

import java.util.ArrayList;

public class FindTargets {
    public static void main(String[] args) {
        int[] arr={1,2,0,4,5,4,7};
        ArrayList<Integer> ans= findIndexs(arr,4,0);
        System.out.println(ans);
    }
    static ArrayList<Integer> findIndexs(int []nums,int target,int index){
        ArrayList<Integer> list=new ArrayList<>();
        if(index==nums.length){
            return list;
        }
        if(nums[index]==target){
            list.add(index);
        }
        ArrayList<Integer> Addfrombelow=findIndexs(nums,target,index+1);
        list.addAll(Addfrombelow);
        return list;
    }
}
