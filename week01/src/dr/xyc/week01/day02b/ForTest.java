package dr.xyc.week01.day02b;
/** */
public class ForTest {
    public static void main(String[] args) {

        int s1=1;
        int s2=1;
        int s3=0;

        for (int i = 1; i < 1000; i++) {
            if(i==1){
                System.out.print(s1+",");
            }else if(i==2){
                System.out.print(s2+",") ;  }else{
            s3=s2+s1;
            s1=s2;
            s2=s3;
            if(s3>=1000){
                break;
            }
            System.out.print(s3+",");}


        }
    }
}

