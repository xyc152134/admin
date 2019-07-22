package dr.xyc.week01.day02b.shuzu;

import java.util.Random;

public class Arraytest {
    public static void main(String[] args) {
        //创建数组
        int[] arr=new int[5];
        //随机数
        Random r=new Random();
        for (int i = 0; i < 5; i++) {
            arr[i]=r.nextInt(101);
        }
        //遍历数组，打印数组
        for (int i : arr) {
            System.out.println(i);

        }int max=arr[0];
        int min=arr[0];
        int sum=0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
            if (arr[i]<min) {
                min=arr[i];
            }
            sum+=arr[i];


        }
        System.out.println("最大值："+max);
        System.out.println("最小值："+min);
        System.out.println("和："+sum);
        System.out.println("平均值："+sum/arr.length);
    }
}
