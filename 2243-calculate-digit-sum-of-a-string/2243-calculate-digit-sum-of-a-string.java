class Solution {
    public String digitSum(String s, int k) {

        if (s.length() <= k)
            return s;

        StringBuilder ans = new StringBuilder(s);

        while (ans.length() > k){

            StringBuilder temp = new StringBuilder();
            int sum = 0;
            int cnt = 0;

            for (int i=0;i<ans.length();i++){

                sum = sum + (int) (ans.charAt(i) - '0');
                cnt++;
                
                if (cnt == k){
                    temp.append(sum);
                    sum = 0;
                    cnt = 0;
                }
            }

            if (sum != 0 || cnt != 0){
                temp.append(sum);
            }

            ans = temp;
        }

        return ans.toString();
    }
}