import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class ZhangHao {
    public static void main(String[] args) {
        /*设计一个银行账户类，
* 其中包括：账户信息：账号、姓名、开户时间、身份证号码、账户上的金额等成员。
* 有：存款方法、取款方法、显示开户时间的方法、获得账上的金额的方法等。
	并编写测试类*/
            Map<String ,ZhangHaodemo> map =new HashMap<String ,ZhangHaodemo>();
            map.put("1",new ZhangHaodemo("001","张先生","2018-11-9","199x--xx-x",1000));
            map.put("2",new ZhangHaodemo("002","刘先生","2018-1-19","199x--xx-x",2000));
            map.put("3",new ZhangHaodemo("003","李先生","2016-12-9","199x--xx-x",3000));

           Scanner sc = new Scanner(System.in);
          Set<String> s = map.keySet();
          while(true) {
              System.out.println("请输入你的选择：     1：进入            2：退出");
              String choose = sc.nextLine();
                  switch (choose) {
                      case "1":
                          System.out.println("请输入密码：");
                          String key = sc.nextLine();
                          if (!map.containsKey(key)) {
                              System.out.println("你输入的密码不存在");

                          } else {
                              for (String ss : s) {
                                  if (ss.equals(key)) {
                                      while (true) {
                                          System.out.println("请输入你要做出的选择：1：存钱 2：取钱 3：显示开户时间 4：显示账户金额 5：退出");
                                          String choose1 = sc.nextLine();
                                          switch (choose1) {
                                              case "1":
                                                  System.out.println("请输入存钱金额：");
                                                  String money1 = sc.nextLine();
                                                  int money2 = map.get(key).getCount() + Integer.parseInt(money1);
                                                  map.get(key).setCount(money2);
                                                  break;
                                              case "2":
                                                  System.out.println("请输入取钱金额：");
                                                  String money3 = sc.nextLine();
                                                  int money4 = Integer.parseInt(money3);
                                                  if (money4 > map.get(key).getCount()) {
                                                      System.out.println("余额不足");

                                                  } else {
                                                      int money5 = map.get(key).getCount() - money4;
                                                      map.get(key).setCount(money5);
                                                  }
                                                  break;
                                              case "3":
                                                  System.out.println("开户时间为：" + map.get(key).getTime());
                                                  break;
                                              case "4":
                                                  System.out.println("账户余额为：" + map.get(key).getCount());
                                                  break;
                                              case "5":
                                                  System.exit(1);
                                                  break;
                                              default:
                                                  System.out.println("你输入有误，无法查询");
                                          }

                                      }
                                  }

                              }

                          }
                      case "2":
                          System.out.println("即将退出系统");
                      default:
                          System.out.println("你输入有误,无法查询");


                  }



          }

          }





}
