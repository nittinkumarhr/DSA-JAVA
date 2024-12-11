public class PairArray{
	public  static void pairArray(int arrr[]){
		int total_pairs=0;
		for (int i=0;i<arrr.length-1 ;i++) {
			for (int j=i+1;j< arrr.length;j++) {
				System.out.print ("("+arrr[i]+","+arrr[j]+")\t" );
				total_pairs++;
			}
		}
		System.out.println("Total Pairs :-"+total_pairs);	
	}
	public static void main(String aers[]){
		System.out.println("Problem :- Print all elements Pairs in array :) \n");
		int arrr[]={1,2,3,4};
		pairArray(arrr);

	}
}