package dr.xyc.week02.day02;

public class Classfangfa2 extends Classfangfa {
    private String city;

    public Classfangfa2() {
    }

    public Classfangfa2(String city) {
        this.city = city;
    }

    public Classfangfa2(int age, String name, int heigth, String city) {
        super(age, name, heigth);
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
  public static void addd(){
        new Classfangfa().s2();
    }
}
