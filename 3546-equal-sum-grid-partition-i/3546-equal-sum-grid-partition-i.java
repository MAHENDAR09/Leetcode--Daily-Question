 class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        
        long totalSum = 0;

        for (int ar[] : grid){
            for (int e: ar)
                totalSum += e;
        }

        long curSum = 0;
        for (int ar[] : grid){
            for (int e: ar){
                curSum += e;
            }
            if ((curSum * 2L) == totalSum)
                return true; 
        }

        curSum = 0;
        for (int j=0;j<grid[0].length;j++){
            for (int i=0;i<grid.length;i++){
                curSum += grid[i][j];
            }
            if ((curSum * 2L) == totalSum)
                return true; 
        }
        return false;
    }
}


