package src.Conditional;

import java.util.Scanner;

public class CountNo {

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            String s=sc.nextLine();
            int count=0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)-'0'==7){
                    count++;
                }
            }
            System.out.println(count);
        }
    }

