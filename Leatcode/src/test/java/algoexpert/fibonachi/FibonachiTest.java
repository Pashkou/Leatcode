package algoexpert.fibonachi;

import static org.junit.Assert.*;

import org.junit.Test;

public class FibonachiTest {

	public static int getNthFib(int n) {
		if((n == 0)|| (n == 1)) {
			return 0;
		}
		if(n == 2) {return 1;}
		
		
		int[] lastTwo = { 0, 1 };
		
		int counter = 3;
		int result = 0;
		
		while(counter <= n) {
			result = lastTwo[0] + lastTwo[1];
			lastTwo[0] = lastTwo[1];
			lastTwo[1] = result;
			counter += 1; 
		}
		
		
		return result;
	}
	
	@Test
	public void test() {
		System.out.println(getNthFib(5));
	}

}
