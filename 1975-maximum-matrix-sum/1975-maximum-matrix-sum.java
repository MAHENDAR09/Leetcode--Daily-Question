class Solution {
    public long maxMatrixSum(int[][] matrix) {

        
        int min = Integer.MAX_VALUE;
        int Negatives = 0;
        boolean containsZero = false;
        long sum = 0;

        for (int mat[] : matrix){
            
            for (int val : mat){
                if (val != 0)
                    min = Math.min(min,Math.abs(val));
                if (val < 0){
                    Negatives++;
                }
                else if (val == 0){
                    containsZero = true;
                }

                sum += Math.abs(val);
            }

        }
        return Negatives % 2 == 0 ?
                            sum : containsZero == true ? sum : (sum-(min * 2)); 
    }
}