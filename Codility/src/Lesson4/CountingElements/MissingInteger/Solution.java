package Lesson4.CountingElements.MissingInteger;

import java.util.Arrays;

class Solution {
	public int solution(int[] A) {

		Arrays.sort(A);

		int target = 1;

		for (int i = 0; i < A.length; i++) {
			if (A[i] < target)
				continue;
			else if (A[i] == target)
				target++;
			else
				return target;
		}

		return target;
	}
}
