package Lesson5.PrefixSums.GenomicRangeQuery;

class Solution {

	int[] arrA, arrC, arrG;

	public int[] solution(String S, int[] P, int[] Q) {

		char[] charArr = S.toCharArray();

		arrA = new int[charArr.length + 1];
		arrC = new int[charArr.length + 1];
		arrG = new int[charArr.length + 1];

		for (int i = 0; i < charArr.length; i++) {

			arrA[i + 1] = arrA[i];
			arrC[i + 1] = arrC[i];
			arrG[i + 1] = arrG[i];

			switch (charArr[i]) {
			case 'A':
				arrA[i + 1]++;
				break;
			case 'C':
				arrC[i + 1]++;
				break;
			case 'G':
				arrG[i + 1]++;
				break;
			default:
				break;
			}
		}

		int[] answer = new int[P.length];

		for (int i = 0; i < answer.length; i++)
			answer[i] = findIF(P[i], Q[i]);

		return answer;
	}

	int findIF(int P, int Q) {

		int p = Math.min(P, Q);
		int q = Math.max(P, Q)+1;

		if (arrA[p] != arrA[q])
			return 1;

		if (arrC[p] != arrC[q])
			return 2;

		if (arrG[p] != arrG[q])
			return 3;

		return 4;
	}
}
