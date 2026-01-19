class Solution {
    static List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {

        ans.clear();
        Arrays.sort(nums);
        boolean used[] = new boolean[nums.length];
        helper(nums,used,new ArrayList<>());
        return ans;
    }
    public static void helper(int nums[],boolean used[],ArrayList<Integer>li){

        if (li.size() == nums.length){
            ans.add(new ArrayList<>(li));
            return ;
        }

        for (int i=0;i<nums.length;i++){
            if (i > 0 && nums[i-1] == nums[i] && !used[i-1])
                continue;

            if (!used[i]){
                used[i] = true;
                li.add(nums[i]);
                helper(nums,used,li);
                used[i] = false;
                li.remove(li.size()-1);
            }
        }
    }
}