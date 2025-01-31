package src.Conditional;
import java.util.Scanner;
public class CaseCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().trim().charAt(0);//char at position 0
        //System.out.println(ch);
        if(ch >='a' && ch <='z'){ //char is automatically  promoted to int
            System.out.println("lowercase");

        }else{
            System.out.println("not lower case");
        }
    }
}
