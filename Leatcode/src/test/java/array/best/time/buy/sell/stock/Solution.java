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
	
	public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> nums1Map = new HashMap<Integer,Integer>();
        Map<Integer,Integer> nums2Map = new HashMap<Integer,Integer>();
        
        for(int i : nums1) {
        	Integer nums1Counter = nums1Map.get(i);
        	
        	if(nums1Counter == null) {
        		nums1Map.put(i, new Integer(0));
        	}else {
        		nums1Map.put(i, ++nums1Counter);
        	}
        
        }
        
        for(int i : nums2) {
        	Integer nums2Counter = nums2Map.get(i);
        	
        	if(nums2Counter == null) {
        		nums2Map.put(i, new Integer(0));
        	}else {
        		nums2Map.put(i, ++nums2Counter);
        	}
        	
        }
		
        
        List<Integer> resultList = new ArrayList();
        for(int i : nums2) {
        	if(nums1Map.containsKey(i) && nums2Map.containsKey(i)){
        		Integer integer = nums1Map.get(i);
        		--integer;
        		if(integer == 0) {
        			nums1Map.remove(i);
        		}else {
        			nums1Map.put(i, integer);
        		}
        		integer = nums2Map.get(i);
        		--integer;
        		if(integer == 0) {
        			nums2Map.remove(i);
        		}else {
        			nums2Map.put(i, integer);
        		}
        		resultList.add(i);
        	}
        }
        
        return resultList.stream().mapToInt(p -> p).toArray();
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
