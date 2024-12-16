import  java.util.*;
public class subArrayKadanes{
	public static void Kadanes(int arr[]){
		int curent_sum=0;
		int max_sum=Integer.MIN_VALUE;
		for (int i=0;i<arr.length ; i++) {
			curent_sum=curent_sum+arr[i];
			if (curent_sum<0) {
				curent_sum=0;
				
			}
			 max_sum=Math.max(curent_sum,max_sum);
		}
		System.out.println("Max Sub Array Sum  :"+ max_sum);

	}
	public static void main (String args[]){
		System.out.println("Problem :- Find the Max sum of sub array  useing Kadanes Algorthims :)\n");
		int arr[]={-2,-3,4,-1,-2,1,5,-3};
		Kadanes(arr);
	}
} 