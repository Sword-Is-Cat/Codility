package Lesson12.EuclideanAlgorithm.CommonPrimeDivisors;

import java.util.ArrayList;
import java.util.List;

class Solution {

	public int solution(int[] A, int[] B) {

		int res = 0;

		for (int i = 0; i < A.length; i++) {

			int a = A[i];
			int b = B[i];

			if (proc(a, b)) {
				res++;
			}

		}

		return res;
	}

	private boolean proc(int a, int b) {

		List<Integer> listA = factorization(a);
		List<Integer> listB = factorization(b);
		
		int lengthA = listA.size(); 
		int lengthB = listB.size();
		
		if(lengthA != lengthB)
			return false;
		
		for(int i = 0 ; i<lengthA ; i++) {
			if(listA.get(i)!=listB.get(i))
				return false;
		}

		return true;
	}

	private List<Integer> factorization(int n) {

		List<Integer> list = new ArrayList<>();

		int temp = n;

		for (int i = 2; i * i <= n; i++) {
			if (temp % i == 0) {
				list.add(i);
				while (temp % i == 0)
					temp /= i;
			}
			if (temp == 1)
				return list;
		}

		list.add(temp);

		return list;

	}
}
