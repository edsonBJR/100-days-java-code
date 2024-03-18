package br.com.edsonbjr.problems;

public class NumberOfLands {
    /*
        Give a 2d grid map of '1' s (land) and '0' s (water)
        count the number of islands. An island is surrounded
        by water and is formed by connecting adjacent lands
        horizontally or vercatilly. You may assume all four
        edges of the grid are all surrounded by water.
     */

    public int numIslands(char[][] grid) {
        int count = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] == '1') {
                    count += 1;
                    callDFS(grid, i, j);
                }
            }
        }
        return count;
    }

    private void callDFS(char[][] grid, int i, int j) {
        if(i < 0 || i > grid.length || j < 0 || j > grid[i].length || grid[i][j] == '0')
            return;

        grid[i][j] = '0';
        callDFS(grid, i + 1, j); // up
        callDFS(grid, i - 1, j); // down
        callDFS(grid, i , j - 1); // left
        callDFS(grid, i , j + 1); //right

    }
}
