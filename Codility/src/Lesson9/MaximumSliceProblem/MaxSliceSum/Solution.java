package Lesson9.MaximumSliceProblem.MaxSliceSum;

class Solution {
	public int solution(int[] A) {

		long max = Integer.MIN_VALUE;
		long min = 0;
		long sum = 0;

		for (int i = 0; i < A.length; i++) {
			sum += A[i];
			max = Math.max(max, sum - min);
			min = Math.min(min, sum);
		}
		return (int)max;
	}
}
