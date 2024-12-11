import java.util.Scanner;
public  class funclass{
	public static void HelloFun(){
		System.out.println(" Hello Function");
	}
	public static int sumCal(int a , int b){
		int sum = a+b;
		return  sum;
	}
	public static int Swap(int a , int b){
		int temp=a;
		a=b;
		b=temp;
		System.out.println("a=:"+a);
		System.out.println(" B = "+b);
		return 0;
	}
	public static int  fact(int a){
		if (a==1) {
			return a;
		}
		int sum=1;
		for (int i=1;i<=a ;i++ ) {
			sum=sum*i;

		}
		return sum;
	}
	public static void main (String args []){
		Scanner sc =new Scanner(System.in);
		System.out.println("First number :");
		int a=sc.nextInt();
		System.out.println("Second number :");
		int b=sc.nextInt();
		System.out.println( "Total : "+sumCal(a,b));
		// HelloFun(a,b);
		System.out.println(" Fact No :"+fact(a));
	}
}

