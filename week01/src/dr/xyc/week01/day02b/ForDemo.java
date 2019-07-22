package dr.xyc.week01.day02b;

/**
 * 打印三角形
 * *****
 * ****
 * ***
 * **
 * *
 */

public class ForDemo {
    public static void main(String[] args) {
        for (int i = 5; i >=1; i--) {
            for (int i1 = 0; i1 <=i-1; i1++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }
}
