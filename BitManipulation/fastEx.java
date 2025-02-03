import java.util.Scanner;

public class fastEx {
    public static void  fastexp(int a,int n){
        System.out.println("Fast Exponentiation :)");
        int ans =1;
        while(n > 0){
            if ((n&1) != 0){
                ans = ans*a;

            }
            a=a*a;
            n = (n>>1);
        }
        System.out.println(ans);
    }
    public static  void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  number :) ");
        int n = sc.nextInt();
        System.out.println("Enter the power you want :)");

        int a = sc.nextInt();
        fastexp(a,n);




    }

}
