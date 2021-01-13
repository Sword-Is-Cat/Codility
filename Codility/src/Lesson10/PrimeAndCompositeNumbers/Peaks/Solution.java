package Lesson10.PrimeAndCompositeNumbers.Peaks;

class Solution {
	public int solution(int[] A) {

		boolean[] peaks = new boolean[A.length];
		int peakCnt = 0;

		for (int i = 1; i < A.length - 1; i++) {
			if (A[i - 1] < A[i] && A[i] > A[i + 1]) {
				peaks[i] = true;
				peakCnt++;
			}
		}

		if (peakCnt < 2)
			return peakCnt;

		return process(peaks, peakCnt);
	}

	int process(boolean[] peaks, int peakCnt) {

		// peakCnt 조각으로 Array를 잘랐을때 조건 만족하는지 확인하고 만족하면 return 한다
		// 만족하지 못한경우 peakCnt 감소시킨 후 재확인
		for (int i = peakCnt; i > 0; i--) {

			// --i조각으로 Array를 자를수 있는지 확인
			if (peaks.length % i == 0) {

				// Array를 i 조각으로 잘랐을때 만족하는가?
				for (int j = 0; j < i; j++) {

					boolean isValid = true;

					// 첫번째 조각부터 boolean 배열에 true가 있다면 pass, true가 없다면 i를 감소시킨다
					for (int k = 0; k < peaks.length / peakCnt; k++) {

						if (peaks[j * (peaks.length / peakCnt) + k])
							break;
						else if (k + 1 == peaks.length / peakCnt)
							isValid = false;
					}

					if (!isValid)
						break;

					if (j + 1 == i)
						return i;
					// i조각으로 잘랐을때 fin
				}
			} // --i조각
		}

		return 0;
	}
}
