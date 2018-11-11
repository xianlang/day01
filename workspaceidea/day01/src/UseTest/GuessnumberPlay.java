package UseTest;

import java.util.Scanner;

//猜数字小游戏
public class GuessnumberPlay {
    private  GuessnumberPlay(){};
    public static void start(){
       int randomnum =  (int)(Math.random()*100)+1;
       int count=0;
       while(true){
           Scanner sc = new Scanner(System.in);
           System.out.println("请输入你要猜的数字：");
           int  num= sc.nextInt();
           if(num >randomnum){
               System.out.println("猜大了");

           }else if(num <randomnum){

               System.out.println("猜小了");
           }else {
               System.out.println("恭喜你猜对了");
                break;
           }

       }


    }




}
