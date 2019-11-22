package kata.tree;

import static org.junit.Assert.*;

import java.util.NoSuchElementException;

import org.junit.Before;
import org.junit.Test;

public class TreeTest {

	private BinarySearchTree bst;

    @Before
    public void setUp() {
        bst = new BinarySearchTree();
    }

    @Test
    public void testInsertElementInBSTSizeIncreases() {
        bst.insert(1);
        assertEquals(1, bst.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInsertDuplicateThrowsException() {
        populateBST();
        bst.insert(1);
    }

    @Test
    public void testTenElementsGiveSizeOfTen() {
        populateBST();
        assertEquals(10, bst.size());
    }

    @Test
    public void testFindElementInBSTTrueWhenPresent() {
        populateBST();
        assertTrue(bst.find(4));
        //assertTrue(bst.find(1));
        //assertTrue(bst.find(8));
        //assertTrue(bst.find(5));
    }

    @Test
    public void testFindElementInBSTFalseWhenNotPresent() {
        populateBST();
        assertFalse(bst.find(11));
    }
    
    

    @Test
    public void testDeleteElementSizeDecreases() {
        populateBST();
        bst.delete(1);
        assertEquals(9, bst.size());
    }

    @Test(expected = NoSuchElementException.class)
    public void testDeleteNotPresentThrowsException() {
        populateBST();
        bst.delete(11);
    }

    /**
     * Populating the BST with 0-9, total of 10 elements.
     */
    private void populateBST() {
        for (int i = 0; i < 10; i++) {
            TreeNode node = bst.insert(i);
            //assertEquals(i, node.val);
        }
    }

}
