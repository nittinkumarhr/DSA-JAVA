import  java.util.Scanner;

class firstCharUpper  {

	public static String ToupperCaseFind( String str)
	{
		StringBuilder sb = new StringBuilder("");

		char ch = Character.toUpperCase(str.charAt(0));

		sb.append(ch);

		for (int i=1;i<str.length();i++) {

			if (str.charAt(i) == ' ' && i<str.length()-1 ) {
				// add the white pace in String  builder 
				sb.append(str.charAt(i));

				i++;

				// charcter convert into uper case 

				sb.append(Character.toUpperCase(str.charAt(i)));
			}
			else{

				sb.append(str.charAt(i));
			}
			
		}

		return sb.toString();

	}

	public static void main(String args[]){

		System.out.println("Print the first char in given string captial:)");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the string :)");

		String  str =sc.nextLine();

		System.out.println("Every words first latter  Upper Case :- "+ToupperCaseFind(str));


	}
	
}