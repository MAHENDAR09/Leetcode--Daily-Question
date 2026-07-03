class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {

        int n = mat.length;

        int count = 4;

        while (count--> 0){

            boolean flag = true;

            for (int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    swap(mat,i,j);
                }
            }

            for (int i=0;i<n;i++){
                rev(mat,i);
            }

            for (int i=0;i<n;i++){
                for (int j=0;j<n;j++){
                    if(mat[i][j] != target[i][j])
                        flag = false;
                }
            }
            if (flag)
                return  true;
        }
        return  false;
    }

    private static void swap(int mat[][],int i,int j){

        int t = mat[i][j];
        mat[i][j] = mat[j][i];
        mat[j][i] = t;
    }

    private static void rev(int mat[][],int i){

        int n = mat.length;

        for (int j=0;j<n/2;j++){

            int t = mat[i][j];
            mat[i][j] = mat[i][n-1-j];
            mat[i][n-1-j] = t;

        }
    }
}