import java.util.Date;

public class Timedemo11 {
    public static void main(String[] args) {

            //获取系统时间
            Date date = new Date();
            System.out.println(date);
            //获取时间戳
            //时间戳：1970年1月1日..到此时此刻的毫秒或者秒数
            System.out.println(date.getTime());

        }
}
