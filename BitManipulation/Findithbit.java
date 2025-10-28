package BitManipulation;

public class Findithbit {

        public static void main(String[] args) {
            int m=22;
            int i=3;
            System.out.println((m&(1<<(i-1)))>>i-1);

    }
}
