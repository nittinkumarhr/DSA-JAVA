import  java.util.*;
public  class countingsort{
	public static void countsort(int arr[]){
		int largest=Integer.MIN_VALUE;
		// find the  maxium rgange of  in the elemnts 
		for (int i=0;i<arr.length ;i++ ) {
			largest= Math.max(largest,arr[i]);
		}
		// make a count (size - largest elemnts of array )  and count the frequnce of elemnts  in the array 
		int count[]=new int [largest+1];
		for (int i=0;i<arr.length ;i++ ) {
			count[arr[i]]++;
		}
		//sort the array  
		int temp=0;
		for (int i=0;i<count.length ;i++ ) {
			while (count[i]>0) {
				arr[temp]=i;
				temp++;
				count[i]--;
			}
		}
	}

	public static void printsort(int arr[]){
		System.out.print("Sorted array : \n");
		for (int i=0;i<=arr.length-1 ;i++ ) {
			System.out.print(arr[i] + " ");
			
		}
	}
	public static void main (String args[]){
		System.out.print(" Counting Sort :- it is best on small range of array :)\n");
		int arr[] = { 1,4,3,2,4,7};
		countsort(arr);
		printsort(arr);
	}
}