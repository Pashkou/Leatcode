package sorting;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class BubbleSort {

	public static void sort(int[] array) {
		for(int i = 1; i <= array.length; i++) {
			
			for(int j = 0; j < array.length - i; j++) {
				if(array[j] > array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j + 1] = temp;
				}
			}
			
		}
	}
	
	public static boolean isPalindrome(String s) {
		char[] charArray = s.toLowerCase().toCharArray();
		int i = 0;
		int j = charArray.length - 1;
		while(i < j) {
			i = findNextHead(charArray, i);
			j = findNextTail(charArray, j);
			if(charArray[i] != charArray[j]) { 
				return false;
			}
			i++; j--;
		}
		
		return true;   
    }
	
	public static int findNextHead(char[] charArray, int i) {
		for(int j = i; j < charArray.length; j++) {
			if(Character.isLetterOrDigit(charArray[j])) {
				return j;
			}
		}
		return 0;
	}
	
	public static int findNextTail(char[] charArray, int i) {
		for(int j = i; j > 0; j--) {
			if(Character.isLetterOrDigit(charArray[j])) {
				return j;
			}
		}
		return 0;
	}
	
	@Test
	public void test() {
		 int[] input = {99, 44, 6, 2, 1, 5, 63, 87, 283, 4, };
		 
		 BubbleSort.sort(input);
		 
		 System.out.println(Arrays.toString(input));
	}
	
	@Test
	public void test2() {
		String input = "A man, a plan, a canal: Panama";
		
		System.out.println(BubbleSort.isPalindrome(input));
	}

}
