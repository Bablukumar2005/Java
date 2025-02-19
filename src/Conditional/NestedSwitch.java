package src.Conditional;
import java.util.Scanner;
public class NestedSwitch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int empId=sc.nextInt();
        sc.nextLine();
        String department=sc.nextLine();

        switch(empId){
            case 1:
                System.out.println("bablu kumar");
                break;
            case 2:
                System.out.println("Abhishek kumar");
                break;
            case 3:
                System.out.println("praneet raj");
                switch(department){
                    case "IT":
                        System.out.println("It department");
                    case "CSE":
                        System.out.println("Cse department");
                    default:
                        System.out.println("Invalid department");
                }

            default:
                System.out.println("Invalid Input");

        }
    }
}
