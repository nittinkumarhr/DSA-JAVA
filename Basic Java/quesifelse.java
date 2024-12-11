public class quesifelse{
	public static void main(String args[]){
		int a,b,c;
		a=2;
		b=3;
		c=4;
		if (a>b && a>c){
			System.out.println("Frist is Largest ");

		}
		else if (b>a && b>c) {
			System.out.println("Second is Largest number ");
			
		}
		else{
			System.out.println("Third Largest number ");
		}
		// Ternary Opertors -> varible = conditions ? statemnts1(T) : statements (F);
		int d= (a/2==0)? a : 0 ;
		System.out.println("Divesion by :"+d);


		// Switch case 
		switch(d){
		case 0: {
			System.out.println("Data is worng");
		}
		break;
	    case 1 :{
	    	System.out.println("D is also divde by b");
	    }
	    break;
	    default : {
	    	System.out.println("So hard");
	    }

		}
	}
}
