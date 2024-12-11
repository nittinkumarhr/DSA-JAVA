import  java.util.*;
public class arrSL{
	public  static void Checkarray(int arr[]){
	int smaller=arr[0];
	int largest=arr[0];
	for (int i=0;i<arr.length ;i++ ) {
		if (largest<arr[i]) {
			largest=arr[i];
		}
		else if (smaller>arr[i]) {
			smaller=arr[i];
		}
	}
	System.out.println("Smaller item in Array :"+smaller);
	System.out.println("largest item in Array :"+ largest);
	return ;
}
	public static void main (String args[]){
		System.out.println(" Problem :- it is find smaller and largest elements in the array :)");
		int arr[]={12,44,66,3,224,55,7,32,556,888,300000,2222,4,5,6,71,2};
		Checkarray(arr);
	}
}
