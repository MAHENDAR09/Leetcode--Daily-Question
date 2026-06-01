class Solution {
    public int digitFrequencyScore(int n) {

        int score = 0;

        while (n != 0){

            int rem = n % 10;
            score += rem;
            n /= 10;
        }

        return score;
    }
}