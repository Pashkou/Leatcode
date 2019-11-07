package array.move.zeroes;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class Solution {

	public static void moveZeroes(int[] nums) {
		int zeroIndex = 0;
		
		zeroIndex = findNextZero(nums, zeroIndex);
		for(int i = 0; i < nums.length; i++) {
			if(( nums[i] != 0)&&(zeroIndex != -1) && zeroIndex < i) {
				swipe(nums, i , zeroIndex);
				zeroIndex = findNextZero(nums, zeroIndex);
			}
		}
    }
	
	
	private static int findNextZero(int[] nums, int start) {
		int counter = start;
		do {
			if(nums[counter] == 0) {
				return counter;
			}
			counter++;
		}while(counter < nums.length);
		return -1;
	}

	private static void swipe(int[] nums, int i, int zeroIndex) {
		int temp = nums[i];
		nums[i] = nums[zeroIndex];
		nums[zeroIndex] = temp;
	}
	@Test
	public void test() {
		int[] input = {0,1,0,3,12};
		int[] output = {1,3,12,0,0};
		
		Solution.moveZeroes(input);
		
		assertTrue(Arrays.equals(output, input));
	}

}
