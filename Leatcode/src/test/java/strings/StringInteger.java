package strings;

import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class StringInteger {

	 public int myAtoi(String str) {
			str = str.trim();
			if(str.equals("")) {
				return 0;
			}
			
			char[] charArray = str.toCharArray();
			if( Character.isDigit(charArray[0]) || charArray[0] == '+' || charArray[0] == '-') {
				
				int isNegative = 1;
				List<Character> list = new ArrayList<>();
				if(charArray[0] == '-') {isNegative = -1;}
				if(Character.isDigit(charArray[0])) {list.add(charArray[0]);}
			
				for(int i = 1; i < charArray.length; i++) {
					
					if(Character.isDigit(charArray[i])){
						list.add(charArray[i]);
					}else {
						break;
					}
					
				}
	            if(list.isEmpty()) return 0;
				return charToInt(list, isNegative);
			}else {
				return 0;
			}
		}
		 
		private int charToInt(List<Character> list, int isNegative) {
			Integer result = new Integer(list.get(0).toString());
			for(int i = 1; i < list.size(); i++) {
				if(result  + new Integer(list.get(i).toString()) > Integer.MAX_VALUE/10 + 7) {
					if(isNegative == -1) {
						return Integer.MIN_VALUE;
					}
					return Integer.MAX_VALUE;
				}
				result = (result*10 + new Integer(list.get(i).toString()));
			}
			return result*isNegative;
		}
	
	@Test
	public void test() {
		System.out.println(new StringInteger().myAtoi("2147483646"));
	}

}
