public class selectionclass{
		public static void selectionSort(int arr[]){
		int n=arr.length;
		for (int i=0; i<n-1;i++ ) {
			int min=i;
			for (int j=i+1;j<n; j++) {
				if (arr[min]>arr[j]) {
					// swap code 
					min= j;
					
				}
			}
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		}
	}
	public static void printsort(int arr[]){
		for (int i=0;i<=arr.length-1 ;i++ ) {
			System.out.print(arr[i] + " ");
			
		}
	}
	public static void main (String arrgs[]){
		System.out.println("Slection Sort :)");
		int arr[]={5,4,11,2,9};
		selectionSort(arr);
		printsort(arr);

	}
}