class Solution {
    public int mirrorFrequency(String s) {
        
        int alpha[] = new int [26];
        int nums[] = new int[10];
        int ans = 0;

        for (char ch :s.toCharArray()){
            if (ch >= 'a' && ch <= 'z')
                alpha[ch-'a']++;
            else
                nums[ch-'0']++;
        }

        for (int i=0;i<13;i++){

            int sI = i;
            int lI = 26 - 1 - i;

            ans += Math.abs(alpha[sI] - alpha[lI]);
            
        }

        for (int i=0;i<5;i++){
            int sI = i;
            int lI = 10 - 1 - i;

            ans += Math.abs(nums[sI] - nums[lI]);
        }

        return ans;
    }
}