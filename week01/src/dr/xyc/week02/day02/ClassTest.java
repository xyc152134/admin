package dr.xyc.week02.day02;

/**
 * 静态的方法可以直接使用
 * 非静态的方法，其他非静态方法可以调用，静态的调用必须通过创建对象
 */
public class ClassTest {
    public static void main(String[] args) {
        Classfangfa.s3();//类中静态方法 类名.方法直接调用
        Classfangfa2.addd();

        new Classfangfa().s1(); //通过new 创建才能被调用
        Classfangfa t=new Classfangfa();
        int x=t.s2();//创建new 之后 可以用t.方法名调用方法 int x接收返回值
        System.out.println(x);
        //t1()  调用不了
        new ClassTest().t1(); //可以被调用
        ClassTest c=new ClassTest();
        c.t1();
        System.out.println(t2());
        System.out.println(Classfangfa.add1(10));
        System.out.println(new ClassTest().add2(16));
         Classfangfa2.addd();
    }
    public void t1(){
        System.out.println("t1方法");
    }
    public static  int t2(){
      //  t1();不能被调用
        new  ClassTest().t1();//通过new来调用
        System.out.println("静态t2方法");
        return 2;
    }
    public int add2(int r){
        return r*2;
    }
}
