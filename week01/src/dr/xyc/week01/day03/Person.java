package dr.xyc.week01.day03;


public class Person {
    private int age;
    private String name;

    public Person() {

    }

    public Person(int age) {
        this.age = age;
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void display() {
        System.out.println("年龄：" + age + ",姓名:" + name);

    }
}
