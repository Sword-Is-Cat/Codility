package Lesson11.SieveOfEratosthenes.CountSemiprimes;

import java.util.HashSet;
import java.util.Set;

class Solution {
	public int[] solution(int N, int[] P, int[] Q) {

		// 소수 목록 캐싱
		Set<Integer> primeSet = new HashSet<>();

		for (int i = 2; i <= N / 2; i++) {
			if (isPrime(i)) {
				primeSet.add(i);
			}
		}

		// 소수x소수 여부를 저장
		boolean[] isSemiPrime = new boolean[N + 1];

		for (int i = 4; i <= N; i++) {
			for (int prime : primeSet) {
				if (i % prime == 0 && primeSet.contains(i / prime))
					isSemiPrime[i] = true;
			}
		}

		int[] cntSemi = new int[N + 1];

		for (int i = 1; i <= N; i++) {
			if (isSemiPrime[i])
				cntSemi[i] = cntSemi[i - 1] + 1;
			else
				cntSemi[i] = cntSemi[i - 1];

		}

		int[] result = new int[P.length];

		for (int i = 0; i < result.length; i++) {
			result[i] = cntSemi[Q[i]] - cntSemi[P[i] - 1];
		}

		return result;
	}

	private boolean isPrime(int target) {

		if (target == 2 || target == 3)
			return true;

		for (int i = 2; i * i <= target; i++) {
			if (target % i == 0)
				return false;
		}

		return true;
	}

}
