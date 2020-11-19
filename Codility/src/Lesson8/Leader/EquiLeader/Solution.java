package Lesson8.Leader.EquiLeader;

import java.util.HashMap;
import java.util.Map;

class Solution {
	public int solution(int[] A) {

		if (A.length == 1)
			return 0;

		Map<Integer, Integer> map = new HashMap<>();
		int leader = 0;
		int target = A.length / 2;
		boolean found = false;

		for (int i = 0; i < A.length; i++) {

			int no = A[i];
			if (!map.containsKey(no))
				map.put(no, 1);
			else {
				if (map.get(no) == target) {
					leader = no;
					found = true;
				}

				map.replace(no, map.get(no) + 1);
			}
		}

		if (!found)
			return 0;

		int cntEquiLeader = 0;
		int totalLeaderCnt = map.get(leader);
		int leaderCnt = 0;

		for (int i = 0; i < A.length - 1; i++) {

			if (A[i] == leader)
				leaderCnt++;

			if (leaderCnt * 2 > i + 1 && (totalLeaderCnt - leaderCnt) * 2 > A.length - i - 1)
				cntEquiLeader++;
		}

		return cntEquiLeader;
	}
}
