class Solution {
    public int sumRootToLeaf(TreeNode root) {
        return helper(root,0);
    }

    public static int  helper(TreeNode root,int curSum){

        if (root == null)
            return 0;
        if (root.left == null && root.right == null){
            return curSum * 2 + root.val;
        }
        
        curSum = curSum * 2 + root.val;

        return helper(root.left,curSum) + helper(root.right,curSum);
    }
}