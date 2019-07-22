package dr.xyc.week01.day02b;

public class ForDemo5 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int i1 = 0; i1 < 10; i1++) {
                if (i + i1 >=4 && i1 - i <=5 && i - i1 <=4 && i + i1 <=14) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

    }
}
