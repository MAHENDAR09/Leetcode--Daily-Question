 class Solution {
    public String longestCommonPrefix(String[] s) {

        if (s.length == 1)
            return s[0];

        StringBuilder ans = new StringBuilder();

        for (int i=0;i<s[0].length();i++){

            char ch = s[0].charAt(i);

            for (int j=1;j<s.length;j++){

                if (s[j].length() > i && ch == s[j].charAt(i));
                else 
                    return ans.toString();
            }
            ans.append(ch);
        }
        return ans.toString();
    }
}