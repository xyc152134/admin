package dr.xyc.week02.day01;

public class StaticDemo {
    String name;
    static  int age=18;


    static void add(){
        System.out.println("aaa");
    }

    public  static  int abs(int x){
        return x>0?x:-x;
    }
    double r;

    public void setR(double r) {
        this.r = r;
    }

    public double getArea(){
        System.out.println(r);
        return  Math.PI*r*r;

    }

}
