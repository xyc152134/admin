package dr.xyc.week01.day02b.shuzu;

/**
 * 插入排序
 */
public class Demo2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 6, 175, 9, 15};
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]>arr[j]) {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                }

            }

        }

        for (int i1 : arr) {
            System.out.println(i1);

        }
    }
}
