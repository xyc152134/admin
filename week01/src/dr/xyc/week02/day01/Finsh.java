package dr.xyc.week02.day01;

public class Finsh extends Animal{
    private String scale;

    public Finsh(String name, int age, String sex) {
        super(name, age, sex);
    }

    public Finsh(String name, int age, String sex, String scale) {
        super(name, age, sex);
        this.scale = scale;
    }
}
