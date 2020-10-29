package Lesson4.CountingElements.PermCheck;

class Solution {
	public int solution(int[] A) {

		boolean[] arr = new boolean[A.length];

		for (int i = 0; i < A.length; i++) {

			if (A[i] > A.length || A[i] < 1)
				return 0;
			else if (arr[A[i] - 1])
				return 0;
			else
				arr[A[i] - 1] = true;

		}

		return 1;
	}
}
