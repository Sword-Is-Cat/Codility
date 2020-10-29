package Lesson4.CountingElements.MaxCounters;

class Solution {
	public int[] solution(int N, int[] A) {

		int[] arr = new int[N];
		boolean[] isNew = new boolean[N];
		int fix = 0;
		int max = 0;
		int index = 0;

		for (int i = 0; i < A.length; i++) {

			index = A[i] - 1;

			if (index < N) {

				if (isNew[index]) {

					arr[index]++;
					max = Math.max(max, arr[index]);

				} else {

					isNew[index] = true;
					arr[index] = fix + 1;
					max = Math.max(max, arr[index]);

				}

			} else {

				isNew = new boolean[N];
				fix = max;

			}

		}

		for (int i = 0; i < arr.length; i++) {
			if (!isNew[i]) {
				arr[i] = fix;
			}
		}

		return arr;
	}
}
