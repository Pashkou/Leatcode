package strings;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseString {

	public static void reverseString(char[] s) {
		for(int i = 0, j = s.length - 1; i < j; i++, j--) {
			char temp = s[i];
			s[i] = s[j];
			s[j] = temp;
		}
	}

	@Test
	public void test() {
		char[] input = {'h','e','l','l','o'};
		char[] output = {'o','l','l','e','h'};
		
		ReverseString.reverseString(input);
		System.out.println(input);
	}

}
