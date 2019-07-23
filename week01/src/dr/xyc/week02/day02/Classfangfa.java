package dr.xyc.week02.day02;

public class Classfangfa {
    protected int age;
    private String name;
     int heigth;

    public Classfangfa() {
    }

    public Classfangfa(int age, String name, int heigth) {
        this.age = age;
        this.name = name;
        this.heigth = heigth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeigth() {
        return heigth;
    }

    public void setHeigth(int heigth) {
        this.heigth = heigth;
    }

    public void s1(){

        System.out.println("无返回值的void的s1方法");
    }
    public int s2(){
        System.out.println("有返回值的s2方法");

        return 1;
    }
    public static int s3(){
        System.out.println("有返回值的s3静态方法");
        return 2;
    }
    public static int add1(int age){
        return age*2;

    }
}
