import  java.util.*;
public  class diagonalsum {
	public static int DiagonalSum(int arr[][]){
		int n=arr.length;
		int sum=0;
		for(int i=0;i<n;i++){
			sum += arr[i][i];
			// Secondary  Diagnoal Matrix ;
			if(i!= arr[i][n-1-i]){
				sum += arr[i][n-1-i];

			}
		}

		return sum;


	}
	public static void main(String args[]){
		System.out.println("Problem : Calculate the Diagonal Sum of 2D martix :)");
		int arr[][]={
			{1,2,3,4},
			{5,6,7,8},
			{9,10,11,12},
			{13,14,15,16}
		};
		System.out.println("Sum of Diagonal Elements  matrix :\t"+DiagonalSum(arr));

	}
}