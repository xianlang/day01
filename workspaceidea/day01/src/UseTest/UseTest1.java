package UseTest;

import java.util.Scanner;

public class UseTest1 {
    public static void main(String[] args) {
     while (true){
         //欢迎界面，给出选择项
         System.out.println("-----------欢迎光临：-------------");
         System.out.println("1：登录 "+ '\n'+" 2：注册 "+'\n'+"3：退出 " +'\n'+"请输入你的选择：");
         Scanner sc = new Scanner(System.in);
         String s = sc.nextLine();
         UseBao useBao = new UseBaoIn();

         switch (s){
             case "1":
                 System.out.println("------登陆界面----------------");
                 System.out.println("请输入用户名：");
                 String username =  sc.nextLine();
                 System.out.println("请输入密码：");
                 String passworld = sc.nextLine();

                 //调用登录功能
                 Boolean flag = useBao.Login(username,passworld);
                 if(flag){
                     System.out.println("你可以登录玩游戏了");
                     System.out.println("你玩吗？y/n");
                     while(true){
                              String s1 = sc.nextLine();
                              if(s1.equalsIgnoreCase("y")){
                                  GuessnumberPlay.start();
                                  System.out.println("你还玩吗？y/n");
                              }else{
                                  break;
                              }
                     }
                     System.out.println("谢谢使用，欢迎下次再来");
                     System.exit(0);
                 }else{
                     System.out.println("用户名或密码错误，登录失败");

                 }
                 break;
             case"2":
                 System.out.println("--------------注册界面--------");
                 System.out.println("请输入用户名：");
                 String newUsername = sc.nextLine();
                 System.out.println("请输入密码：");String newPassword = sc.nextLine();

                 Use use = new Use();

                 use.setUsename(newUsername);
                 use.setUsepassworld(newPassword);
                      useBao.zhuce(use);
                 System.out.println("注册成功");
                     break;

             case "3":
                default:
                    System.out.println("谢谢使用，欢迎下次再来");
                    System.exit(0);
                    break;
         }


     }

    }
}
