package dr.xyc.week02.day02;

public class String1 {
    public static void main(String[] args) {
        String s1="abcd";
        String str1="ab"+"cd";
        String str2=new String("abcd");
        String s2="ab";
        String s3="cd";
        System.out.println(s1.equals(str2));
        System.out.println(s1==str2);
        System.out.println(str2==str1);

    }


}
