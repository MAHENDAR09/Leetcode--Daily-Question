class Solution {
    public String largestNumber(int[] nums) {
        
        int n = nums.length;
        String d[] = new String[n];
        StringBuilder ans = new StringBuilder();

        for (int i=0;i<n;i++){
            d[i] = Integer.toString(nums[i]);
        }

        Arrays.sort(d, (a,b) -> (b+a).compareTo(a+b));

        if (d[0].equals("0"))
            return new String("0");

        for (String t : d)
            ans.append(t);

        
        return ans.toString();
    }
}