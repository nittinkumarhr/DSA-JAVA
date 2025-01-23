import  java.util.Scanner;

class FLS {

	public static void funStringLargest(String str ,String arr[]){

		String largest = str ;

		for (int i=0;i< arr.length ; i++) {

			int res = largest.compareTo(arr[i]);

			if (res<0) {

				largest = arr[i];
			}
			else if (res == 0) {

				System.out.println("Both string is equal ");
				
			}

			
		}
		System.out.println(" largest String "+ largest);

}
	public static void main (String args []){

		System.out.println("Problem :- For given set of String ,print the largest string :)");

		Scanner sc = new Scanner(System.in);

		String  arrs[] ={"Apple","Banana","Dates","Mango"};

		System.out.println("Enter the fruits name to find big string :)");

		String serach = sc.nextLine();

		funStringLargest(serach, arrs);




	}
}