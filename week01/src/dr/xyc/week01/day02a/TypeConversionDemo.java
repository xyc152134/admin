package dr.xyc.week01.day02a;

/**
 * 强制类型转换
 * 1.容量大的数据类型转换为容量小的数据类型时需要强制类型转换
 * 2.当一种类型强制转换为另一种类型，而又超出了目标类型的表示范围时，将会截断为一个完全不同的值，此值无意义
 */


public class TypeConversionDemo {
    public static void main(String[] args) {
        int i=12;
        int i1=12000000;
        byte b=(byte)i;
        short s=(short)i;
        byte b1 = (byte) i1;//丢失东西而且值毫无意义
        short s1 = (short) i1;//丢失东西而且值毫无意义
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(b1);
        System.out.println(s1);
        System.out.println(i1);
    }
}
