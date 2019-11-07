package array.valid.sudoku;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class Solution {

	public boolean isValidSudoku2(char[][] board) {
        Set<Character>[] boxs = new Set[9];
        Set<Character>[] rows = new Set[9];
        Set<Character>[] cols = new Set[9];
        
        for(int i = 0; i < 9; i++){
            boxs[i] = new HashSet<>();
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
        }
        
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if(board[i][j] != '.'){
                    if(!rows[i].add(board[i][j])) return false;
                    if(!cols[j].add(board[i][j])) return false;
                    if(!boxs[((i/3)*3) + (j/3)].add(board[i][j])) return false;    
                }
            }
        }
        return true;
    }
	
	
	public static boolean isValidSudoku(char[][] board) {
		for(int i = 0; i < board.length; i++) {
			Set<Character> rows = new HashSet<>();
			for(int j = 0; j < board.length; j++) {
				char number = board[i][j];
				if(rows.contains(number)) {
					return false;
				}
				if(number != '.') {
					rows.add(number);
				}
			}
		}
		
		for(int i = 0; i < board.length; i++) {
			Set<Character> columns = new HashSet<>();
			for(int j = 0; j < board.length; j++) {
				char number = board[j][i];
				if(columns.contains(number)) {
					return false;
				}
				if(number != '.') {
					columns.add(number);
				}
			}
		}
		
		int[] xCoords = {0,3,6};
		int[] yCoords = {0,3,6};
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(checkInput(board, xCoords[i], yCoords[j]) == false) {
					return false;
				}
			}
		}
		return true;
	}
	
	private static boolean checkInput(char[][] board, int x, int y) {
		int resultX = x + 3;
		int resultY = y + 3;
		
		Set<Character> rows = new HashSet<>();
		do {
			int currentY = y;
			do {
				char number = board[x][currentY];
				if(rows.contains(number)) {
					return false;
				}
				if(number != '.') {
					rows.add(number);
				}
				currentY++;
			}while(currentY < resultY);
			x++;
			
		}while(x < resultX);
		return true;
	}

	@Test
	public void test() {
		char[][] input = { { '8', '3', '.', '.', '7', '.', '.', '.', '.' },
				{ '6', '.', '.', '1', '9', '5', '.', '.', '.' }, { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
				{ '8', '.', '.', '.', '6', '.', '.', '.', '3' }, { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
				{ '7', '.', '.', '.', '2', '.', '.', '.', '6' }, { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
				{ '.', '.', '.', '4', '1', '9', '.', '.', '5' }, { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };
		
		char[][] input2 = {{'5','3','.','.','7','.','.','.','.'},{'6','.','.','1','9','5','.','.','.'},{'.','9','8','.','.','.','.','6','.'},{'8','.','.','.','6','.','.','.','3'},{'4','.','.','8','.','3','.','.','1'},{'7','.','.','.','2','.','.','.','6'},{'.','6','.','.','.','.','2','8','.'},{'.','.','.','4','1','9','.','.','5'},{'.','.','.','.','8','.','.','7','9'}};
		
		assertFalse(Solution.isValidSudoku(input));
		assertTrue(Solution.isValidSudoku(input2));

	}

}
