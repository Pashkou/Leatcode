package array.single.number;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class Solution {

	 public static int singleNumber(int[] nums) {
		 int result = 0;
		 for(int i = 0; i < nums.length; i++) {
			result = result ^ nums[i];
		 }		
		 return result;
	 }
//	 public static int singleNumber(int[] nums) {
//		 Set<Integer> table = new HashSet<Integer>();
//		 
//		 for(int i = 0; i < nums.length; i++) {
//			 
//			 int currentValue = nums[i];
//			 
//			 if(table.contains(currentValue)) {
//				 table.remove(currentValue);
//			 }else {
//				 table.add(currentValue);
//			 }
//			 
//		 }
//		 
//		 return  table.iterator().next();
//	 }
	 
	@Test
	public void xorTest() {
		int a = 5;
		int b = 0;
		System.out.println(a ^ a);
	} 
	 
	@Test
	public void test() {
		int[] input = {4,1,2,1,2};
		
		assertEquals(4, Solution.singleNumber(input));
	}

}
	