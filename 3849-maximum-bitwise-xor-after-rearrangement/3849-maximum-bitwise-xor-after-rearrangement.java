class Solution {
    public String maximumXor(String s, String t) {
        
        int cntOnes = 0;
        int n = s.length();

        for (char ch : t.toCharArray()){

            if (ch == '1')
                cntOnes++;
        }
        int cntZeros = n - cntOnes;

        StringBuilder sb = new StringBuilder(t);

        for (int i=0;i<n;i++){

            if (s.charAt(i) == '1' && t.charAt(i) == '0' && cntZeros!= 0){
                --cntZeros;
            }
            else if (s.charAt(i) == '0' && t.charAt(i) == '1' && cntOnes != 0){
                --cntOnes;
            }
            else if (s.charAt(i) == '1' && t.charAt(i) == '1' && cntZeros != 0){
                sb.setCharAt(i,'0');
                --cntZeros;
            }
            else if (s.charAt(i) == '0' && t.charAt(i) =='0'&& cntOnes != 0){
                sb.setCharAt(i,'1');
                 --cntOnes;
            }
            else if (cntOnes == 0){
                sb.setCharAt(i,'0');
                --cntZeros;
            }
            else if (cntZeros == 0){
                sb.setCharAt(i,'1');
                --cntOnes;
            }
            if (s.charAt(i) == sb.charAt(i)){
                sb.setCharAt(i,'0');
            }
            else {
                sb.setCharAt(i,'1');
            }
        }
        return sb.toString();
    }
}