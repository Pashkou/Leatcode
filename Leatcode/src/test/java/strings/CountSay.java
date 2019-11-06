package strings;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class CountSay {

	public String countAndSay(int n) {
		StringBuilder result = new StringBuilder();
		result.append("1");
	    while(n > 1) {
	    	result = new StringBuilder(processSecuence(result.toString()));
	    	n--;
	    }
		
		return result.toString();
	}

	private String processSecuence(String str) {
		char[] charArray = str.toCharArray();
		char lastChar = charArray[0];
		List<Character> list = new ArrayList<>(); 
		list.add(lastChar);
		
		
		StringBuilder result = new StringBuilder();
		for(int i = 1; i < charArray.length; i++){
			if(lastChar == charArray[i]) {
				list.add(lastChar);
			}else {
				result.append(list.size()).append(list.get(0));
				list = new ArrayList<>();
				lastChar = charArray[i];
				list.add(lastChar);
			}
		}
		result.append(list.size()).append(list.get(0));
		
 		return result.toString();
	}


	@Test
	public void test() {
		int input = 4;
		String output = "1211";
						 
		assertTrue(new CountSay().countAndSay(input).equalsIgnoreCase(output));
		
		
		
		
	}

}
