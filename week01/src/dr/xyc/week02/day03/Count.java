package dr.xyc.week02.day03;

public class Count {
    private  int x;

   private Count() {
       this(0);
    }

   private Count(int x) {
        this.x = x;
    }


    public  void add(){
       this.x++;
    }
    public int getX() {
        return x;

    }
    private   static  Count c=new Count();//需要传参  不是死的而枚举里面东西是有限个集合 是死的  需要构建新对象使用
   public static  Count getInstance(){
       return  c;
   }


}
