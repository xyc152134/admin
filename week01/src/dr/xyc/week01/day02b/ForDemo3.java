package dr.xyc.week01.day02b;

public class ForDemo3 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int i1 = 0; i1 <i; i1++) {
                System.out.print(" ");
            }
            for (int i1 = 0; i1 <5-i; i1++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
