class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {

        int score = 0;
        int trackScore = 0;
        int l = 0, r = tokens.length-1;
        Arrays.sort(tokens);

        while(l <= r){
            
            if (power >= tokens[l]){
                score++;
                power = power - tokens[l++];
            }
            else if (power < tokens[l] && score != 0 && l != r){
                power = power + tokens[r--];
                trackScore = Math.max(score,trackScore);
                score--;
            }
            else 
                break;
        }
        
        return Math.max(score,trackScore);
    }
}

// 100 200 300 400 


