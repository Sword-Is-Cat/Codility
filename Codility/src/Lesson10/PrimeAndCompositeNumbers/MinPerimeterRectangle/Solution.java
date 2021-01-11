package Lesson10.PrimeAndCompositeNumbers.MinPerimeterRectangle;

class Solution {
	public int solution(int N) {

		int n = (int) Math.sqrt(N);

		for (int i = n; i > 0; i--) {
			if (N % i == 0)
				return 2 * (i + (N / i));
		}

		return 0;
	}
}