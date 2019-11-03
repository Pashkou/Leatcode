package strings;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseInteger {

	public static int reverse(int x) {

		int reversed = 0;
		while (x != 0) {
			int last = x % 10;
			x = x / 10;
			if (reversed > Integer.MAX_VALUE/10) return 0;
			if ((reversed == Integer.MAX_VALUE/10) && (last > 7)) {	return 0;}

			if (reversed < Integer.MIN_VALUE/10)
				return 0;
			if (reversed == Integer.MIN_VALUE/10) {
				if(last > 8) {
					return 0;
				}
			}
			
			reversed = reversed * 10 + last;

		}

		return reversed;
	}

	@Test
	public void test() {
		int input = -2147483648;
		System.out.println(ReverseInteger.reverse(input));
	}

}
