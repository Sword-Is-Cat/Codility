package Lesson3.TimeComplexity.FrogJmp;

class Solution {
	public int solution(int X, int Y, int D) {

		int dist = Y - X;

		return dist % D == 0 ? dist / D : dist / D + 1;
	}
}
