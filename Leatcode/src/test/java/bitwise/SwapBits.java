package bitwise;

import static org.junit.Assert.*;

import org.junit.Test;

public class SwapBits {

	@Test
	public void test() {
	
		/*byte i = 72;
		
		System.out.println(Integer.toBinaryString(i));
		
		int j = 1 << 7;
		
		System.out.println(Integer.toBinaryString(j));
		System.out.println(Integer.toBinaryString(j));
		*/
		
		int i = 113332;
		
		System.out.println( i%10);
		
		int numDigits = (int)(Math.floor(Math.log10(i))) +1;
		
		System.out.println(Math.log10(i));
		System.out.println(numDigits);
		/*System.out.println(numDigits);
		System.out.println(numDigits);
		System.out.println(numDigits);*/
		
	}

}
