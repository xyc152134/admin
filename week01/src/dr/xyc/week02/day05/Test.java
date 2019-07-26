package dr.xyc.week02.day05;

public class Test {
    public static void main(String[] args) {
        System.out.println(div(8, 4));
    }
    public static  int div(int x,int y){
        try {
            int result=x/y;
            String str=null;
            return result;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }finally {
            System.out.println("finally");
        }
        return 0;
    }
}
