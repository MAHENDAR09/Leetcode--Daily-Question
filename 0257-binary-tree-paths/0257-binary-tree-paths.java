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
    public static List<String> ans = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        ans.clear();
        helper(root,new String());
        return ans;
    }
    public static void helper(TreeNode root,String path){

        if (root == null){
            path = path.substring(0,path.length()-2);
            System.out.println(path);
            ans.add(path);
            return;
        }
        path = path + (root.val);
        path = path + ("->");
        if (root.left != null && root.right != null){
            helper(root.left,path);
            helper(root.right,path);
        }
        else if (root.right == null){
            helper(root.left,path);
        }
        else if (root.left == null){
            helper(root.right,path);
        }
        
    }
}