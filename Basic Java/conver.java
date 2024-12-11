import  java.util.Scanner;
public class conver{
	public static void BinTODec(int n){
		int p=0;
		int decnum=0;
		while(n>0){
			int LD=n%10;
			decnum=decnum +(int) (LD*Math.pow(2,p));
			p++;
			n=n/10;
		}
		System.out.println("Decimal Number is : "+decnum);
	}
	public static void DecTOBin(int n){
		int p=0;
		int binnum=0;
		while(n>0){
			int LD= n%2;
			binnum=binnum+ (int)(LD*Math.pow(10,p));
			p++;
			n=n/2;
		}
		System.out.println("Binary Number "+binnum);
	}
	public static  void  main(String args[]){
		System.out.println("Binary to Decimal");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Binary number : ");
		int BinNUm= sc.nextInt();
		BinTODec(BinNUm);
		System.out.println("Enter the Decimal number : ");
		int DecNum=sc.nextInt();
		DecTOBin(DecNum);



	}
}