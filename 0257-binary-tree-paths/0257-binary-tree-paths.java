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
    static List<String> ans = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        ans.clear();
        helper(root,new StringBuilder());
        return ans;
    }
    public static void helper(TreeNode root,StringBuilder path){

        if (root == null){
            path.setLength(path.length()-2);
            System.out.println(path);
            ans.add(new String(path.toString()));
            return;
        }
        int len = path.length();
        path.append(root.val);
        path.append("->");
        if (root.left != null && root.right != null){
            helper(root.left,path);
            // path.setLength(len);
            helper(root.right,path);
            // path.setLength(len);
        }
        else if (root.right == null){
            helper(root.left,path);
            // path.setLength(len);
        }
        else if (root.left == null){
            helper(root.right,path);
            // path.setLength(len);
        }
        path.setLength(len);
    }
}