package dr.xyc.week01.day02b.shuzu;

/**
 * 选择排序
 * 遍历一遍数组，找到最小的数，放在第一个位置
 * 遍历除第一位数组，找到最小数，放在第二个位置
 * 如此重复
 * */

public class Demo1 {
    public static void main(String[] args) {
        int[] i = {1, 2, 6, 175, 9, 15};
        int temp;
        //第几位数
        for (int j = 0; j < i.length; j++) {
            //遍历数
            for (int z = 0; z < i.length; z++) {
                //进行比较
                if(i[j]<i[z]){
                    //交换数
                    temp=i[j];
                    i[j]=i[z];
                    i[z]=temp;
                }

            }
        }
        for (int i1 : i) {
            System.out.println(i1);

        }
    }
}
