package dr.xyc.week01.day02b;

/**
 * 鸡兔同笼问题
 */

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入头数");
        int head = sc.nextInt();
        if(head<0){
            System.out.println("输入有误请重新输入");
        }
        System.out.println("请输入脚数");
        int foot = sc.nextInt();
        if(foot<0){
            System.out.println("输入有误请重新输入");
        }
        if (head * 4 <= foot || head * 2 >= head) {
            System.out.println("输入有误请重新输入");
        } else {
            int x, y;
//        for (y = 1; y <= head; y++) {

//            if (x * 4 + 2 * y == foot){

            y = (foot - 2 * head) / 2;
            x = head - y;
            System.out.println(x + "只兔子");
            System.out.println(y + "只鸡");
        }
    }
        }





