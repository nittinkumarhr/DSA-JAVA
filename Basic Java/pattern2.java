public class pattern2{
	public static void main (String args[]){
		System.out.println("Character pattern \n ====================================== ");

		char chars ='A';
		for (int i=0;i<=4 ;i++ ) {
			for (int j=0;j<=i ;j++ ) {
				System.out.print(chars);
				chars++;
			}
			System.out.println();
			
		}
		System.out.println("\n Solid  Rhombus \n ====================================== ");

		int row=5;
		int col=9;
		for (int i=1;i<=row ;i++ ) {
			for (int j=1; j<=col;j++ ) {
				if ((j>=(row-i)+1) &&( j<=(col-i)+1)){
					System.out.print("*");
				}
				else{
				System.out.print(" ");
				}
			}
			System.out.println();
			
		}
		System.out.println("\n Solid  Rhombus Second method useing loop \n ====================================== ");
		// outer loop for row 
		for (int i=0;i<row;i++){
			//inner loop for space 
			for (int j=0;j<(row-i);j++){
				System.out.print(" ");
			}
			// Inner loop for print the  star
			for (int j=0;(j<row);j++ ) {
				
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("\n Hollow  Rhombus\n ====================================== ");

		for (int i=0;i<=row;i++){

			for (int j=0;j<row-i;j++){

				System.out.print(" ");
			}
			for (int j=0;j<=row ;j++) {

				if ((i==0 || i==row) || 
					(j==0|| j==row))
				{	
				System.out.print("*");	
			}
			else{
				System.out.print(" ");
			}	
			}
			System.out.println();
		}
		System.out.println("\n Dimoand  pattern\n ====================================== ");
	int n=4;
	// FIrst half of Dimand sahpe 
	//outer loop print the  4 row 
	for (int i=1;i<=n ;i++ ) {
		//iner loop print the  space 
		for (int j=1;j<=(n-i);j++ ) {
			System.out.print(" ");
			
		}
		// Iner loop print the  star 
		for (int j=1;j<=(2*i)-1;j++ ) {
			System.out.print("*");
		}
		System.out.println();	
	}
	// Second half of dimoand 
	for (int i=n-1;i>=1 ;i--) {
		for (int j=1;j<= (n-i) ;j++ ) {
			System.out.print(" ");
			
		}
		for (int j=1;j<=(2*i)-1;j++ ) {
			System.out.print("*");
		}
		System.out.println();

		
	}



	}
}