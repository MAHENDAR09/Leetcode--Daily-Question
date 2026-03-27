class Solution {
    public int maxCoins(int[] piles) {
        
        Arrays.sort(piles);
        int myScore = 0;

        int l = 0 , r = piles.length -1;

        while (l < r){
            myScore += piles[--r];
            --r;
            l++;
        }
        return myScore;
    }
}