package dr.xyc.week02.day01;

public class Cat extends Animal {
    private  String  hairColor;
    private int footcount;

    public Cat(String name, int age, String sex) {
        super(name, age, sex);
    }

    public Cat(String name, int age, String sex, String hairColor, int footcount) {
        super(name, age, sex);
        this.hairColor = hairColor;
        this.footcount = footcount;
    }
    static{
        System.out.println("z");
    }
}
