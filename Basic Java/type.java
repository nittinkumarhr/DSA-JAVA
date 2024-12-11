class type{
	public static void main(String args[]){
		System.out.println("----------------Type Conversion(Narrowing / expclit) --------------------");
		float a=25.022f;
		//lossy conversion from float to int
		// int b=a;
		// System.out.println(b);	
		int b = (int) a;
		System.out.println(b); // convert in the int

		char ch='a';
		int num =ch;
		System.out.println(num);

		// byte,short,or CHar ==> int
		char ch2='a';
		char ch3='b';
		int sum =ch3+ch2;
		 System.out.println(sum);

		short q=5;
		byte w=23;
		char e='e';
		// byte bt=q+w+e;
		// Error -> possible lossy conversion from int to byte
		// System.out.println(bt);
		byte bt=(byte) (q+w+e);
		System.out.println(bt);

		// Type promotion in Expression
		// byte,short,or Char -> Int type 
		// if one operand  is long,float or double the whole expression is promoted to long ,float or double respectively.
		int ab=12;
		float bc=22.22f;
		long lc=122;
		double d=11;
		// double s= ab+bc+lc+d;
		// System.out.println(s);
		// int  s= ab+bc+lc+d;//-error: incompatible types: possible lossy conversion from double to int
		// System.out.println(s);


		// wrong -> java is convert into integer as you wish 
		byte bq=5;
		bq=bq*2;

		// right way -> 
		byte b1 =2;
		b1=(byte) (b1*2);

	}
}