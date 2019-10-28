package array.rotate.image;

import static org.junit.Assert.*;

import org.junit.Test;

public class Solution {

	public static void rotate(int[][] matrix) {

		for(int i = 0; i < matrix.length; i++) {
			for(int j = i; j < matrix.length; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
		
		for(int i = 0, j = matrix.length - 1; i < j; i++, j--) {
			for(int r = 0; r < matrix.length; r++) {
				int temp = matrix[r][i];
				matrix[r][i] = matrix[r][j];
				matrix[r][j] = temp;
			}
		}
			
	}
    
    
	@Test
	public void test() {
		int[][] input = {{1,2,3},{4,5,6},{7,8,9}};
		Solution.rotate(input);
		printArray(input);
	}
	
	public void printArray(int[][] input) {
		for(int i = 0; i < input.length; i++) {
			for(int j = 0; j < input.length; j++) {
				System.out.print(input[i][j] + " ");
			}
			System.out.println("");
		}
	}
	

}
/* for(int i = 0; i < matrix.length; i++){

		for(int j = i; j < matrix.length; j++){
		   
			int temp = matrix[i][j];
		    matrix[i][j] = matrix[j][i];
		    matrix[j][i] = temp;
		}
		
		}
		
		for(int i = 0, j = matrix.length-1;   i < j;              i++,j--){
		
		for(int r = 0; r < matrix.length; r++){
		    int temp = matrix[r][i];
		    
		    matrix[r][i] = matrix[r][j];
		    matrix[r][j] = temp;
	}

}*/