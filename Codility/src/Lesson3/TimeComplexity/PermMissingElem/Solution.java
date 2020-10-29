package Lesson3.TimeComplexity.PermMissingElem;

class Solution {
	public int solution(int[] A) {

		int answer = A.length + 1;

		for (int i = 0; i < A.length; i++)
			answer += i + 1 - A[i];

		return answer;
	}
}
