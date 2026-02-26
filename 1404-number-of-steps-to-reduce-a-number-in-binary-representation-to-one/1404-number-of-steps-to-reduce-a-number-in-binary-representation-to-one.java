class Solution {
    public int numSteps(String s) {
        StringBuilder sb = new StringBuilder(s);
        
        int cnt = 0;
        while (sb.length() > 1){

            int last = sb.length() - 1;

            if (sb.charAt(last) == '1' ){
                sb = addOne(sb);
                cnt++;
            }
            else {
                sb = sb.deleteCharAt(last);
                cnt++;
            }
        }
        return cnt;
    }
    public static StringBuilder addOne(StringBuilder s){

        int n = s.length() - 1;
        int carry = 1;
        

        for (int i=n;i>=0;i--){
            int sum = carry + (int) s.charAt(i) - '0';
           if (sum == 2) {
            s.setCharAt(i,'0');
           }
           else if (sum == 1){
            s.setCharAt(i,'1');
            carry = 0;
           }
        }

        if (carry == 1)
            s.insert(0, '1');
        return s;
    }
}

// 1110
// 100