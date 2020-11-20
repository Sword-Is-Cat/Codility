package Lesson9.MaximumSliceProblem.MaxDoubleSliceSum;

class Solution {
    public int solution(int[] A) {
    	
    	int[] sum = new int[A.length];
    	sum[0] = A[0];
    	
    	for(int i = 1 ; i<A.length;i++) {
    		sum[i] = sum[i-1]+A[i];
    	}
    	
    	int temp1 = Integer.MIN_VALUE;
    	int temp2 = Integer.MIN_VALUE;
    	int temp3 = Integer.MIN_VALUE;
    	
    	for(int i = 0 ; i<A.length-2 ; i++) {
    		temp1 = Math.max(temp1, -sum[i]);
    		temp2 = Math.max(temp2, temp1-A[i+1]);
    		temp3 = Math.max(temp3, temp2+sum[i+1]);
    	}
    	
    	return temp3;
    }
}
