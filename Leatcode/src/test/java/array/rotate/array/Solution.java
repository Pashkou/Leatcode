package array.rotate.array;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class Solution {
	public static void rotate(int[] nums, int k) {
			
		
		int startIndex = 0;
		for(int counter = 0; counter < nums.length;) {
			
			int currentIndex = startIndex;
			int prevValue = nums[currentIndex];
			do {
				int tempValue = prevValue;
				currentIndex = (currentIndex + k) % nums.length;
				
				prevValue = nums[currentIndex];
				nums[currentIndex] = tempValue;
				
				counter++;
				
			}while(currentIndex != startIndex);
			
			startIndex++;
		}
		
		
    }
	
	public static void rotateWithAdditionalMemory(int[] nums, int k) {
		int[] result = new int[nums.length];
		for(int i = 0; i < nums.length; i++) {
			result[ (i+k)%nums.length ] = nums[i];
		}
		
		for(int i = 0; i < nums.length; i++) {
			nums[i] = result[i];
		}
	}
	
	

	@Test
	public void test() {
//		int[] input = {1,2,3,4,5,6,7};
//		Solution.rotate(input, 3);
//		int[] output = {5,6,7,1,2,3,4};
//		assertTrue(Arrays.equals(output, input));
		
		
		int[] input2 = {1,2,3,4,5,6};
		Solution.rotate(input2, 2);
		int[] output2 = {5,6,1,2,3,4};
		
		assertTrue(Arrays.equals(output2, input2));
	}

}
