package br.com.edsonbjr.problems;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberOfLandsTest {

    @Test
    public void testNumIsLands() {
        NumberOfLands numberOfLands = new NumberOfLands();
        char[][] grid1 = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };
        assertEquals(3, numberOfLands.numIslands(grid1));

        char[][] grid2 = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };
        assertEquals(1, numberOfLands.numIslands(grid2));

        char[][] grid3 = {};
        assertEquals(0, numberOfLands.numIslands(grid3));

        char[][] grid4 = {
                {'0', '0', '0', '0', '0'},
                {'0', '0', '0', '0', '0'},
                {'0', '0', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };
        assertEquals(0, numberOfLands.numIslands(grid4));
    }
}
