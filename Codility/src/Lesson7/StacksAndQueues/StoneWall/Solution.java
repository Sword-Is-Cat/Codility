package Lesson7.StacksAndQueues.StoneWall;

import java.util.Stack;

class Solution {

	public int solution(int[] H) {

		Stack<Integer> stack = new Stack<>();

		int cnt = 0;

		for (int i = 0; i < H.length; i++) {

			while (!stack.isEmpty() && stack.peek() > H[i])
				stack.pop();

			if (stack.isEmpty() || stack.peek() < H[i]) {
				stack.push(H[i]);
				cnt++;
			}

		}

		return cnt;

	}
}
