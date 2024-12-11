import  java.util.*;
public  class binaryfun{
	public static int BinarySearch(int arr[],int item){
		int start=0;
		int end =arr.length-1;
		while (start<end) {
			int mid= (start + end)/2;
			if (arr[mid]==item) {
				return mid;
			}
			else if (arr[mid]<item) {
				start=mid+1;
			}
			else if (arr[mid]>item) {
				end=mid-1;
			}
		}
		return -1;
	}
	public  static void main (String args[]){
		System.out.println(" Problem  :- Binary search  :)" );
		int arr[]={1,2,3,4,5,6,7,8,9,10};
		int item=12;
		System.out.println(" data status :"+ BinarySearch(arr,item));


	}
}