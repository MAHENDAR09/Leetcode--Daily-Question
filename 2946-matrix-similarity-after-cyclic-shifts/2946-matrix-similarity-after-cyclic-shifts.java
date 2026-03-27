class Solution {
    public boolean areSimilar(int[][] mat, int k) {

        int n = mat.length;
        int m = mat[0].length;

        k = k % m;

        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){

                if ((i&1) != 0){
                    int idx = (j - k + m) % m;
                    if (mat[i][j] != mat[i][idx]){
                        System.out.println(i+"  "+j+"  "+idx);
                        return false;
                    }
                        
                }
                else {
                    int idx = (j + k) % m;
                    if (mat[i][j] != mat[i][idx])
                        return false;
                }

            }
        }


       return true; 
    }
}