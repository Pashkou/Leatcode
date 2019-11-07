package array.intersection.two.arrays;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class Solution {

	public static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> nums1Map = new HashMap<Integer,Integer>();
        Map<Integer,Integer> nums2Map = new HashMap<Integer,Integer>();
        
        for(int i : nums1) {
        	Integer nums1Counter = nums1Map.get(i);
        	
        	if(nums1Counter == null) {
        		nums1Map.put(i, new Integer(1));
        	}else {
        		nums1Map.put(i, ++nums1Counter);
        	}
        }
        
        for(int i : nums2) {
        	Integer nums2Counter = nums2Map.get(i);
        	
        	if(nums2Counter == null) {
        		nums2Map.put(i, new Integer(1));
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
	
	@Test
	public void test() {
		
		int[] input1 = {1,2,2,1};
		int[] input2 = {2,2};
		
		int[] output = {2,2};
		
		Arrays.equals(output, Solution.intersect(input1, input2));
		
	}

}
