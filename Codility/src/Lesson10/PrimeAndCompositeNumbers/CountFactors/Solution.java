package Lesson10.PrimeAndCompositeNumbers.CountFactors;

class Solution {
	public int solution(int N) {

		int cnt = 1;
		int n = N;
		for (int i = 2; i <= Math.sqrt(N); i++) {

			int temp = 0;
			while (n % i == 0) {
				temp++;
				n /= i;
			}
			cnt *= temp + 1;
			temp = 0;

			if (n == 1)
				break;

		}

		if (n != 1)
			cnt *= 2;

		return cnt;
	}
}
