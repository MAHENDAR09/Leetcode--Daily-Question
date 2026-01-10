class Solution {
    private static List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        ans.clear();
        Arrays.sort(candidates);
        helper(candidates,target,0,0,new ArrayList<>());
        return ans;
    }

    public static void helper(int[] nums,int target,int sum,int idx,List<Integer>li){

        if (sum == target){
            ans.add(new ArrayList<>(li));
            return;
        }
        if (nums.length == idx || target < sum)
            return;

        for (int i=idx;i<nums.length;i++){

            if (i > idx && nums[i] == nums[i-1])
                continue;

            sum = sum + nums[i];
            li.add(nums[i]);
            helper(nums,target,sum,i+1,li);
            sum = sum - nums[i];
            li.remove(li.size()-1);
        }

    }
}