package dr.xyc.week02.day01;

public class StaticTest {
    public static void main(String[] args) {
//        StaticDemo sd=new StaticDemo();
//        sd.name="张三";
//        sd.age=13;
//        StaticDemo sd1=new StaticDemo();
//        sd1.name="李四";
//
//        System.out.println(sd.name);
//        System.out.println(sd1.name);
//        System.out.println(sd1.age);
//        System.out.println(sd.age);
         //类名加名字直接使用
        //System.out.println(StaticDemo.age);
       //直接调用
      // StaticDemo.add();
//        System.out.println(StaticDemo.abs(-12));
        StaticDemo s=new StaticDemo();
        s.r=2;
       double a=new StaticDemo().getArea();
        System.out.println(a);
    }
}
