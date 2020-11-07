package Challenges.Palladium2020;

class Solution {
	public int solution(int[] H) {

		int[] leftTop = new int[H.length + 1];
		int[] rightTop = new int[H.length + 1];

		int leftMax = 0;
		leftTop[0] = 0;
		for (int i = 0; i < H.length; i++) {

			leftMax = leftMax < H[i] ? H[i] : leftMax;
			leftTop[i + 1] = leftMax;
		}

		int rightMax = 0;
		rightTop[H.length] = 0;
		for (int i = H.length - 1; i >= 0; i--) {

			rightMax = rightMax < H[i] ? H[i] : rightMax;
			rightTop[i] = rightMax;
		}

		int minArea = Integer.MAX_VALUE;
		for (int i = 0; i < H.length; i++) {
			int temp = i * leftTop[i] + (H.length - i) * rightTop[i];
			minArea = minArea > temp ? temp : minArea;
		}
		return minArea;
	}
}