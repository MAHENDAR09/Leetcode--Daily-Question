class NumMatrix {

    int matrix[][];
    int ps[][];
    boolean isCal = true;
    int m ;

    public NumMatrix(int[][] matrix) {
        this.matrix= matrix;
        this.ps = matrix;
        this.m = matrix[0].length;
    }
    
    private void calPS(){

        for (int i=0;i<matrix.length;i++){
            for (int j=1;j<matrix[0].length;j++){
                ps[i][j] = ps[i][j-1] + matrix[i][j];
            }
        }

        // for (int e[] : ps){

        //     for (int i=0;i<e.length;i++)
        //         System.out.print(e[i]+" ");

        //     System.out.println();
        // }
    }
    public int sumRegion(int row1, int col1, int row2, int col2) {
 
        if (isCal){
            calPS();
            isCal = false;
        }


        int sum = 0;

        while (row1 <= row2){

            int s1 = (col1 - 1) == -1  ? 0  : ps[row1][col1-1];
            int s2 =  ps[row1][col2];

            // (col2 + 1) ==  m ? ps[row1][col2] (evertime it needs the same)

            sum = sum + (s2 - s1);
            row1++;
        }

        return sum;
    }
}