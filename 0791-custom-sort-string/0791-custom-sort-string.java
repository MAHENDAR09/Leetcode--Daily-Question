class Solution {
    public String customSortString(String order, String s) {
        int[]  is = new int[26];

        for (char ch : s.toCharArray())
            is[ch - 'a']++;

        StringBuilder ans = new StringBuilder();

        for (char ch : order.toCharArray()){

            while (is[ch-'a'] != 0){
                ans.append(ch);
                is[ch-'a']--;
            }
        }

        for (int i=0;i<26;i++){
            char ch = (char) ('a' + i);
           while (is[i] != 0){
                ans.append(ch);
                is[ch-'a']--;
            }
        }

        return ans.toString();
    }
}