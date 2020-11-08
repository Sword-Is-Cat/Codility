package Lesson6.Sorting.MaxProductOfThree;

import java.util.Arrays;

class Solution {
	public int solution(int[] A) {

		Arrays.sort(A);

		int answer = A[0] * A[1] * A[2];

		answer = Math.max(answer, A[0] * A[1] * A[A.length - 1]);
		answer = Math.max(answer, A[0] * A[A.length - 2] * A[A.length - 1]);
		answer = Math.max(answer, A[A.length - 3] * A[A.length - 2] * A[A.length - 1]);

		return answer;

	}
}
