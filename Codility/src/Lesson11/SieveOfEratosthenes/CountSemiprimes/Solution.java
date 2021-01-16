package Lesson11.SieveOfEratosthenes.CountSemiprimes;

import java.util.HashSet;
import java.util.Set;

class Solution {
	public int[] solution(int N, int[] P, int[] Q) {

		// 소수 목록 캐싱
		Set<Integer> primeSet = new HashSet<>();
		boolean[] isSemiPrime = new boolean[N + 1];

		for (int i = 2; i <= N / 2; i++) {
			if (isPrime(i)) {
				primeSet.add(i);
				for (int prime : primeSet)
					if (prime * i <= N)
						isSemiPrime[prime * i] = true;
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
