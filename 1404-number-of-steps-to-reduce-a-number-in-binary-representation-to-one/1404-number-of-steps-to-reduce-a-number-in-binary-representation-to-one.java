class Solution {
    public int numSteps(String s) {
        StringBuilder sb = new StringBuilder(s);
        
        int cnt = 0;
        while (sb.length() > 1){

            int last = sb.length() - 1;

            if (sb.charAt(last) == '1' ){
                sb = addOne(sb);
            }
            else {
                sb = sb.deleteCharAt(last);
            }
            cnt++;
        }
        return cnt;
    }
    public static StringBuilder addOne(StringBuilder s){

        for (int i=s.length()-1;i>=0;i--){
            
            if (s.charAt(i) == '0'){
                s.setCharAt(i,'1');
                return s;
            }
            else 
                s.setCharAt(i,'0');
        }
        s.insert(0, '1');
        return s;
    }
}