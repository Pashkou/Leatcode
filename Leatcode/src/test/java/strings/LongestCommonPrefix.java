package strings;

import static org.junit.Assert.*;

import org.junit.Test;

public class LongestCommonPrefix {

	public String longestCommonPrefix(String[] strs) {
		
		 if (strs == null || strs.length == 0) return "";
		 
		 
		    for (int i = 0; i < strs[0].length() ; i++){
		        char c = strs[0].charAt(i);
		        
		        
		        for (int j = 1; j < strs.length; j ++) {
		            if (i == strs[j].length() || strs[j].charAt(i) != c)
		                return strs[0].substring(0, i);   
		            
		            
		            
		        }
		    }
		    return strs[0];
		
		
    }

	@Test
	public void test() {
		String[] input = {"c","c"};

		System.out.println( new LongestCommonPrefix().longestCommonPrefix(input));
	
	}

}
