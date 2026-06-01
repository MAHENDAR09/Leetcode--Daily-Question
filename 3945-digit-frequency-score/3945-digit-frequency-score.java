class Solution {
    public int digitFrequencyScore(int n) {

        int f[] = new int[10];
        int score = 0;

        while (n != 0){

            int rem = n % 10;
            f[rem]++;
            n /= 10;
        }

        for (int i=0;i<10;i++){
            score += (i * f[i]);
        }
        return score;
    }
}