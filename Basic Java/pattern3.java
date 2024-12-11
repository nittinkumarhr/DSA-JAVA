public  class pattern3{
	public static void main(String args[]){
		int n=5;
		System.out.println(" Butterfly Pattern \n ===================================================== ");
		// outer loop -> First
		for(int i=1;i<=n;i++){
			// iner loop for priny the * 
			for (int j=1;j<=i ;j++ ) {
				System.out.print("* ");
			}
			// Iner loop 2 Print  the Space
			for (int j=1; j<=2*(n-i);j++ ) {
				System.out.print("  ");
			}
			// inner looop for second print the star
			for (int j=1;j<=i ;j++ ) {
				System.out.print("* ");
			}
			System.out.println();

		}
		for(int i=n;i>=1;i--){
			// iner loop for priny the * 
			for (int j=1;j<=i ;j++ ) {
				System.out.print("* ");
			}
			// Iner loop 2 Print  the Space
			for (int j=1; j<=2*(n-i);j++ ) {
				System.out.print("  ");
			}
			// inner looop for second print the star
			for (int j=1;j<=i ;j++ ) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("\n Number Pyramid  \n ===================================================== ");
		for (int i=1;i<=n ;i++ ) {
			for (int j =1;j<=n-i ;j++ ) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				System.out.print(i+" ");
			}
			System.out.println();
		}

		System.out.println("\n Palindromic Pattern   \n ===================================================== ");
		// outer loop
		for (int i=1;i<=n ;i++ ) {
			for (int j =1;j<=n-i ;j++ ) {
				System.out.print(" ");
			}

			for (int j=i;j>1 ; j--) {
				System.out.print(j);
				
			}
			for(int j=1;j<=i;j++){
				System.out.print(j);
			}
			System.out.println();
		}


	}
}