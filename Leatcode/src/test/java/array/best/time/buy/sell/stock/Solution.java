package array.best.time.buy.sell.stock;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class Solution {

	public static int maxProfit(int[] prices) {
		int result = 0;
		for(int i = 0; i < prices.length-1; i++ ) {
			if(prices[i + 1] > prices[i]) {
				result += prices[i + 1] - prices[i];
			} 
		}
		
        return result;
    }
	
	
	
	public boolean containsDuplicate(int[] nums) {
		
		Set<Integer> map = new HashSet();
		
		for (int i : nums) {
			if(map.contains(i)) {
				return true;
			}
			map.add(i);
		}
		
		return false;
    }


	@Test
	public void test() {
		int[] input = {7,1,5,3,6,4};
		assertEquals(7, Solution.maxProfit(input));
	}

}
