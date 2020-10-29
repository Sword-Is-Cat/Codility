package Lesson1.Iterations.BinaryGap;

//https://app.codility.com/c/run/trainingQXQAAU-ENM/

class Solution {
	public int solution(int N) {

		int longest = 0;
		int temp = 0;
		boolean isFirst = true;

		while (N > 0) {
			if (N % 2 == 0) {
				temp++;
				if (!isFirst)
					longest = Math.max(longest, temp);
			} else {
				temp = 0;
				isFirst = false;
			}
			N /= 2;
		}

		return longest;
	}
}
