/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isBalanced(TreeNode root) {
        return checkBalance(root);
    }
    public static boolean checkBalance(TreeNode root){

        if (root == null)
            return true;

        int leftHeight = checkHeight(root.left);
        int rightHeight = checkHeight(root.right);

        return Math.abs(leftHeight - rightHeight) <= 1 && checkBalance(root.left) &&
            checkBalance(root.right);
    }
    public static int checkHeight (TreeNode root){

        if (root == null)
            return 0;

        return Math.max(checkHeight(root.left),checkHeight(root.right)) + 1;
    }
}


