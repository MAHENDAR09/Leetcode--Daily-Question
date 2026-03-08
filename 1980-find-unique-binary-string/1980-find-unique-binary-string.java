import java.util.stream.*;
class Solution {
    public String findDifferentBinaryString(String[] nums) {

        HashSet<Integer> hs = new HashSet<>();

        int maxNum = Integer.parseInt(getNumber(nums[0].length(),'1'),2);

        for (String bin : nums){
            hs.add( Integer.parseInt(bin, 2) );
        }

        int ans = 0;
        
        for (int i = 0;i <= maxNum ; i++){
            if (! hs.contains(i)){
                ans = i;
                break;
            }
        }


        return fixAns(ans,nums[0].length());
    }
    // public static int convertToDecimal(String bin){

    //     int ans = 0;
    //     int idx = bin.length() - 1;

    //     while (idx >= 0){

    //         if (bin.charAt(idx) == '1')
    //             ans += (1<< (bin.length() - 1 -idx) );

    //         idx--;
    //     }
    //     return ans;
    // }
    public static String getNumber(int len,char ch){

        StringBuilder sb = new StringBuilder();

        while (len-->0)
            sb.append(ch);

        return sb.toString();
    }

    public String fixAns(int num,int len){

        StringBuilder ans = new StringBuilder(
        Integer.toBinaryString(num)
        );
        len = len - ans.length();
        
        while (len-->0){
            ans.insert(0,'0');
        }
        return ans.toString();
    }
}

