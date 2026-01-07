 class x {
    
    static long maxSum = 0;
    public static long findSum(TreeNode root) {
        if (root == null)
            return 0;
        
        return root.val + findSum(root.left) + findSum(root.right);
    }
    public static long helper(TreeNode root,long totalSum) {
        if (root == null)
            return 0;

        long leftSum = helper(root.left,totalSum);
        long rightSum = helper(root.right,totalSum);

        long sum = root.val + leftSum + rightSum;

        maxSum = Math.max(maxSum, ((sum) * (totalSum-sum)));
        return sum;
    }
 }
class Solution {
    private static final long M = (long) 1e9 + 7;
    public int maxProduct(TreeNode root) {
        long sum = x.findSum(root);
        x.maxSum = 0;
        x.helper(root,sum);
        return (int) (x.maxSum%M);
    }
}