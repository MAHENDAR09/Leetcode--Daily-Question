class Solution {
    public String minRemoveToMakeValid(String s) {

        StringBuilder ans = new StringBuilder();
        int open = 0;

        for (char ch : s.toCharArray()){

            if (ch >= 'a' && ch <= 'z'){
                ans.append(ch);
            }
            else if (ch == '('){
                open++;
                ans.append('(');
            }
            else if (ch == ')' && open != 0){
                open--;
                ans.append(')');
            }
        }

        int close = 0;
        s = ans.reverse().toString();
        ans = new StringBuilder();

        for (char ch : s.toCharArray()){

            if (ch >= 'a' && ch <= 'z'){
                ans.append(ch);
            }
            else if (ch == '(' && close != 0){
                --close;
                ans.append('(');
            }
            else if (ch == ')'){
                ++close;
                ans.append(')');
            }
        }

        return ans.reverse().toString();
    }

    public static int count(String s, char c){

        return (int) s.chars()
                .mapToObj(e -> (char) e)
                .filter(e -> e == c)
                .count();
    }
}