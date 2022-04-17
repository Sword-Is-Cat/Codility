package Lesson14.BinarySearchAlgorithm.MinMaxDivision;

class Solution {
	public int solution(int K, int M, int[] A) {

		int left = 0;
		int right = 0;

		for (int a : A) {
			left = Math.max(left, a);
			right += a;
		}

		left--;

		while (left + 1 < right) {

			int mid = (left + right) / 2;

			if (checkCnt(A, mid) > K)
				left = mid;
			else
				right = mid;

		}

		return right;
	}

	int checkCnt(int[] arr, int max) {

		int cnt = 0;
		int temp = 0;

		for (int no : arr) {
			if (temp + no > max) {
				cnt++;
				temp = 0;
			}
			temp += no;
		}
		if (temp > 0)
			cnt++;
		return cnt;
	}

	public static void main(String[] args) {
		System.out.println(new Solution().solution(2, 10, new int[] { 4, 4 }));
	}
}
