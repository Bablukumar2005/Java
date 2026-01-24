package src.PEP_Class;

import java.util.ArrayList;
import java.util.Scanner;

public class duplicate_elements_by_subrating_one {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> list=new ArrayList<>();
        int i=0;
        while(i<n){
            if(arr[i]>0){
                arr[arr[i]]=-1*(arr[arr[i]]-1);
            }
        }
    }
}
