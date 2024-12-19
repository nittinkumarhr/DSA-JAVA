import  java.util.*;
public  class trapWaterArray{
	public static void CalTrapWater(int height[]){
		int trapWater=0;
		int n=height.length;// lenght of array
		// Calculate the left max Boundary 
		int MaxLeft[] =new int[n];
		MaxLeft[0]=height[0];
		for(int i=1;i<n;i++){
			MaxLeft[i]=Math.max(height[i],MaxLeft[i-1]);
		}
		// Calculate the  Right  max Boundary 
		int MaxRight[]=new int[n];
		MaxRight[n-1]=height[n-1];
		for (int i=n-2; i>=0;i-- ) {
			MaxRight[i]=Math.max(height[i],MaxRight[i+1]);
		}
		//loop to Callculate total trap water ;
		for (int i=0;i<n ;i++ ) {
			
			int WaterLevel= Math.min(MaxRight[i],MaxLeft[i]);
			trapWater += (WaterLevel - height[i]);
		}
		System.out.println("Total Trap Water in Bar :) "+trapWater);

	}
	public  static void main(String args[]){
		System.out.println(" Problem :- Trap the water in  bar and calculate the total trap water in bar :) \n");
		int arr[]={4,2,0,6,3,2,5};
		CalTrapWater(arr);

	}
}