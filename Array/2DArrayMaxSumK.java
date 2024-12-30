import  java.util.*;

public  class Darray{
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
	public static int  MaxSumSubArray(int arr[][]){
		int maxSum = Integer.MIN_VALUE;
		int CurSum=0;
		int m=arr.length;
		int n= arr[0].length;
		for (int i=0;i<m ;i++ ) {
		for (int j=0;j<n;j++ ) {
			CurSum= CurSum +arr[i][j];
			if (CurSum<0) {
				CurSum=0;
			}
			maxSum=Math.max(CurSum, maxSum);
		}
	}
	return maxSum;
	}

	public static void main (String args[]){

		System.out.println(" Problem :- Find the Max Sum of Sub 2D array :)\n");

		Scanner sc = new Scanner(System.in);

		System.out.println(" Enter the Row  :");
		int row =sc.nextInt();

		System.out.println(" Enter the Column : ");
		int column =sc.nextInt();

		int matrix [][] = new int [row][column];
		twoDMatrix(matrix ,sc);

		System.out.println("Max Sum of Sub 2 D Array :"+MaxSumSubArray(matrix));

	}
}