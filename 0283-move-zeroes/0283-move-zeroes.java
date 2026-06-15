class Solution {
    public void moveZeroes(int[] ar) {

        int p1 = -1;
        int n = ar.length;

        for (int i=0;i<n;i++){

            if (ar[i] == 0 && p1 != -1)
                continue;
            else if (p1 != -1){
                ar[p1] = ar[i];
                p1++;
                ar[i] = 0;
                continue;
            }

            if (ar[i] == 0)
                p1 = i;
        }
        
    }
}