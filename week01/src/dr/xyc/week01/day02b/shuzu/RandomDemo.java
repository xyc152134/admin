package dr.xyc.week01.day02b.shuzu;

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random r=new Random();
        for (int i = 0; i < 10; i++) {
            int number=r.nextInt(10);
            System.out.println(number);
        }
       int i=r.nextInt(100)+1;//获取1~100随机数
        System.out.println("i:"+i);
    }
}
