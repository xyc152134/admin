package dr.xyc.week02.day03;

public class Seasondemo {
//    public  void add1(){
//       A a=new A();
//       a.add();
//    }非静态方法在在其他类分静态方法测试
    public static void main(String[] args) {
        Season[] s=Season.values();
        for (Season season : s) {
            System.out.println(season);
        }
    }
}
