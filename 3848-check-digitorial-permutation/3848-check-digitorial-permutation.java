class Solution {
    public boolean isDigitorialPermutation(int n) {

        int fact[] = new int[10];
        fact[0] = 1;
        int runningFact = 1;

        for (int i=1;i<10;i++){
            runningFact *= i;
            fact[i] = runningFact;
        }

        int num = n;
        int ans = 0;
        boolean hasZero = true;
        int map[] = new int[10];
        
        while (n > 0){
            int rem = n % 10;

            ans += fact[rem];

            n = n / 10;
            map[rem]++;
        }
        while (ans > 0){
            int rem = ans % 10;

            ans = ans / 10;

            map[rem]--;
        }
        
        for (int i=0;i<10;i++){
            if (map[i] != 0)
                return false;
        }
        return true;
    }
}