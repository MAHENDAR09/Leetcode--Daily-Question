class Solution {
    static List<List<String>> ans = new ArrayList<>();
    public List<List<String>> partition(String s) {
        
        ans.clear();
        helper(s,0,new ArrayList<String>());
        return ans;
    }

    public static void helper(String s, int idx,ArrayList<String> li){

        if (s.length() == idx){
            ans.add(new ArrayList<>(li));
            return;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = idx ;i < s.length();i++){
            sb.append(s.charAt(i));
            if (x.isPalindrome(sb.toString())){
                li.add(sb.toString());
                helper(s,i+1,li);
                li.remove(li.size()-1);
            }
        }
    }
}
class x {
    public static boolean isPalindrome(String s){
        int l = 0;
        int r = s.length() - 1;

        while (l<r){
            if (s.charAt(l) != s.charAt(r))
                return false;

            l++;
            r--;
        }
        return true;
    }
}