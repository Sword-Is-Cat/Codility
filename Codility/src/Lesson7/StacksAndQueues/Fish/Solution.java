package Lesson7.StacksAndQueues.Fish;

import java.util.Stack;

class Solution {
	public int solution(int[] A, int[] B) {

		Stack<Integer> stack = new Stack<>();
		int answer = 0;

		for (int i = 0; i < A.length; i++) {
			if (B[i] == 1)
				stack.add(A[i]);
			else {

				while (!stack.isEmpty()) {
					if (stack.peek() < A[i])
						stack.pop();
					else
						break;
				}
				if (stack.isEmpty())
					answer++;
			}
		}
		return answer + stack.size();
	}
}
