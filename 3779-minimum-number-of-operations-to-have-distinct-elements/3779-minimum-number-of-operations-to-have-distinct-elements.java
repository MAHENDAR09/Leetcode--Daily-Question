class Solution {
    public int minOperations(int[] nums) {

        int tracker[] = new int[100000+1];

        for (int i=nums.length-1;i>=0;i--){
            int key = nums[i];
            if (tracker[key] == 1){
                System.out.println(i);
                return i/3 + 1;
            }
            tracker[key] = 1;
        }
        return 0;
    }
}