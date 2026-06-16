class Solution {
    public String processStr(String s) {

        StringBuilder ans = new StringBuilder();

        for (char ch : s.toCharArray()){

            if (ch >= 'a' && ch <= 'z'){
                ans.append(ch);
            }
            else if (ch == '*' && ans.length() != 0){
                ans.deleteCharAt(ans.length()-1);
            }
            else if(ch == '#' && ans.length() > 0){
                ans.append(ans);
            }
            else if(ch == '%' && ans.length() > 0){
                ans.reverse();
            }
        }
        return ans.toString();
    }
}