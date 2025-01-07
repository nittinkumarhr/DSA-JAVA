import java.util.*;
class  spiralMatrix{
	public static void SpearilMatirx(int arr[][]){
		// find row and column 
		int st_row=0;
		int en_row=arr.length-1;
		int st_col=0;
		int en_col=arr[0].length-1;
		System.out.println("length of row :"+en_row +" length of cloumn : "+en_col);
		while( st_row<=en_row && st_col <=en_col){
			// top  row
			for (int j=st_col;j<=en_col ;j++ ) {
				System.out.print(arr[st_row][j] +"  ");
			}
			// right 
			for (int i=st_row+1;i<=en_row ;i++ ) {
				System.out.print(arr[i][en_col]+"  ");
			}
			// bottom 
			for (int j=en_col-1;j>=st_col ;j-- ) {
				if (st_row== en_row) {
					break;
				}
				System.out.print(arr[en_row][j]+"  ");
				
			}
			// left
			for(int i=en_row-1;i>=st_row;i--){
				if (st_col== en_col) {
					break;

				}
				System.out.print(arr[i][st_col]+" ");
			}
			System.out.println();
			st_row++;
			st_col++;
			en_col--;
			en_row--;
		}\

	}

	
	public static void main(String args[]){
		System.out.println(" Problem :- slove the Spiral  Problem ");
		int arr[][]={
			{1,2,3,4},
			{5,6,7,8},
			{9,10,11,12},
			{13,14,15,16}};

		SpearilMatirx(arr);
	}
}