import  java.util.Scanner;

public class OpGSC{

	public static void GetiTH(int n , int i){

		System.out.println("Get ith Value ");

		int bitmask = 1<<i;

		if ((n & bitmask) == 0) {

			System.out.println("0");
			
		}
		else{
			System.out.println("1");
		}
	}

	public  static void SetiTH( int n ,int i){

		System.out.println("Set ith Value "); 

		int bitmask = 1 <<i;

		System.out.println( n | bitmask);
	}

	public static void CleariTH(int n,int i){

		System.out.println("Clear the ith Value");

		int bitmask = ~(1<<i);

		System.out.println(n & bitmask);
	}

	public static void UpdateiTH(int n , int i, Scanner sc){

		System.out.println("Enter the Bit You want to Update :");

		int newbit = sc.nextInt();

		if(newbit == 0){

			CleariTH(n,i);
		}
		else{
			SetiTH(n,i);
		}
	}




	public static void ClearLastIthbit(int n , int i){


		System.out.println("Clear the last ith postion bit :)");
		int bitmask = (~0)<<i;

		System.out.println(n & bitmask);
	}
	public  static  void  CheckNumberPower2(int n){
		System.out.println("Check the number Power of 2 or not  -:" + n);
		if ((n & (n - 1))== 0){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	}
	public  static  void CountSetBit(int n){
		System.out.println("Count the Set bit in number :)");
		int c=0;
		int num = n;
		while (n>0){
			if ((n&1) !=0){
				c++;
			}
			n= (n>>1);
		}
		System.out.println(num +"Total  Set bit in this number "+c);
	}
	public  static  void  ClearRange(int n  ,Scanner sc){
		System.out.println("Clear the bit given range ");
		System.out.println("Enter the First range :)");
		int i = sc.nextInt();
		System.out.println("Enter the Second  range :) ");
		int j = sc.nextInt();

		int a = (~0)<<(j+1);
		int b  = (1<<i)-1;
		int bitmask =a|b;

		System.out.println(n&bitmask);
		CheckNumberPower2(n);



	}

	public static void main (String args[]){

		System.out.println("Get,Set, Clear Operation  in Bit Manupluation");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Number :\t");

		int n = sc.nextInt();

		System.out.println("Enter the ith number \t");

		int i =sc.nextInt();

		GetiTH(n,i);

		SetiTH(n,i);
		CleariTH(n,i);
		CountSetBit(n);

		UpdateiTH(n,i,sc);
		ClearLastIthbit(n,i);

		ClearRange(n,sc);




	}
}