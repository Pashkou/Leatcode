package problems.jewels.and.stones;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

//https://leetcode.com/problems/jewels-and-stones/
/*You're given strings J representing the types of stones that are jewels, and S representing the stones you have.
 *   Each character in S is a type of stone you have.
 *   You want to know how many of the stones you have are also jewels.
 *   The letters in J are guaranteed distinct, and all characters in J and S are letters.
 *   Letters are case sensitive, so "a" is considered a different type of stone from "A".*/

public class Solution {


	public int numJewelsInStones(String J, String S) {
		int ans = 0;

		char[] jArr = J.toCharArray();
        
        for(char c : S.toCharArray()){
        	
        	for (char jA : jArr) {
				
        		if(jA == c){
        			ans += 1;
        		}
			}
        	
            
            

        }
        
        return ans;
    }
	
	
	@Test
	public void test() {
		
		Solution solution = new Solution();
		assertEquals(3, solution.numJewelsInStones("aA", "aAAbbbb"));
		
	}

}
