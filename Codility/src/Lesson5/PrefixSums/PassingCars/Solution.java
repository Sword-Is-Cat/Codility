package Lesson5.PrefixSums.PassingCars;

class Solution {
	public int solution(int[] A) {

		int[] sumArr = new int[A.length];
		int sum = 0;

		for (int i = 0; i < A.length; i++) {
			sum += A[i];
			sumArr[i] = sum;
		}

		int answer = 0;

		for (int i = 0; i < A.length; i++) {
			if (A[i] == 0)
				answer += sum - sumArr[i];
			if (answer > 1000000000)
				return -1;
		}

		return answer;
	}
}
