package src.Function;
import java.util.Arrays;
public class Varargs {

    //(1.)
    //    public static void main(String[] args) {
//        //Scanner sc=new Scanner(System.in);
//
//        fun( 2,3,67,4,5,56,6,6);
//    }
//    static void fun(int ...v){
//        System.out.println(Arrays.toString(v));
//    }
    //(2.)
    public static void main(String[] args) {
        fun(5,6,"bablu","gdfh","shanti");
    }
    static void fun(int a,int b,String ...s){
        //static void fun(int a,String ...s,int b){//varargs will not come at the between always at the end
               System.out.println(Arrays.toString(s));
    }
}
