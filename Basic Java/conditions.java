import java.util.*;
public class conditions{
	public static void main(String args[]){
		// int age=23;
		// if (age>18){
		// 	System.out.println("YOung");
		// }
		// else if (age<18) {
		// 	System.out.println("child");
		// }
		// else{
		// 	System.out.println("Old");
		// }

		// tax calculator

		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Income :\n");
		int income=sc.nextInt();
		int tax;
		if ((income>=500000) && (income<=100000)){
			tax=(int)(income*0.2);
		}
		else if (income<500000) {
			tax=0;
		}
		else{
			tax=(int) (income*0.3);
		}
		System.out.println("Tax:"+tax);

		}
		

 	
		
	}
