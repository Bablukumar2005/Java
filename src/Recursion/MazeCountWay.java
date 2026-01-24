//package src.Recursion;
//
//public class MazeCountWay {
//    public static void main(String[] args) {
//        System.out.println(counts(4,4));
//    }
//    static int counts(int r,int c){
//        if (r == 1 || c == 1) {
//            return 1;
//        }
//        int le=counts(r-1,c);
//        int ri=counts(r,c-1);
//        return le+ri;
//    }
//
//}

//package src.Recursion;
//
//public class MazeCountWay {
//    public static void main(String[] args) {
//       counts("",3,3);
//    }
//    static void counts(String p,int r,int c) {
//        if (r == 1 && c == 1) {
//            System.out.println(p);
//            return;
//        }
//        if (r > 1) {
//            counts(p + "D", r - 1, c);
//        }
//        if (c > 1) {
//            counts(p + "R", r, c - 1);
//
//        }
//    }
//}

package src.Recursion;

import java.util.ArrayList;

public class MazeCountWay {
    public static void main(String[] args) {

        System.out.println(counts("",3,3,new ArrayList<>()));
    }
    static ArrayList<String> counts(String p, int r, int c, ArrayList<String> list) {
        if (r == 1 && c == 1) {
            list.add(p);
            return list;
        }
        if(r>1 && c>1 ) {
            counts(p + "D", r - 1, c-1,list);
        }

        if (r > 1) {
            counts(p + "V", r - 1, c,list);
        }
        if (c > 1) {
            counts(p + "H", r, c - 1,list);

        }
        return list;
    }
}
