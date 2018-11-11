package UseTest;

import java.io.*;

public class UseBaoIn implements UseBao {
            private static File file =    new File("use.txt");
            static {
                try{
                    file.createNewFile();
                }catch (IOException e){
                    System.out.println("创建文件失败");
                }

            }


    @Override
    public Boolean Login(String usename, String usepassworld) {
              Boolean flag = false;
        BufferedReader br = null;
        try{
            br= new BufferedReader(new FileReader("use.txt"));
           String line = null;
           /*While((line  = br.readLine())!=null){
               //用户名 = 密码
                String[] datas  = line.split("=");
                if(datas[0].equals(usename)&&datas[1].equals(usepassworld)){
                           flag = true;
                }
            }*/
           while ((line = br.readLine())!=null){
               String[]datas = line.split("=");
               if(datas[0].equals(usename)&&datas[1].equals(usepassworld)){
                      flag = true;
                      break;
               }
           }
        }catch (IOException e){
            System.out.println("用户登录失败");
        }finally {
            if(br !=null){
                try{
                    br.close();
                }catch (IOException e){
                    System.out.println("用户登录释放资源失败");
                }
            }
        }
        return flag;
    }
    @Override
    public void zhuce(Use use) {
        BufferedWriter bw = null;
        try{
            bw= new BufferedWriter(new FileWriter(file,true));
            bw.write(use.getUsename()+"="+use.getUsepassworld());
            bw.newLine();
            bw.flush();
        }catch (IOException e){

            System.out.println("用户登录失败");
        }finally {
           if(bw!=null){
                      try{
                          bw.close();
                      }catch (IOException e){
                          System.out.println("用户资源释放失败");
                      }
              }
        }


    }
}
