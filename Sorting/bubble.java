public class bubbleclass{
	// west Case time Complexcity 
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
	// Best Case time Complexcity 
	public static void bubblesortbest(int arr[]){
		int n=arr.length;
		for (int i=0; i<n-1;i++ ) {
				boolean swaped=false;
			for (int j=0;j<n-1-i ; j++) {
				if (arr[j]>arr[j+1]) {
					// swap code  
					swaped=true;
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			if (!swaped) {	break;}
			
		}
	}
	public static void printsort(int arr[]){
		for (int i=0;i<=arr.length-1 ;i++ ) {
			System.out.print(arr[i] + " ");
			
		}
	}
	public static void main(String[] args) {
		System.out.println("Bubble Sort :)");
		int arr[]= {1,2,38,4,5,6};
		// bubblesort(arr);
		bubblesortbest(arr);
		printsort(arr);
		
	}
}