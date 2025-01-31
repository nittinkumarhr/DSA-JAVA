import  java.util.*;

class Darray{
	public static void twoDMatrix(int matrix[][], Scanner sc){

		int m= matrix.length;
		int n= matrix[0].length;
		System.out.println(" Enter the Elements in 2-D  matrix "+m + "X" + n);
		for (int i=0;i<m ;i++ ) {
			for (int j=0;j<n ;j++ ) {
				matrix[i][j] = sc.nextInt();
			}
		}

	}
	public static void print2D(int matrix[][] ){

		int m= matrix.length;
		int n= matrix[0].length;
		System.out.println(" Print  the Elements in 2-D  matrix "+m + "X" + n);
		for (int i=0;i<m ;i++ ) {
			for (int j=0;j<n ;j++ ) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.print("\n");
		}

	}

	public static String Search2D(int matrix[][] , Scanner sc){
		System.out.println(" Enter the Item you want to Search  :");
		int item =sc.nextInt();
		int m= matrix.length;
		int n= matrix[0].length;
		System.out.println(" Search  the Element in 2-D  matrix "+m + "X" + n);
		for (int i=0;i<m ;i++ ) {
			for (int j=0;j<n ;j++ ) {
				if (matrix[i][j] == item){
					return (" Item is found at ("+i +","+j+") Location" );
					
				}
			}
			System.out.print("\n");
		}
		return "-1";


	}
	public static void main (String args[]){
		System.out.println(" 2D Array creates and Search the Elements :)\n");


		Scanner sc = new Scanner(System.in);


		System.out.println(" Enter the Row  :");
		int row =sc.nextInt();

		System.out.println(" Enter the Column : ");
		int column =sc.nextInt();

		int matrix [][] = new int [row][column];


		twoDMatrix(matrix ,sc);
		print2D(matrix);
		System.out.println(" Serach Results :"+ Search2D(matrix,sc));
	}
}