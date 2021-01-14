package Lesson11.SieveOfEratosthenes.CountNonDivisible;

class Solution {
	public int[] solution(int[] A) {

		int[] result = new int[A.length];

		for (int i = 0; i < A.length - 1; i++) {
			for (int j = i + 1; j < A.length; j++) {
				if (A[i] % A[j] != 0)
					result[i]++;
				if (A[j] % A[i] != 0)
					result[j]++;
			}
		}

		return result;
	}
}
