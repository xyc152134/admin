package dr.xyc.week01.day01;

import java.util.Scanner;

public class iftest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if (a>b) {
            System.out.println("a大于b"+a);
        }else {
            System.out.println("b大于a"+b);
        }

    }
}
