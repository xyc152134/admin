package dr.xyc.week01.day02b;

public class ForTest2 {
    public static void main(String[] args) {
        int r=1;

        for (int i = 1; i < 100; i=i+r) {
            System.out.println(i);
            r=i-r;
            if (i>100){
                break;}

        }

    }
}
