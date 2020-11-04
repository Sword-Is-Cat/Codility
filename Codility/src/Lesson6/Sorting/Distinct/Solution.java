package Lesson6.Sorting.Distinct;

import java.util.Arrays;

class Solution {
	public int solution(int[] A) {

		if (A.length == 0)
			return 0;

		Arrays.sort(A);

		int cnt = 1;
		int temp = A[0];

		for (int i = 0; i < A.length; i++)
			if (A[i] == temp)
				continue;
			else {
				cnt++;
				temp = A[i];
			}

		return cnt;
	}
}
