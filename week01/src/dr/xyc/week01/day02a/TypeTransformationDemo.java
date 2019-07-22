package dr.xyc.week01.day02a;

public class TypeTransformationDemo {
    public static void main(String[] args) {
        byte b=12;
        short s=b;
        int i1 =s;
        int i2=b;
        long l=i1;
        float f=l;
        double d=f;
        System.out.println(d);


    }
}
