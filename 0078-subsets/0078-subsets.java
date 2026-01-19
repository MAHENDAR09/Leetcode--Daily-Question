class Solution {
    static List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        ans.clear();
        helper(nums,0,new ArrayList<Integer>());
        return ans;  
    }

    public static void helper(int nums[],int idx,ArrayList<Integer>li){

        if (idx == nums.length){
            ans.add(new ArrayList<>(li));
            return;
        }
        
        li.add(nums[idx]);
        helper(nums,idx+1,li);
        li.remove(li.size()-1);
        helper(nums,idx+1,li);
    }
}