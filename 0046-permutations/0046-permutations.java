class Solution {
    public static List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {

        ans.clear();
        boolean used[] = new boolean [nums.length];
        helper(nums,used,new ArrayList<>());
        return ans;
    }
public static void helper(int[] nums,boolean[] used,ArrayList<Integer>li){

    if (li.size() == nums.length){
        ans.add(new ArrayList<>(li));
        return;
    }

    for (int i=0;i<nums.length;i++){

        if (used[i] == false){
            used[i] = true;
            li.add(nums[i]);
            helper(nums,used,li);
            li.remove(li.size()-1);
            used[i] = false;
        }
    }
    }
}