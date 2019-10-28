package array.plus.one;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class Solition {
/*
 *  for(int i = digits.length - 1; i >= 0; i--){  //iterate from last digit to first
        if(digits[i] < 9){  //simpliest case
            digits[i]++;
            return digits;
        }
        digits[i] = 0; //if digits[i] is 9, make it 0 and go to the next one
    }
    //if all digits happened to be 9s
    int[] newDigits = new int[digits.length + 1];
    newDigits[0] = 1;
    return newDigits;*/
	
	public static int[] plusOne(int[] digits) {
		
		
		
		for(int i = digits.length - 1; i >= 0; i--) {
			if(digits[i] < 9) {
				digits[i] = digits[i] + 1;
				return digits;
			}
			digits[i] = 0; 
		}

		int[] temp = new int[digits.length + 1];
		temp[0] = 1;
		
		return temp;
		
		
    }
	
	@Test
	public void test() {
		int[] input = {9};
		int[] output = {9,8,7,6,5,4,3,2,1,1};
		
		Arrays.equals(output, Solition.plusOne(input));	
	}

}
