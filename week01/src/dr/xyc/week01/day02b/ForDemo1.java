package dr.xyc.week01.day02b;

public class ForDemo1 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int i2 = 0; i2 <5-i; i2++) {
                System.out.print(" ");}
            for (int i1 = 0; i1 <=i; i1++) {


                System.out.print("*");
            }
            System.out.println();
        }
    }
}
