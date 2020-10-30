package Lesson5.PrefixSums.CountDiv;

class Solution {
	public int solution(int A, int B, int K) {

		int start = A % K == 0 ? A / K : A / K + 1;
		int end = B / K;

		return end - start + 1;
	}
}
