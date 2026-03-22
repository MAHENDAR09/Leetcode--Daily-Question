class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {

        int cnt = 4;

        while (cnt-- > 0){
            rotate(mat);
            if (checkValid(mat,target))
                return true;
        }

        return false;
    }

    public static void rotate(int mat[][]){
        int n = mat.length;

        
        for (int i=0;i<n;i++){
            for (int j=i;j<n;j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i]  = temp;
            }
        }

        
        for (int i=0;i<n;i++){
            for (int j=0;j<n/2;j++){
                int t = mat[i][j];
                mat[i][j] = mat[i][n-j-1];
                mat[i][n-j-1] = t;
            }
        }
    }
    public static boolean checkValid(int a[][],int b[][]){

        int n = a.length;

        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (a[i][j] != b[i][j])
                    return false;
            }
        }
        return true;
    }
}
