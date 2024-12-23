public class bubbleclass{
	public static void bubblesort(int arr[]){
		int n=arr.length;
		for (int i=0; i<n-1;i++ ) {
			for (int j=0;j<n-1-i ; j++) {
				if (arr[j]>arr[j+1]) {
					// swap code 
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			
		}
	}
	public static void printsort(int arr[]){
		for (int i=0;i<arr.length-1 ;i++ ) {
			System.out.print(arr[i] + " ");
			
		}
	}
	public static void main(String[] args) {
		System.out.println("Bubble Sort :)");
		int arr[]= {3,2,5,45,7,1,45};
		bubblesort(arr);
		printsort(arr);
		
	}
}