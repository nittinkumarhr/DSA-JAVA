import  java.util.Scanner;

class stringComparessor  {

	public  static String compareserString(String str){


		StringBuilder sb = new StringBuilder("");

		for (int i=0;i<str.length() ;i++) {
			
			Integer count = 0;

			while( i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){

				count ++;
				i++;
			}
			sb.append(str.charAt(i));

			if (count > 1) {

				sb.append(count.toString());
				
			}
		}

		return sb.toString();
	}

	public static void main(String args[]){

		System.out.println("String Comparessor");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter String to Compares :-");

		String str = sc.nextLine();

		System.out.println(str + " Compares  String " + compareserString(str));






	}
	
}