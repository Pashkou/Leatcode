package strings;

import static org.junit.Assert.*;

import org.junit.Test;

public class ValidAnagram {

	public boolean isAnagram(String s, String t) {
		if (s.length() != t.length())
			return false;

		int[] array = new int[26];
		char[] sArr = s.toCharArray();
		char[] tArr = t.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			array[sArr[i] - 'a']++;
			array[tArr[i] - 'a']--;
		}

		for (int tet : array) {
			if (tet != 0) {
				return false;
			}
		}
		return true;
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
