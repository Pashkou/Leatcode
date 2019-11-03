package strings;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class FirstUniqueCharacterString {

	public int firstUniqChar(String s) {
		Map<Character, Integer> letterToIndex = new HashMap<>();
		
		char[] charArray = s.toCharArray();
		for(int i = 0; i < charArray.length; i++) {
			if(letterToIndex.containsKey(charArray[i])) {
				letterToIndex.put(charArray[i], 2);
			}else {
				letterToIndex.put(charArray[i], 1);
			}
		}
		
		for(int i = 0; i < charArray.length; i++) {
			if(letterToIndex.get(charArray[i]) == 1) {
				return i;
			}
		}
		return -1;
	}

	@Test
	public void test() {
		FirstUniqueCharacterString f = new FirstUniqueCharacterString();
		System.out.println(f.firstUniqChar("leetcode"));
	}

}
