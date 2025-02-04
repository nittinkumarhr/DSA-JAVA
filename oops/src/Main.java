public class Main {
    public static void main(String[] args) {
        pen ob1 = new pen();
        ob1.setColor("Black");
        System.out.println(ob1.color);
        ob1.setTip(24);
        System.out.println(ob1.tip);

        // Bank Object ----------
        bacnk b1 = new bacnk();
        b1.username ="Nitin";
//        b1.passwor  not accseble

        b1.setPassword("nwwwed");// set the new password


    }
}

class pen{
    String color;
    int tip;
    void setColor(String newColr){
        color = newColr;
    }
    void setTip(int Newtip){
        tip = Newtip;
    }
}
class bacnk{
    public String username;
    private  String password;

    public  void setPassword(String Pwd){
        password =Pwd;
    }
}