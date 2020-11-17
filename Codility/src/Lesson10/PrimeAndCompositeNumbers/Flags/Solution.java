package Lesson10.PrimeAndCompositeNumbers.Flags;

import java.util.ArrayList;
import java.util.List;

class Solution {
	public int solution(int[] A) {

		List<Integer> peakList = new ArrayList<Integer>();

		// peak이되는 index의 list를 생성
		for (int i = 1; i < A.length - 1; i++) {
			if (A[i - 1] < A[i] && A[i] > A[i + 1]) {
				peakList.add(i);
			}
		}

		// peak의 개수가 0,1,2개이면 모든 peak에 깃발을 꼽을 수 있다
		int peakCnt = peakList.size();

		if (peakCnt < 3)
			return peakCnt;

		// 마지막peak의 위치 - 첫peak의 위치 = 첫깃발과 마지막깃발 사이의 거리
		int distance = peakList.get(peakCnt - 1) - peakList.get(0);

		// 깃발수 flagCnt 에 대해 flagCnt(flagCnt-1) <= distance 이므로 역산하여 flagCnt의 최대값을 구한다
		// n^2 - n <= d
		// -> n^2 -n +0.25 (= (n-0.5)^2 ) <= d + 0.25
		// -> n-0.5 <= sqrt(d+0.25)
		// -> n <= sqrt(d+0.25)+0.5
		int flagCnt = (int) (Math.sqrt(distance + 0.25D) + 0.5D);

		// 깃발수의 최대값부터 감소하며 해당 갯수의 깃발을 꼽을 수 있는지 확인한다
		for (int i = flagCnt; i > 0; i--) {
			int result = vaildCnt(peakList, peakCnt, i);
			if (result > 0)
				return result;
		}

		return 0;
	}

	// 해당 자료구조에 있는 peak목록에 flags개의 깃발을 꼽을 수 있는지 구하는 method
	// 꼽을 수 있다면 깃발 수를 리턴, 꼽을 수 없다면 0 리턴
	int vaildCnt(List<Integer> list, int length, int flags) {

		// lastFlag는 현재 가장 마지막에 꽂은 깃발의 위치. 첫 peak의 index에 관계없이 꽂을 수 있도록 -flags로 초기화
		int lastFlag = -flags;
		// 지금까지 꽂은 깃발수를 tracking하는 변수
		int cnt = 0;
		int peak;

		for (int i = 0; i < length; i++) {
			peak = list.get(i);

			if (lastFlag + flags <= peak) {
				cnt++;
				lastFlag = peak;
			}

			if (cnt == flags)
				return flags;
		}

		return 0;
	}
}
