package Lesson12.EuclideanAlgorithm.ChocolatesByNumbers;

class Solution {
	public int solution(int N, int M) {
		return N/gcd(N,M);
	}
	private int gcd(int N, int M) {
		return N % M == 0 ? M : gcd(M, N % M);
	}

}
