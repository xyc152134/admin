package dr.xyc.week01.day03;

public class Circle {
    private  double r;

    public Circle(double r) {
        this.r = r;
    }

    public double getArea(){
        return Math.PI*r*r;
    }
    public double getPerimeter(){
        return Math.PI*r*2;
    }

}
