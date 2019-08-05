package dr.xyc.week04.day01;
/**
 * 复制文件到另一个目录下面
 */

import java.io.*;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入源文件地址");
        String srcPath=input.nextLine();
        File srcFile=new File(srcPath);
        System.out.println("请输入目标路径");
        String targetPath=input.nextLine();
        File targetFile=new File(targetPath+srcFile.getName());
        FileInputStream in =null;
        FileOutputStream out =null;
        try {
            in=new FileInputStream(srcFile);
            out=new FileOutputStream(targetFile);
            byte[] bytes=new byte[8];
            int i=0;
            while ((i=in.read(bytes))!=-1){
                out.write(bytes,0,i);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                in.close();
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
