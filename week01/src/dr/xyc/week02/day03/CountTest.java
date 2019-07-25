package dr.xyc.week02.day03;

public class CountTest {
    public static void main(String[] args) {

   Count c=Count.getInstance();
   c.add();
        System.out.println(c.getX());
    Count c1=Count.getInstance();
        System.out.println(c1.getX());


    }
}
