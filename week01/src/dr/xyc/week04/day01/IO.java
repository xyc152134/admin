package dr.xyc.week04.day01;
/**
 * File只能添加、删除文件或者文件夹 不能修改
 *
 */

import javax.naming.Name;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.lang.reflect.Field;

public class IO {
    public static void main(String[] args) throws IOException {
        File file = new File("G:\\wokespace\\week01\\src\\dr\\xyc\\week04\\day01\\demo");
        File file1 = new File("b.txt");
        // System.out.println(file.canRead());//是否可读
        //System.out.println(file1.createNewFile());//创建文件
        //File file2= File.createTempFile(String.valueOf(System.currentTimeMillis()),".txt");
//
//        File file2=new File("C: \\");
//        String[] strings=file2.list((dir, name) -> {//重写过滤器 筛选 不显示.sys结尾文件
//         if(name.endsWith(".sys")){
//             return  false;
//         }else {
//             return  true;
//         }
//        });
//        for (String string : strings) {
//            System.out.println(string);
//        }
          File[] file2=File.listRoots();
        for (File file3 : file2) {
            System.out.println(file3);

        }
    }

}
