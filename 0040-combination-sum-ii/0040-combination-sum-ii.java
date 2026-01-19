class Solution {
    static List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        ans.clear();
        Arrays.sort(candidates);
        helper(candidates,0,0,target,new ArrayList<>());
        return ans;
    }
    public static void helper(int[] nums,int idx,int sum,int target,ArrayList<Integer>li){

        if (sum == target){
            ans.add(new ArrayList<>(li));
            return;
        }

        if (idx == nums.length || sum > target){
            System.out.println(li);
            return;
        }

        for (int i=idx;i<nums.length;i++){

            if (i > idx && nums[i-1] == nums[i])
                continue;

            li.add(nums[i]);
            helper(nums,i+1,sum+nums[i],target,li);
            li.remove(li.size()-1);
        }


    }
}