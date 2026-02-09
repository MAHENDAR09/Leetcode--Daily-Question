class Solution {
    public static List <Integer> inOrder = new ArrayList<>();
    public static void inOrderTraversal(TreeNode root){
        if (root == null)
            return ;
        inOrderTraversal(root.left);
        inOrder.add(root.val);
        inOrderTraversal(root.right);

    }
    public TreeNode balanceBST(TreeNode root) {

        inOrder.clear();
        inOrderTraversal(root);
        return build(0,inOrder.size()-1);
    }

    public static TreeNode build(int low,int high){

        if (low > high)
            return null;

        int mid = (int) ((low+(high*1L)) / 2);

        TreeNode root = new TreeNode(inOrder.get(mid));

        root.left = build(low,mid-1);
        root.right = build(mid+1,high);
        return root;
        
    }
}