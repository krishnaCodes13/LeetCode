package codes;

//Best time to sell and buy
/*You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.*/

public class Code121 {
		public static void main(String []args) {
			int arr[] = {7,1,5,3,6,4};
			System.out.println(maxProfit(arr));
			
		} 
		
		public static int maxProfit(int profits[]) {
			int min = Integer.MAX_VALUE;
			int profit = 0;
			
			for(int i = 0; i<profits.length; i++) {
				if(min>profits[i]) {
					min=profits[i];
				}
				
				if(profit<profits[i]-min) {
					profit=profits[i]-min;
				}
			}
			return profit;
		}

}
