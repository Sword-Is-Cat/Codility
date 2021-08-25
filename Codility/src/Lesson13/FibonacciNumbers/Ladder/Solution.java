package Lesson13.FibonacciNumbers.Ladder;

class Solution {
	public int[] solution(int[] A, int[] B) {

		int[] result = new int[A.length];
		int[] temp = new int[A.length + 1];

		int a = 0;
		int b = 0;

		for (int i = 0; i < A.length; i++) {
			a = Math.max(a, A[i]);
			b = Math.max(b, B[i]);
		}
		

		temp[0] = 1;
		temp[1] = 1;
		int mod = (int) Math.pow(2, b);

		for (int i = 2; i <= a; i++) {
			temp[i] = (temp[i - 1] + temp[i - 2]) % mod;
		}
		
		
		for(int i = 0 ; i<result.length ; i++) {
			result[i] = temp[A[i]]%((int)Math.pow(2,B[i]));
		}

		return result;

	}
}
