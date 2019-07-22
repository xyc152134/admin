package dr.xyc.week01.day02b.shuzu;

import java.util.Scanner;

public class yinHang {
    static int money = 1000;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        /**
         * 1.查看余额
         * 2.存钱
         * 3.取钱
         * 4.转账
         */
        showMeau();
    }

    static void showMeau() {
                while (true) {
                    System.out.println("*******");
                    System.out.println("1.查看余额");
                    System.out.println("2.存钱");
                    System.out.println("3.取钱");
                    System.out.println("4.转账");
            System.out.println("5.退出");
            System.out.println("请输入编号");
            int index = sc.nextInt();
            sc.nextLine();
            switch (index) {
                case 1:
                    lookmoney();
                    break;
                case 2:
                    addmoney();
                    break;
                case 3:
                    drawMoney();
                    break;
                case 4:
                    transfer();
                    break;
                case 5:
                   return;
                default:
                    System.out.println("没有此项");


            }


        }


    }
    static void lookmoney(){
        System.out.println("余额为："+money);
    }
    static void addmoney(){
        System.out.println("请输入存钱数目");
        int add=sc.nextInt();
        money+=add;
        System.out.println("存钱成功");
    }
    static void drawMoney(){
        System.out.println("请输入取出金额");
        int draw=sc.nextInt();
        if (draw>money){
            System.out.println("余额不足");
            return;
        }
        money-=draw;
        System.out.println("取出成功");
    }
    static void  transfer(){
        System.out.println("请输入转账金额");
        int  tra=sc.nextInt();
        if(tra>money){
            System.out.println("转账失败，余额不足");
            return;
        }
        money-=tra;
        System.out.println("转账成功！");
    }
}
