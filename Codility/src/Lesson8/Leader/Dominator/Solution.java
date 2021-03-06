package Lesson8.Leader.Dominator;

import java.util.HashMap;
import java.util.Map;

class Solution {
	public int solution(int[] A) {

		if (A.length == 1)
			return 0;

		int target = A.length / 2;

		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < A.length; i++) {

			int no = A[i];

			if (!map.containsKey(no))
				map.put(no, 1);
			else {
				if (map.get(no) == target)
					return i;
				else
					map.replace(no, map.get(no) + 1);
			}

		}

		return -1;
	}
}
