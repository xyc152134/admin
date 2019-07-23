package dr.xyc.week02.day02;



public class StringDemo {
    public static void main(String[] args) {
        String str = new String("admin");
        String str1 = "      a,d,m,i,n         ";
        //charAt（int i) 查找索引对应的值   返回值 char
        // System.out.println(str.charAt(4));
        //codePointAt(int index)  返回指定索引处的字符（Unicode代码点）。
        //int x=str.codePointAt(1);  d
        //   System.out.println(x); 100
        //compareTo(String anotherString)
        //按字典顺序比较两个字符串。
        // int i=str.compareTo(str1);  admin   aaa   第一个相同  看d跟a  d比a 大三个所以 i=3;
        //int i1=str1.compareTo(str);
//         System.out.println(i);3
//         System.out.println(i1);-3
        //compareToIgnoreCase()按字典顺序比较两个字符串  忽略大小写
//        int i=str.compareToIgnoreCase(str1);
//        System.out.println(i);
        //concat:连接字符串 +
//        System.out.println(str.concat(str1));
//        System.out.println(str+str1);
//        contains:判断是否包含指定字符串
//        System.out.println(str.contains("ad"));
//        endsWith:判断字符串是否以指定字符串结尾
//        System.out.println(str.endsWith("1"));
//        startsWith:判断是否以指定字符串开头
//        System.out.println(str.startsWith("a"));
//        equals:比较两个字符串是否相等
//        System.out.println(str.equals(str1));
        //equalsIgnoreCase:忽略大小写比较字符串
        //System.out.println(str.equalsIgnoreCase(str1));
//        byte[] b=str.getBytes(StandardCharsets.UTF_8);
//        for (byte b1 : b) {
//            System.out.println(b1);
//
//        }
        //getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)
        //将此字符串中的字符复制到目标字符数组中。
//        char[] a=new char[4];
//        str.getChars(0,4,a,0);
//        for (char c : a) {
//            System.out.println(c);
//
//        }
        //indexOf:检测指定字符在字符串中第一次出现的位置
//        System.out.println(str.indexOf("min"));
//        lastIndexOf:检测指定字符串最后出现的位置
//        System.out.println(str.lastIndexOf("d"));
//        isEmpty():判断是否是空字符串,不是null  而是  ""
//        System.out.println(str.isEmpty());
//        length():返回字符串的长度
//        System.out.println(str.length());
//        split:根据规则将字符串拆分成字符串数组
//        String[] c=str1.split(",");
//        for (String s : c) {
//            System.out.println(s);
//
//        }
//        substring:截取字符串  左包含右不包含原则
//        System.out.println(str.substring(3));
//        System.out.println(str.substring(1,3));  dm
//        System.out.println(str1.trim()); a,d,m,i,n
//        System.out.println(str1);      a,d,m,i,n
        //valueOf:把传入的参数转化为字符串   97是字符串
       // System.out.println(String.valueOf(97));

    }
}
