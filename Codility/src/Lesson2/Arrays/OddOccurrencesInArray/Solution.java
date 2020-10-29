package Lesson2.Arrays.OddOccurrencesInArray;

class Solution {
    public int solution(int[] A) {

    	int answer = 0;
    	
    	for(int a : A)
    		answer ^= a; 
    	
    	return answer;
    }
}
