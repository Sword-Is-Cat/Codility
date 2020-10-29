package Lesson2.Arrays.CyclicRotation;

class Solution {
	public int[] solution(int[] A, int K) {
		
		if(A.length==0)
			return A;

		int[] arr = new int[A.length];
		K = K % A.length;

		for (int i = 0; i < A.length; i++)
			if (i - K < 0)
				arr[i] = A[i - K + A.length];
			else
				arr[i] = A[i - K];

		return arr;
	}
}
