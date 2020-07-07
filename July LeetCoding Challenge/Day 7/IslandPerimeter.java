class Solution {
    public int islandPerimeter(int[][] grid) {
        int islandsCount = 0, neighboursCount = 0;
        
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    islandsCount++;
                    
                    // counting neighbours at the bottom
                    if (i < grid.length - 1 && grid[i + 1][j] == 1) {
                        neighboursCount++;
                    }
                    
                    // counting neighbours at the right
                    if (j < grid[i].length - 1 && grid[i][j + 1] == 1) {
                        neighboursCount++;
                    }
                }
            }
        }
        
        return (islandsCount * 4) - (neighboursCount * 2);
    }
}
