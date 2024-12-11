public  class pattern1{
public static void main (String[] args){
	System.out.println("Welcome to Pattern words \n");

	System.out.println("solid rectangle  star pattern \n =============================\n");
		for (int i=0;i<5 ;i++ ) {
			for (int j=0;j<5 ;j++ ) {
				System.out.print("*");	
			}System.out.println();
		}
 
	System.out.println(" Hollow rectangle \n =============================\n");
	int m=6;
	int n=20;

	for (int i=0;i<=m;i++ ) {
			for (int j=0;j<=n ;j++ ) {

				if (i==0 || i==m || 
					j==0|| j==n)
				{
				System.out.print("*");	
			}
			else{
				System.out.print(" ");
			}
			}System.out.println();
		}

	//==============================
	System.out.println("Half Pyramid \n =============================\n");
	for (int i=0;i< 5; i++){
		for (int j =0; j<i;j++){
			if (j<i){
				System.out.print("*");
			}
			else{
				System.out.print(" ");
			}
		}
		System.out.println( );
	}
	System.out.println("Half Pyramid second Methods\n =============================\n");
	for (int i=0;i< 5; i++){
		for (int j =0; j<i;j++){
				System.out.print("*");
			
		}
		System.out.println( );
	}

	System.out.println("Invertted  Pyramid \n =============================\n");
	for (int i=5;i>0; i--){
		for (int j =0; j<i;j++){
				System.out.print("*");
			
		}
		System.out.println( );
	}
	System.out.println("Invertted  Pyramid  Second methods \n =============================\n");

	for (int i=5;i> 0; i--){
		for (int j =0; j<i;j++){
			if (j<=i){// j<=i -> conditions work when I reverse(Descending ) and J (Asceinding )
				System.out.print("*");
			}
			else{
				System.out.print("  ");
			}
		}
		System.out.println( );
	}

	System.out.println("Invertted  Pyramid  Third  methods \n =============================\n");

	for (int i=0;i<=5; i++){
		for (int j=0; j<6-i;j++){
				System.out.print("*");
			
		}
		System.out.println( );
	}
	System.out.println("Invertted  Pyramid  Roted ->180\n =============================\n");
		for (int i=0;i<=5; i++){
		for (int j=0; j<=5;j++){
			if (j>=6-i){
				System.out.print("*");
			}
			else{
				System.out.print(" ");
			}
			
		}
		System.out.println( );
	}
	System.out.println("Invertted  Pyramid  Roted ->180 Second method \n =============================\n");
	for (int i=0;i<=5; i++){
		for (int j=0; j<=5-i;j++){
			
				System.out.print(" ");
		}
		for (int j=0; j<=i ;j++){
			System.out.print("*");	
		}
		System.out.println( );
	}
	System.out.println("Half Pyramid with Number \n =============================\n");
	for (int i=0;i< 5; i++){
		for (int j =0; j<i;j++){
				System.out.print(j+1);
			
		}
		System.out.println( );
	}
	System.out.println("Invertted  Pyramid  Number methods \n =============================\n");

	for (int i=5;i> 0; i--){
		for (int j =0; j<i;j++){
			if (j<=i){// j<=i -> conditions work when I reverse(Descending ) and J (Asceinding )
				System.out.print(j+1);
			}
			else{
				System.out.print("  ");
			}
		}
		System.out.println( );
	}

	System.out.println("Floyd triangle \n =============================\n");
	int num=1;
	for (int i=0;i<5; i++){
		for (int j =0; j<=i;j++){
			System.out.print(num + " ");
			num++;
		}
		System.out.println( );
	}







	}
}