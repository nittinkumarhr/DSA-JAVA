import  java.util.*;
public class StockPrice{
	public static int StockProfit(int prices[]){
		int buyPrice=Integer.MAX_VALUE;
		int MaxProfit=0;
		for(int i=0;i<prices.length;i++){//profit
			if (buyPrice<prices[i]) {
				int profit=prices[i] - buyPrice;// Today's Profit 

				MaxProfit=Math.max(MaxProfit,profit);//  Global Profit 
			}
			else{
				 buyPrice=prices[i];

			}

		}d
		return MaxProfit;
	}
	public static void main(String args[]){
		System.out.println("Problem :- Buy and Shell Stocks  calculate TOtal profit :)\n");
		int  arr[]={7,1,5,3,6,4};
		System.out.println("Total Profit :) "+StockProfit(arr));
	}
}
