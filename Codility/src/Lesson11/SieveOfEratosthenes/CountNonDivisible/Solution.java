package Lesson11.SieveOfEratosthenes.CountNonDivisible;

import java.util.HashMap;
import java.util.Map;

class Solution {
	public int[] solution(int[] A) {

		int[] result = new int[A.length];

		Map<Integer, Integer> cntMap = new HashMap<>();
		Map<Integer, Integer> resMap = new HashMap<>();

		// cntMap에 원소의 갯수를 캐싱한다
		for (int a : A) {
			if (cntMap.containsKey(a)) {
				cntMap.replace(a, cntMap.get(a) + 1);
			} else {
				cntMap.put(a, 1);
			}
		}

		// A의 배열을 돌면서 divisible한 원소의 갯수를 구하고 A.length에서 뺀 후 result배열에 담는다
		// 구한값은 resMap에 캐싱하여 반복계산을 최소화 한다
		for (int i = 0; i < A.length; i++) {

			int target = A[i];

			if (resMap.containsKey(target)) {
				result[i] = resMap.get(target);
			} else {

				int res = calculation(cntMap, target, A.length);
				result[i] = res;
				resMap.put(target, res);

			}

		}

		return result;
	}

	// 결과값을 구하는 method
	private int calculation(Map<Integer, Integer> cntMap, int target, int length) {

		// divisible한 원소 수를 count할 변수 선언
		int temp = 0;

		for (int i = 1; i * i <= target; i++) {
			if (target % i == 0) {
				if (cntMap.containsKey(i))
					temp += cntMap.get(i);
				if (i * i != target) {
					if (cntMap.containsKey(target / i))
						temp += cntMap.get(target / i);
				}
			}
		}

		return length - temp;
	}
}
