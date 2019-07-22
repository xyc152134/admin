package dr.xyc.week02.day01;

public class MangerEmployee  extends Employee{
    private double bonus;

    public MangerEmployee(double bonus) {
        this.bonus = bonus;
    }

    public MangerEmployee(String name, int age, double salary, double bonus) {
        super(name, age, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
  @Override
    public  double getMoney(){
        return getSalary()+getBonus();
    }
}
