package question.andrus;

import java.util.Arrays;

import org.junit.Test;

public class Solution {

	private static int findLeftIndex(char[] input, int leftIndex) {
		for (int i = 0; i < input.length; i++) {
			if (input[i] == ' ') {
				return leftIndex;
			} else {
				leftIndex += 1;
			}
		}
		return leftIndex;
	}

	private void addWordToRight(char[] word) {

	}

//	private static char[] moveElementsToLeft(char[] input, int length) {
//		int initialIndex = 0;
//		for(int i = length + 1; i < input.length; i++) {
//			input[initialIndex++] = input[i];
//		}
//		return input;
//	}
//	
//	private static int addWorldToRight(char[] input, char[] leftWorld) {
//		int result = input.length - leftWorld.length;
//		int initialIndex = 0;
//		for(int i = input.length - leftWorld.length; i < input.length; i++) {
//			input[i] = leftWorld[initialIndex++];
//		}
//		return result;
//	}

	@Test
	public void test() {
		char[] input = { 'a', 'a', 'a', ' ', 'b', 'b', 'b', ' ', 'c', 'c', 'c', ' ', 'd', 'd', 'd' };

		int leftIndex = 0;
		int rightIndex = input.length;

		leftIndex = findLeftIndex(input, leftIndex);
		char[] word = getLeftWord(input, leftIndex);
		input = moveArrayToLeft(input, leftIndex);
		input = insertToRight(input, word);

		rightIndex = rightIndex - word.length - 1;
		word = getRightWord(input, rightIndex);

		System.out.println("leftIndex = " + leftIndex);
		System.out.println("rightIndex = " + rightIndex);
		System.out.println(word);
		System.out.println(input);

	}

	private char[] getRightWord(char[] input, int rightIndex) {
		for (int i = rightIndex - 1; i > 0; i--) {
			if (input[i] == ' ') {
				return Arrays.copyOfRange(input, i + 1 , rightIndex);

			}
		}
		return null;
	}

	private char[] insertToRight(char[] input, char[] word) {
		int initialIndex = input.length - word.length;
		for (int i = 0; i < word.length; i++) {
			input[initialIndex++] = word[i];
		}
		return input;

	}

	private char[] moveArrayToLeft(char[] input, int leftIndex) {
		leftIndex++;
		for (int i = 0; leftIndex < input.length; i++) {
			input[i] = input[leftIndex++];
		}
		return input;
	}

	private char[] getLeftWord(char[] input, int leftIndex) {
		return Arrays.copyOfRange(input, 0, leftIndex);
	}

}
