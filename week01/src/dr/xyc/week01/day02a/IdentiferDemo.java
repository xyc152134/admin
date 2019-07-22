package dr.xyc.week01.day02a;

/**
 * 1.什么是标识符
 * Java语言中，对于变量、常量、函数、语句块均有名字，我们统统称之为标识符，标识符是用来给类、接口、方法、变量命名的
 * 2.标识符的组成
 * Java标识符由数字、字母、下划线（_）和美元符（$）组成，此处的字母不局限于26个英文字母，可以包含中文、日文等Unicode6.2.0字符集支持的字符
 * 3.标识符要求
 * 在Java中区分大小写
 * 首位不能是数字
 * Java关键字不能做标识符
 * 标识符不能包括空格
 * 标识符不能包含（_、$）之外其他的特殊字符
 */

public class IdentiferDemo {
    public static void main(String[] args) {
        /*合法字符*/
        int abc=0;
        int _bc=1;
        int $bc=2;
        int a_b=3;
        int a1=4;
        int 变量=5;
    /*不合法的字符*/
//        int a abc=6;//有空格不合法
//        int 1abc=7;//数字开头不合法
//        int public=8;//关键字不合法
//        int ab%=9;//不能包含$_以外的其他字符


    }
}
