package dr.xyc.week01.day01;

import java.util.Scanner;

public class sumtest {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入第一个数");
        int a =sc.nextInt();
        System.out.println("请输入第二个数");
        int b =sc.nextInt();
        int c=a+b;
        System.out.println("c:"+c);
    }
}
