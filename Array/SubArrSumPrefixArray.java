public class SubArraySumPreifxArray{

	public static void Max_Sum_sub_Array(int arr[]){
		int curr_sum=0;
		int max_sum=0;
		int Prefix_array[]=new int[arr.length];
		Prefix_array[0]=arr[0];
		for (int i=1;i<Prefix_array.length ;i++ ) {
			Prefix_array[i]=Prefix_array[i-1]+arr[i];
		}
		for (int i=0;i<arr.length ;i++ ) {
			int start=i;
			for (int j=i;j<arr.length ;j++ ) {
				int  end=j;
				if (curr_sum==0) {
				   curr_sum  =	Prefix_array[end];
				}
				else{
					if (i ==0) {
						curr_sum=Prefix_array[j] ;
					 	
					 } 
					 else{
					 	curr_sum = Prefix_array[j] - Prefix_array[i - 1];
					 	System.out.println("Prefix_array [i-1] :"+Prefix_array[i - 1]);
					 }

				}

				if (max_sum<curr_sum) {

					max_sum=curr_sum;
				}
			}

		}
		System.out.println("Max Sum  of Sub Array : - "+max_sum);
	}
	public static void main (String args[]){
		System.out.println(" Problem :- Max Sum of Sub array  Useing Preifx method :)\n ");
		int arr[]={4,5,6,7,8};
		Max_Sum_sub_Array(arr);

	}
}