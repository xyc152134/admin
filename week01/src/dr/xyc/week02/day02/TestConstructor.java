package dr.xyc.week02.day02;

public class TestConstructor {
    public static void main(String[] args) {
        Point p = new Point(3.0, 4.0);
        Point origin = new Point(0.0, 0.0);
        System.out.println(p.getDistance(origin));


    }
}
