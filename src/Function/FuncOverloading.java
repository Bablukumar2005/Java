package src.Function;
import java.util.Scanner;
class OverloadingVarargs {
    // Method with a single integer parameter
    static void print(int a) {
        System.out.println("Single integer: " + a);
    }

    // Overloaded method with varargs
    static void print(int... numbers) {
        System.out.print("Multiple integers: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        print(10);          // Calls print(int a)
        print(1, 2, 3, 4);  // Calls print(int... numbers)
    }
}