package dr.xyc.week01.day02b.shuzu;

public class ArrayDemo2 {
    public static void main(String[] args) {
        int[] i = {1, 23, 4, 56, 78, 91, 12};
        int index = 0;
//        for (int i1 = 0; i1 < i.length; i1++) {
//            System.out.println(i[i1]);
//
//        }
//        while (index<i.length){
//            System.out.println(i[index++]);}
        for (int x : i) {
            System.out.println(x);

        }

    }
}
