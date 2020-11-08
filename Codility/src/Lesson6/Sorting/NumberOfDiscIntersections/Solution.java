package Lesson6.Sorting.NumberOfDiscIntersections;

import java.util.Arrays;

class Solution {
	public int solution(int[] A) {

		int n = A.length;
		long[] start = new long[n];
		long[] end = new long[n];

		for (int i = 0; i < n; i++) {
			start[i] = i - (long) A[i];
			end[i] = i + (long) A[i];
		}

		Arrays.sort(start);
		Arrays.sort(end);

		int sIndex = 0;
		int answer = 0;

		for (int eIndex = 0; eIndex < n; eIndex++) {
			while (sIndex < n && start[sIndex] <= end[eIndex]) {

				answer += sIndex - eIndex;
				sIndex++;
			}
		}

		return answer > 10000000 ? -1 : answer;
	}
}
