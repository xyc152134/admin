package dr.xyc.week01.day01;



public class ifdemo {
    public static void main(String[] args) {
       int x=5;
       int y;
        if (x>=3) {
            y=3*x-1;

        }else if(x>=1&&x<3){
            y=2*x-1;
        }
        else { y=0;
            System.out.println("不存在X");



        }
        System.out.println("y="+y);

    }

}
