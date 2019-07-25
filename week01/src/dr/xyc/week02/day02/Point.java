package dr.xyc.week02.day02;

public class Point {
    double x,y;
    public Point(double x,double y){
        this.x=x;
        this.y=y;

    }
    public double getDistance(Point point){
        return Math.sqrt(Math.pow((x- point.x),2)+Math.pow((y- point.y),2));
    }
}
