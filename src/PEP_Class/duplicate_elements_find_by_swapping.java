package src.PEP_Class;
import java.util.Scanner;
import java.util.ArrayList;
public class duplicate_elements_find_by_swapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int i = 1;
        while(i != n){
            if(arr[i-1] == i || arr[i-1] == arr[arr[i-1]-1]){
                i++;
            } else {
                int temp = arr[i-1];
                arr[i-1] = arr[temp-1];
                arr[temp-1] = temp;
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        for(int k=1;k<=n;k++){
            if(arr[k-1] != k){
                list.add(arr[k-1]);
            }
        }

        System.out.println(list);
    }
}
