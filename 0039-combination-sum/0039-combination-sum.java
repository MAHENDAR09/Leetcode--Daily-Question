class Solution {
    private static List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        ans.clear();
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

        li.add(nums[idx]);
        sum += nums[idx];
        helper(nums,target,sum,idx,li);
        sum = sum - li.get(li.size()-1);
        li.remove(li.size()-1);
        helper(nums,target,sum,idx+1,li);

    }
}