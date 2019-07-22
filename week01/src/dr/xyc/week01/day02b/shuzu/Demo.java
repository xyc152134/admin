package dr.xyc.week01.day02b.shuzu;

/**
 * 冒泡法排序从小到大
 * 大的在下面沉下去，小的上去
 * 内层for循环找到最小的数
 * 外层for循环控制该第几个数
 */


public class Demo {
    public static void main(String[] args) {
        int[] i = {1, 2, 6, 175, 9, 15};
        int temp;
//        Random r=new Random();
//        for (int i1 = 0; i1 < i.length; i1++) {
//            i[i1]=r.nextInt(100);
//
//        }
        for (int i3 = 0; i3 < i.length - 1; i3++) {
            for (int i1 = 0; i1 < i.length - 1 - i3; i1++) {
                if (i[i1] > i[i1 + 1]) {
                    //交换位置
                    temp = i[i1];
                    i[i1] = i[i1 + 1];
                    i[i1 + 1] = temp;

                }
            }

        }
        for (int i2 : i) {
            System.out.println(i2);

        }
    }
}
