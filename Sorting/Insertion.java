public class insertionclass{
	public static void insertioncsort(int arr[]){
		int n=arr.length;
		int i,j,temp;
		for (i=1;i<n;i++ ) {
			 temp =arr[i];
			for (j=i-1;j>=0;j--) {
				if (arr[j]>temp) {
					arr[j+1]=arr[j];
					
				}
				else{
					break;
				}
			}
			arr[j+1]=temp;
		}
	}

	public static void printsort(int arr[]){
		System.out.print("Sorted array : \n");
		for (int i=0;i<=arr.length-1 ;i++ ) {
			System.out.print(arr[i] + " ");
			
		}
	}



	public  static void main (String arrgs[]){
		System.out.println("Insertion Sort :)");
		int arr[]={5,4,1,2,3};
		insertioncsort(arr);
		printsort(arr);
	}
}