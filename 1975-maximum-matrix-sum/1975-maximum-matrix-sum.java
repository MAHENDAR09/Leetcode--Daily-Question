class Solution {
    public long maxMatrixSum(int[][] matrix) {

        int n = matrix.length;
        int m = matrix[0].length;
        int min = Integer.MAX_VALUE;
        int Negatives = 0;
        boolean containsZero = false;
        long sum = 0;

        for (int i=0;i<n;i++){
            
            for (int j=0;j<m;j++){
                if (matrix[i][j] != 0)
                    min = Math.min(min,Math.abs(matrix[i][j]));
                if (matrix[i][j] < 0){
                    Negatives++;
                }
                else if (matrix[i][j] == 0){
                    containsZero = true;
                }

                sum += Math.abs(matrix[i][j]);
            }

        }
        return Negatives % 2 == 0 ?
         sum : containsZero == true ? sum : (sum-(min * 2)); 
    }
}