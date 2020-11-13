package Lesson7.StacksAndQueues.Brackets;

import java.util.Stack;

class Solution {
	public int solution(String S) {

		char[] charArr = S.toCharArray();
		Stack<Character> stack = new Stack<>();

		for (char ch : charArr) {
			if (stack.isEmpty())
				stack.add(ch);
			else if (stack.peek() == '{' && ch == '}' || 
					stack.peek() == '[' && ch == ']' || 
					stack.peek() == '(' && ch == ')')
				stack.pop();
			else
				stack.add(ch);
		}

		return stack.isEmpty() ? 1 : 0;
	}
}
