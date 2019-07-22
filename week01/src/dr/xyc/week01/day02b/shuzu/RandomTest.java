package dr.xyc.week01.day02b.shuzu;
/**
 * 猜数字游戏
 * 生成随机数 Random
 *
 */

import java.util.Random;
import java.util.Scanner;

public class RandomTest {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int number = r.nextInt(100) + 1;

        System.out.println("请输入1~100之间的数");
        while (true){

        int i = sc.nextInt();

        if (i > number) {
            System.out.println("猜大l");
        } else if (i < number) {
            System.out.println("猜小了");
        } else {
            System.out.println("恭喜您猜对了");
            break;
        }
        }

    }}
