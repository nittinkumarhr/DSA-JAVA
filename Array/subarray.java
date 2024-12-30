 public  class subarray{


 	public static void SubArray(int arr[]){
 		int total_sub_array=0;
 		for (int i=0;i<=arr.length;i++ ) {
 			int start=i;
 			for (int j=i;j<=arr.length; j++) {
 				int end=j;
 				int total_sum=0;
 				total_sub_array++;
 				for (int k=start;k<end ;k++ ) {
 					System.out.print(arr[k]+" ");
 					total_sum=total_sum+arr[k];
 				}
 				if (total_sum !=0) {
 					System.out.println(" \t  =  Total Sum Of Sub Array : "+total_sum);
 					
 				}
 				
 				// System.out.println();
 			}
 			System.out.println();
 		}
 		System.out.println(" TOtal Sub Array :)"+total_sub_array);
 	}

 	public static void max_sum_subArray(int arr[]){
 		int max_sum=0; 
 		int curent_sum=0;
 		for (int i =0;i<=arr.length ;i++ ) {
 			int start =i;
 			for (int j =i;j<=arr.length ;j++ ) {
 				int end =j;
 				curent_sum=0;
 				for (int k=start;k<end ;k++ ) {
 					// sub array sum 
 					curent_sum += arr[k];
 				}
 				// System.out.println(curent_sum);
 				if (max_sum<curent_sum) {
 					max_sum=curent_sum;
 				}
 			}
 		}
 		System.out.println("Max Sum Of Sub Array :- "+max_sum);
 	}


 	public  static void main (String aers[]){
 		System.out.println(" Problem 1  :- Print the Sub Arrays in array (A continuous part of array)  :)\n");
 		int arr[]={1,2,3};
 		SubArray(arr);
 		System.out.println(" Problem 2   :- Print the Max Sum of  Sub Arrays in array (A continuous part of array)  :)\n");
 		max_sum_subArray(arr);

 	}
 }
