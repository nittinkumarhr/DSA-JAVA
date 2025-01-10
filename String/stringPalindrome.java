import  java.util.Scanner;

public  class Strings{

	 public static boolean checkpalindrome( String str){
	 	int i=0;
	 	int j=str.length()-1;
	 	while(i<j){
	 		if (str.charAt(i)  !=  str.charAt(j)) {
	 			return false;
	 			// break;
	 		}
	 		i++;
	 		j--;

	 	}
	 	return true;

	 }

	public static void main (String as[]){
		System.out.println("Problem :- Check the a String is a palindrome :)\n");

		Scanner sc = new Scanner(System.in);

		String str;

		System.out.println("Enter the String (You want to check palindrome ) \t  :");

		str=sc.nextLine();
		System.out.println("String  is palindrome  return - true / flase :"+ checkpalindrome(str));
	}
}