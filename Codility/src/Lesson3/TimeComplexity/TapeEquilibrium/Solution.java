package Lesson3.TimeComplexity.TapeEquilibrium;

class Solution {
	public int solution(int[] A) {

		int sum = 0;

		for (int i = 0; i < A.length; i++)
			sum += A[i];

		int min = Integer.MAX_VALUE;

		for (int i = 0; i < A.length-1; i++) {
			sum -= 2 * A[i];
			min = Math.min(min, Math.abs(sum));
		}

		return min;
	}
}
