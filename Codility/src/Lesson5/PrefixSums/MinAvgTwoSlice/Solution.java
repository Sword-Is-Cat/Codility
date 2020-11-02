package Lesson5.PrefixSums.MinAvgTwoSlice;

class Solution {
	public int solution(int[] A) {

		int hexaAvg = (A[0] + A[1]) * 3;
		int index = 0;

		for (int i = 2; i < A.length; i++) {

			if (hexaAvg > (A[i - 1] + A[i]) * 3) {
				hexaAvg = (A[i - 1] + A[i]) * 3;
				index = i - 1;
			}
			if (hexaAvg > (A[i - 2] + A[i - 1] + A[i]) * 2) {
				hexaAvg = (A[i - 2] + A[i - 1] + A[i]) * 2;
				index = i - 2;
			}
		}
		return index;
	}
}
