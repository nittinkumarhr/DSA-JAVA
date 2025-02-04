public class gettersetter {
    public static void main(String args[]){

        Bank ob1 = new Bank();
        ob1.setusername("nitin");
        ob1.setPwd("123455");
        System.out.println("Username"+ ob1.getUsername()+"\nPassword "+ob1.getPwd());
    }
}
class  Bank{
    private  String username ;
    private  String pwd;

    // make get function
    public String getUsername (){
        return this.username;
    }
    public String getPwd (){
        return this.pwd;
    }
    // set the value
    void  setusername(String username){
        this.username =username;
    }
    void  setPwd(String pwd){
        this.pwd =pwd;
    }
}
