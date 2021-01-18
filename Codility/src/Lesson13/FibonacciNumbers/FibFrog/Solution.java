package Lesson13.FibonacciNumbers.FibFrog;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
	public int solution(int[] A) {

		int goal = A.length;

		Map<Integer, Set<Integer>> dp = new HashMap<>();
		Set<Integer> fiboSet = new HashSet<>();

		// goal 이하의 피보나치 수열이 담긴 set 작성
		int pre = 0;
		int nex = 1;
		int temp = 0;

		while (nex <= goal+1) {
			fiboSet.add(nex);
			temp = pre;
			pre = nex;
			nex = nex + temp;
		}

		//dp초기값 0번점프 시 가능한 위치목록 = {-1} 셋팅
		dp.put(0, new HashSet<>());
		dp.get(0).add(-1);

		int jump = 0;
		
		//종료조건 - 해당 점프수에 위치할 수 있는 point가 없으면 종료
		while (dp.get(jump++).size() > 0) {

			dp.put(jump, new HashSet<>());

			//이전 점프횟수에서 가능한 위치값 + 피보나치수열 = 이번점프에서 가능한 위치값
			for (int position : dp.get(jump - 1)) {
				for (int fiboNo : fiboSet) {

					int nextPosition = position + fiboNo;

					if (nextPosition < goal && A[nextPosition] == 1) {
						dp.get(jump).add(nextPosition);
					}else if(nextPosition == goal) {
						return jump;
					}
				}
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		//int[] q = { 0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0 };
		int[] q = { 0,0,0,0,0,0,0 };

		Solution sol = new Solution();
		System.out.println(sol.solution(q));
	}
}
