package Challenges.Silver2020;

import java.util.HashMap;
import java.util.Map;

class Solution {
	public int solution(int[] A, int[] B) {

		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < A.length; i++) {
			if (A[i] == B[i]) {
				if (map.containsKey(A[i]))
					map.replace(A[i], map.get(A[i]) + 1);
				else
					map.put(A[i], 1);
			} else {
				if (map.containsKey(A[i]))
					map.replace(A[i], map.get(A[i]) + 1);
				else
					map.put(A[i], 1);
				if (map.containsKey(B[i]))
					map.replace(B[i], map.get(B[i]) + 1);
				else
					map.put(B[i], 1);
			}
		}

		int max = 0;

		for (int key : map.keySet()) {
			max = max < map.get(key) ? map.get(key) : max;
		}

		return max;
	}
}
