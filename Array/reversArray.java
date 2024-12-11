import  java.util.*;
public  class reverse{
	public static void  reverseArray(int arr[]){
		// two pointer
		int start=0;
		int end =arr.length-1;
		while (start<end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=arr[start];
			start++;
			end--;
			
		}

	}
	public static void main(String args []){
		System.out.println("Problem :- Reverse the array Useing two pointer :)\n");
		int arr[]={12,34,22,55,12,6,87,98,3};
		System.out.println("Before reverse the  array \n");
		for (int i=0;i<arr.length;i++ ) {
			System.out.print(arr[i]+"  \t");
		}
		reverseArray(arr);
		System.out.println("\n  Reverse  array : \n");
		for (int i=0;i<arr.length;i++ ) {
			System.out.print(arr[i]+"  \t");
		}
	}
}