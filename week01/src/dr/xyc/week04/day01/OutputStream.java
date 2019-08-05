package dr.xyc.week04.day01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStream {
    public static void main(String[] args) {
        try {
            FileOutputStream out=new FileOutputStream("G:\\wokespace\\week01\\src\\dr\\xyc\\week04\\day01\\demo",true);
            //out.write(97);
            String str="挨家挨户法我方哈无法";
            out.write(str.getBytes("utf-8"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
