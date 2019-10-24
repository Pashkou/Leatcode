package split.string.balanced.strings;

import static org.junit.Assert.assertEquals;

import java.util.Queue;
import java.util.Stack;

import org.junit.Test;

//https://leetcode.com/problems/split-a-string-in-balanced-strings/
public class Solution {

	public static int balancedStringSplit(String s) {
		char[] charArray = s.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		
		int result = 0;
		for (char c : charArray) {
			if(stack.size() == 0) {
				stack.push(c);
				continue;
			}

			Character last = stack.peek();
			if(last.equals(c)) {
				stack.push(c);
			}else {
				stack.pop();
			}
			if(stack.size()==0) {
				result++;
			}
		}
		
        return result;
    }

	@Test
	public void test() {
		
		assertEquals(4, Solution.balancedStringSplit("RLRRLLRLRL"));
		assertEquals(3, Solution.balancedStringSplit("RLLLLRRRLR"));
		assertEquals(1, Solution.balancedStringSplit("LLLLRRRR"));
		assertEquals(2, Solution.balancedStringSplit("RRLRRLRLLLRL"));
	}

}
