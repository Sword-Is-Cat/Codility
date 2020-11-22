package Lesson9.MaximumSliceProblem.MaxProfit;

class Solution {
    public int solution(int[] A) {
    	
    	if(A.length==0)
    		return 0;
    	
    	int buyingPrice = Integer.MAX_VALUE;
    	int profit = Integer.MIN_VALUE;
    	
    	for(int i = 0 ; i<A.length ; i++) {
    		buyingPrice = Math.min(buyingPrice, A[i]);
    		profit = Math.max(profit, A[i]-buyingPrice);
    	}
    	
    	return profit;
    }
}
