package dr.xyc.week04.day01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStream {
    public static void main(String[] args) {
        try {
            FileInputStream in = new FileInputStream("G:\\wokespace\\week01\\src\\dr\\xyc\\week04\\day01\\demo");
//            int i=in.read();
//            int i1=in.read();
//            int i2=in.read();
//            int i3=in.read();
            //          System.out.println((char) i);
            byte[] bytes = new byte[4];
//            int i = in.read(bytes);
//            for (byte aByte : bytes) {
//                System.out.print((char) aByte);
//
//            }
            String str ="";
            int len =0;
            while ((len=in.read(bytes))!=-1){
                str+=new String(bytes,0,len);
            }
            System.out.println(str);
            System.out.println(in.available()); //可读数量,剩余没被读的
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
