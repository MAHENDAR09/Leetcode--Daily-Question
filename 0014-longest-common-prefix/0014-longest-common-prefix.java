 class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans = "";
        String str = strs[0];
        for (int j=0;j<str.length();j++) {
            for (int i=1;i<strs.length;i++) {
                String s = strs[i];
                if (s.length() > j && s.charAt(j) == str.charAt(j));
                else return ans;
            }
            ans = ans + str.charAt(j)+"";
        }
        return ans;
    }
}