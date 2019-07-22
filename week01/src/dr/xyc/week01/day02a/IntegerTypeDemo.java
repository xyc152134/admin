package dr.xyc.week01.day02a;

public class IntegerTypeDemo {
    public static void main(String[] args) {
        byte by = 12;
        short sh = 1200;
        int i = 120000;
        long lo = 1200000L;
        int x = 010;//定义八进制是以0开头
        System.out.println(x);
        int y = 0xcc;//定义十六进制以0x开头；
        System.out.println(y);
        int z = 0b1000100;
        System.out.println("z:"+z);
        System.out.println(by);
        System.out.println(sh);
        System.out.println(i);
        System.out.println(lo);
    }
}
