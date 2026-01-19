class Solution {
    static List<String> ans = new ArrayList<>();
    public List<String> restoreIpAddresses(String s) {

        ans.clear();
        if (s.length() < 4)
            return ans;

        helper(s,0,new ArrayList<String>());
        return ans;
    }

    public static void helper(String s,int idx,ArrayList<String> li){

        if (li.size() == 3 ){
            String part4 = s.substring(idx,s.length());
            if(checkValid(part4)){
                li.add(part4);
                ans.add(convertToString(li));
                li.remove(li.size()-1);
            }    
            return;
        }
        String part = "";
        for (int i=idx;i<s.length();i++){

            part += s.charAt(i);

            if (checkValid(part)){
                li.add(part);
                helper(s,i+1,li);
                li.remove(li.size()-1);
            } 
        }

    
    }
    public static boolean checkValid(String s){

    
        if (s.length() > 3 || s.trim().length() == 0)
            return false;
        
        if (s.length() > 1 && s.charAt(0) == '0'){
            return false;
        }
        int n = Integer.parseInt(s);
        return n <= 255;
    }
    public static String convertToString(ArrayList<String>li){
        
        StringBuilder ans = new StringBuilder();

        for (String s : li){
            ans.append(s);
            ans.append(".");
        }
        ans.deleteCharAt(ans.length()-1);
        return ans.toString();
    }
}
