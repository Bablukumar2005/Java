package src.PEP_Class;

import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input: ");
        int n=sc.nextInt();
        int len=2*n-1;

        for (int i = 0; i < len; i++) {
            int space = Math.abs(n - 1 - i);
            int stars = len - 2 * space;

            // spaces
            for (int s = 0; s < space; s++) {
                System.out.print(" ");
                System.out.print(" ");
            }
            // stars
            for (int st = 0; st < stars; st++) {
                System.out.print("*");
                System.out.print(" ");
            }

            System.out.println();
        }

    }
}
