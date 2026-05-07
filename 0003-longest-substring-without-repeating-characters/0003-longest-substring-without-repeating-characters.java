class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> hs = new HashSet<>();
        int maxLen = 0;
        int idx = 0;

        for (int i=0;i<s.length();i++){

            char ch = s.charAt(i);

            while (hs.contains(ch)){
                hs.remove(s.charAt(idx++));
            }

            hs.add(ch);
            maxLen = Math.max(maxLen,hs.size());
        }

        return maxLen;
    }
}