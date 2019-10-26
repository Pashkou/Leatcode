package array.remove.duplicates;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class Solution {

	public static int removeDuplicates(int[] nums) {
		if (nums.length <= 1) {
			return nums.length;
		}
		
		int result = 1;
		int lastNumber = nums[0];
		int currentPosition = 1;
		
		for (int i : nums) {
			if(	i > lastNumber) {
				result++;
				lastNumber = i;
				nums[currentPosition++] = i;
			}
			
		}
		return result;
	
	}
	
	@Test
	public void test() {
		/*int[] input = {1,1,2};
		assertEquals(2, Solution.removeDuplicates(input));
		System.out.println(Arrays.toString(input));
		*/
		int[] input2 = {0,0,1,1,1,2,2,3,3,4};
		assertEquals(5, Solution.removeDuplicates(input2));
		System.out.println(Arrays.toString(input2));
	
	}
}
