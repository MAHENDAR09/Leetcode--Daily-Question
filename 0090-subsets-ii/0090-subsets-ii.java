class Solution {
    static List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        ans.clear();
        ans.add(new ArrayList<>());
        Arrays.sort(nums);
        helper(nums,0,new ArrayList<>());
        return ans;
    }
    public static void helper(int[] nums,int idx,ArrayList<Integer> li){

        if (idx == nums.length){
            return;
        }

        for (int i=idx;i<nums.length;i++){

            if (i > idx && nums[i] == nums[i-1])
                continue;

            li.add(nums[i]);
            ans.add(new ArrayList<>(li));
            helper(nums,i+1,li);
            li.remove(li.size()-1);
        }
    }
}