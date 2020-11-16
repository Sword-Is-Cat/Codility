package Lesson7.StacksAndQueues.Nesting;

import java.util.Stack;

class Solution {
	public int solution(String S) {

		Stack<Character> stack = new Stack<>();

		for (char ch : S.toCharArray()) {

			if (ch == '(' || ch == ')')
				if (stack.isEmpty())
					stack.add(ch);
				else if (stack.peek() == '(' && ch == ')')
					stack.pop();
				else
					stack.add(ch);
		}

		return stack.isEmpty()?1:0;
	}
}
