package io.github.caitlinrichard.tictactoe;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for Grid class
 */
public class GridTest 
{
    /**
     * Grid class tests
     */
    @Test
    public void makesNewGrid() {
        Grid testGrid = new Grid();
        for (int i = 0; i < 9; i++) {
            boolean isOccupied = testGrid.isCellOccupied(i);
            assertFalse(isOccupied);
        }
    }
    
    @Test
    public void testAddX() {
        Grid testGrid = new Grid();
        for (int i = 0; i < 9; i++) {
            testGrid.addX(i);
            boolean isOccupied = testGrid.isCellOccupied(i);
            assertTrue(isOccupied);
        } 
    }
    
    @Test
    public void testAddO() {
        Grid testGrid = new Grid();
        for (int i = 0; i < 9; i++) {
            testGrid.addO(i);
            boolean isOccupied = testGrid.isCellOccupied(i);
            assertTrue(isOccupied);
        }   
    }
    
    @Test
    public void testIsGameOver() {
        Grid testGrid = new Grid();
        testGrid.addX(0);
        testGrid.addX(1);
        testGrid.addX(2);
        
        boolean isGameDone = testGrid.isGameOver();
        assertTrue(isGameDone);
    }
}
