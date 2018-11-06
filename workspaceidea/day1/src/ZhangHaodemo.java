public class ZhangHaodemo {
    /*设计一个银行账户类，
* 其中包括：账户信息：账号、姓名、开户时间、身份证号码、账户上的金额等成员。
* 有：存款方法、取款方法、显示开户时间的方法、获得账上的金额的方法等。
	并编写测试类*/
    private String zhangHao;
    private String name;
    private String time;
    private String Id;
    private int count;


    public String getZhangHao() {
        return zhangHao;
    }

    public void setZhangHao(String zhangHao) {
        this.zhangHao = zhangHao;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    public String toString() {
        return "ZhangHao [zhaohao=" + zhangHao + ", name=" + name
                + ", time=" + time + ", idnum=" + Id + ", money="
                + count + "]";
    }
    public ZhangHaodemo(String zhangHao, String name, String time, String Id,
                    int count) {
        super();
        this.zhangHao = zhangHao;
        this.name = name;
        this.time = time;
        this.Id = Id;
        this.count = count;
    }





    public ZhangHaodemo() {
        super();
        // TODO Auto-generated constructor stub
    }

}
