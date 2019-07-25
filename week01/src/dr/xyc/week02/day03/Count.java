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
    private   static  Count c=new Count();
   public static  Count getInstance(){
       return  c;
   }


}
