package array.two.sum;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class Solution {

	 public static int[] twoSum(int[] nums, int target) {
		 Map<Integer, Integer> hashmap = new HashMap();
		 int[] result = new int[2];
		 
		 for(int i = 0; i < nums.length; i++) {
			 hashmap.put(nums[i], i);
			 result[1] = i;
			 Integer secondAdd = hashmap.get(target - nums[i]); 
			 if((secondAdd != null)&&(secondAdd != i)) {
				 result[0] = secondAdd;
				 return result;
			 }
		 }
		 
		 
		 return result;
	  }
	 
	@Test
	public void test() {
		
		/*int[] input = {2,7,11,15};
		int target = 9;
		int[] output = {0,1};
		assertTrue(Arrays.equals(output , Solution.twoSum(input, target)));
		*/
		int[] input2 = {2,5,5,11};
				
		int target2 = 10;
		int[] output2 = {1,2};
		assertTrue(Arrays.equals(output2 , Solution.twoSum(input2, target2)));
	}

}
