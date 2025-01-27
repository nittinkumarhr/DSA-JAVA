import  java.util.Scanner;

class EvenOddBit {

	public static void main (String args[]){

		Scanner sc = new  Scanner(System.in);

		System.out.println("Enter the number :");

		int n = sc.nextInt();

		if ((n & 1 )== 0) {

			System.out.println("Enven Number");
			
		}
		else {

			System.out.println("Odd Number");
		}
	}
	
}