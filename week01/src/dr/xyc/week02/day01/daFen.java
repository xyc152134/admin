package dr.xyc.week02.day01;

import java.util.Scanner;

/**
 * 6个评委打分，除去最高分，最低分，输出平均分
 * 分析： 1 定义一个长度为6的数组
 * 2键盘录入评委分数
 * 3写方法获取最高分，最低分，
 * 4，求总分
 * 5平均分
 */

public class daFen {
    public static void main(String[] args) {
        int[] arr = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第"+(i+1)+"评委打分(1-100分：)");
            arr[i] = sc.nextInt();
        }
        int max=Max(arr);
        int min=min(arr);
        int sum=sum(arr);
        int avg=(sum-max-min)/(arr.length-2);
        System.out.println("最高分"+max);
        System.out.println("最低分"+min);
        System.out.println("最后总分"+(sum-max-min));
        System.out.println("最平均分"+avg);


    }
public  static  int sum(int[] arr){
        int sum=0;
    for (int i = 0; i < arr.length; i++) {
        sum+=arr[i];

    }
        return  sum;
}

    public static int Max(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max > arr[i]) {
                max = arr[i];
            }

        }
        return max;
    }
    public static int min(int[] arr){
        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(min<arr[i]){
                min=arr[i];
            }

        }
        return min;
    }
}



