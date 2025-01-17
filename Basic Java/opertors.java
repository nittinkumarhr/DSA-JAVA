public class opertors{
	public static void main( String args[]){
		// perincremnts ->
		int a=12;
		int b=++a;// once's  increment then assgin
		System.out.println("Preincrements :"+ a);
		System.out.println("Preincrements :"+ b);
		// Postincrements->
		int q=12;
		int c=q++;// once's assgin the incrments 
		System.out.println("Postincrements :"+ q);
		System.out.println("Postincrements :"+ c);
		// logical opertors
		System.out.println("And :"+ ((3>2) && (1<2)));
		System.out.println("And :"+ ((3<2) && (1<2)));
		System.out.println("OR :"+ ((3>2) ||  (1>2)));
		System.out.println("Not :"+ (!(3<2)));
		System.out.println("NOt :"+ (!(3>2)));






	}
}