package array.rotate.array;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class Solution {
	public static void rotate(int[] nums, int k) {
		boolean[] check = new boolean[nums.length]; 
		int element = nums[0];
		int t = 0;
		for(int i = 0; i < nums.length; i++) {
			t += k;
			if( t >= nums.length) {
				t = t % nums.length;
			}
			if(check[t] == true) {
				t+=1;
			}
			int temp = nums[t];
			nums[t] = element;
			check[t] = true;
			element = temp;
		}
		
		
    }
	
	

	@Test
	public void test() {
		int[] input = {1,2,3,4,5,6,7};
		Solution.rotate(input, 3);
		int[] output = {5,6,7,1,2,3,4};
		assertTrue(Arrays.equals(output, input));
		
		
		int[] input2 = {1,2,3,4,5,6};
		Solution.rotate(input2, 2);
		int[] output2 = {5,6,1,2,3,4};
		
		assertTrue(Arrays.equals(output2, input2));
	}

}
