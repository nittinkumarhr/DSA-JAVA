import java.util.*;
public  class reverseArrayKPostion{
	public static void funReverseKpostion(int arr[],int start , int end){
		int temp;
		while (start<end) {
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--	;
		}
	}
	public static void main(String arfgs[]){
		System.out.println("Problem :- Rotating an Array by K positions. :)");
		int arr[]={10,20,30,40,50,60};

		int k=2;
		int start=0;
		int end =arr.length;
		funReverseKpostion(arr,start,k-1);
		funReverseKpostion(arr,k,end-1);
		funReverseKpostion(arr,start,end-1);
		System.out.println("Reverse the Array on Postion : "+k);
		for (int i=0;i<end ;i++ ) {
			System.out.print(arr[i]+" ");

		}



	}
}